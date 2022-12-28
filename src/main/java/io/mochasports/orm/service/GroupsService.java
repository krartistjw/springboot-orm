package io.mochasports.orm.service;

import io.mochasports.orm.domain.Groups;
import io.mochasports.orm.dto.GroupsDTO;
import io.mochasports.orm.repository.GroupsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GroupsService {

    private final GroupsRepository groupsRepository;

    public Groups save(GroupsDTO request){
        Groups groups = Groups.builder()
                .id(request.getId())
                .name(request.getName())
                .usersGroups(request.getUsersGroups())
                .build();

        return groupsRepository.save(groups);
    }

    public List<Groups> getList(){
        return groupsRepository.findAll();
    }

    public Groups findById(Long id) {
        return groupsRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        groupsRepository.deleteById(id);
    }

}
