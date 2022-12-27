package io.mochasports.orm.dto;

import io.mochasports.orm.domain.Users;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class GroupsDTO {

    private Long id;

    private String name;

    private Set<Users> users = new HashSet<>();

}
