package com.demo.PureTicket.repository;

import com.demo.PureTicket.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String user_email);
}
