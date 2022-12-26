package io.mochasports.orm.controller;

import io.mochasports.orm.domain.Users;
import io.mochasports.orm.dto.UsersDTO;
import io.mochasports.orm.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UsersController {

    private final UsersService usersService;

    @PostMapping("/users")
    public ResponseEntity<Users> save(@RequestBody UsersDTO request){
        Users users = usersService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(users);
    }

    @GetMapping("/users")
    public ResponseEntity<List<Users>> getList(){
        List<Users> users = usersService.getList();
        return ResponseEntity.ok().body(users);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<Users> getOne(@PathVariable Long id){
        Users users = usersService.findById(id);
        return ResponseEntity.ok().body(users);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody UsersDTO request){
        request.setId(id);

        Users users = usersService.save(request);
        return ResponseEntity.ok().body(users);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        usersService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
