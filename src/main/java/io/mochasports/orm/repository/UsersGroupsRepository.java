package io.mochasports.orm.repository;

import io.mochasports.orm.domain.Groups;
import io.mochasports.orm.domain.Users;
import io.mochasports.orm.domain.UsersGroups;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersGroupsRepository extends JpaRepository<UsersGroups, Long> {

    boolean existsByGroupsAndUsers(Groups groups, Users users);

}
