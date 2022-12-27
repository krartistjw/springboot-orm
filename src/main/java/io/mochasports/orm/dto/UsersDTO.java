package io.mochasports.orm.dto;

import io.mochasports.orm.domain.Groups;
import io.mochasports.orm.domain.Users;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class UsersDTO {

    private Long id;

    private String name;

    private String email;

    private String mobile;

    private Groups groups;

}
