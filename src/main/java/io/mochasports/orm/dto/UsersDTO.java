package io.mochasports.orm.dto;

import io.mochasports.orm.domain.UsersGroups;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class UsersDTO {

    private Long id;

    private String name;

    private String email;

    private String mobile;

    private List<UsersGroups> usersGroups = new ArrayList<>();

}
