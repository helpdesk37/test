package com.jiratool.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jiratool.entity.UserLogin;

@Repository
public interface UserRepository extends JpaRepository<UserLogin, Long> {

	Optional<UserLogin>findByUserName(String userName);
}
