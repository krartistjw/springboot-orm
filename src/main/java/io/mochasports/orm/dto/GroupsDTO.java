package io.mochasports.orm.dto;

import io.mochasports.orm.domain.Users;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class GroupsDTO {

    private Long id;

    private String name;

    private List<Users> users = new ArrayList<>();

}
