package io.mochasports.orm.dto;

import io.mochasports.orm.domain.Groups;
import io.mochasports.orm.domain.Users;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsersGroupsDTO {

    private Long id;

    private Groups groups;

    private Users users;

}
