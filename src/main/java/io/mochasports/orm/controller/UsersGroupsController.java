package io.mochasports.orm.controller;

import io.mochasports.orm.domain.UsersGroups;
import io.mochasports.orm.dto.UsersGroupsDTO;
import io.mochasports.orm.service.UsersGroupsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.naming.InvalidNameException;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class UsersGroupsController {

    private final UsersGroupsService usersGroupsService;

    @PostMapping("/users-groups")
    public ResponseEntity<UsersGroups> save(@RequestBody UsersGroupsDTO request) throws InvalidNameException {
        UsersGroups usersGroups = usersGroupsService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(usersGroups);
    }

    @GetMapping("/users-groups")
    public ResponseEntity<List<UsersGroups>> getList(){
        List<UsersGroups> usersGroups = usersGroupsService.getList();
        return ResponseEntity.ok().body(usersGroups);
    }

    @GetMapping("/users-groups/{id}")
    public ResponseEntity<UsersGroups> getOne(@PathVariable Long id){
        UsersGroups usersGroups = usersGroupsService.findById(id);
        return ResponseEntity.ok().body(usersGroups);
    }

    @PutMapping("/users-groups/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody UsersGroupsDTO request) throws InvalidNameException {
        request.setId(id);

        UsersGroups usersGroups = usersGroupsService.save(request);
        return ResponseEntity.ok().body(usersGroups);
    }

    @DeleteMapping("/users-groups/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        usersGroupsService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
