package io.mochasports.orm.repository;

import io.mochasports.orm.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {

}
