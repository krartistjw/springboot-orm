package io.mochasports.orm.domain;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String mobile;

    @OneToMany(
            mappedBy = "users",
            fetch = FetchType.LAZY,
            cascade = { CascadeType.PERSIST }
    )
    @JsonIdentityReference(alwaysAsId = true)
    private List<UsersGroups> usersGroups = new ArrayList<>();

}
