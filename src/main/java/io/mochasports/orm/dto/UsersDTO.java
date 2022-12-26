package io.mochasports.orm.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsersDTO {

    private Long id;

    private String name;

    private String email;

    private String mobile;

}
