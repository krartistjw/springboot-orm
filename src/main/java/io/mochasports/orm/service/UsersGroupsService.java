package io.mochasports.orm.service;

import io.mochasports.orm.domain.UsersGroups;
import io.mochasports.orm.dto.UsersGroupsDTO;
import io.mochasports.orm.repository.UsersGroupsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.naming.InvalidNameException;
import java.util.List;


@RequiredArgsConstructor
@Service
public class UsersGroupsService {

    private final UsersGroupsRepository usersGroupsRepository;

    public UsersGroups save(UsersGroupsDTO request) throws InvalidNameException {

        // 같은 사용자 아이디와 그룹 아이디로 저장된 값이 있는지 확인
        boolean isUsersGroups = usersGroupsRepository.existsByGroupsAndUsers(request.getGroups(), request.getUsers());

        if(isUsersGroups){
            throw new InvalidNameException("already exists");
        }

        UsersGroups usersGroups = UsersGroups.builder()
                .id(request.getId())
                .users(request.getUsers())
                .groups(request.getGroups())
                .build();

        return usersGroupsRepository.save(usersGroups);
    }

    public List<UsersGroups> getList(){
        return usersGroupsRepository.findAll();
    }

    public UsersGroups findById(Long id) {
        return usersGroupsRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        usersGroupsRepository.deleteById(id);
    }

}
