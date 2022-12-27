package io.mochasports.orm.controller;

import io.mochasports.orm.domain.Groups;
import io.mochasports.orm.dto.GroupsDTO;
import io.mochasports.orm.service.GroupsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class GroupsController {

    private final GroupsService groupsService;

    @PostMapping("/groups")
    public ResponseEntity<Groups> save(@RequestBody GroupsDTO request){
        Groups groups = groupsService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(groups);
    }

    @GetMapping("/groups")
    public ResponseEntity<List<Groups>> getList(){
        List<Groups> groups = groupsService.getList();
        return ResponseEntity.ok().body(groups);
    }

    @GetMapping("/groups/{id}")
    public ResponseEntity<Groups> getOne(@PathVariable Long id){
        Groups groups = groupsService.findById(id);
        return ResponseEntity.ok().body(groups);
    }

    @PutMapping("/groups/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody GroupsDTO request){
        request.setId(id);

        Groups groups = groupsService.save(request);
        return ResponseEntity.ok().body(groups);
    }

    @DeleteMapping("/groups/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        groupsService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
