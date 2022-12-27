package io.mochasports.orm.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @JsonManagedReference
    @OneToMany(
        mappedBy = "groups",
        fetch = FetchType.LAZY,
        cascade = { CascadeType.ALL }
    )
    private List<Users> users = new ArrayList<>();

}
