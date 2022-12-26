package io.mochasports.orm.service;

import io.mochasports.orm.domain.Users;
import io.mochasports.orm.dto.UsersDTO;
import io.mochasports.orm.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UsersService {

    private final UsersRepository usersRepository;

    public Users save(UsersDTO request){
        Users users = Users.builder()
                .id(request.getId())
                .name(request.getName())
                .email(request.getEmail())
                .mobile(request.getMobile())
                .build();

        return usersRepository.save(users);
    }

    public List<Users> getList(){
        return usersRepository.findAll();
    }

    public Users findById(Long id) {
        return usersRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        usersRepository.deleteById(id);
    }

}
