package io.mochasports.orm.domain;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import javax.persistence.*;
import java.util.*;


@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Groups {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(
        mappedBy = "groups",
        fetch = FetchType.LAZY,
        cascade = { CascadeType.PERSIST }
    )
    @JsonIdentityReference(alwaysAsId = true)
    private List<UsersGroups> usersGroups = new ArrayList<>();

}
