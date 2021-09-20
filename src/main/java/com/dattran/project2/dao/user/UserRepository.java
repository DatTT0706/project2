package com.dattran.project2.dao.user;

import com.dattran.project2.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
