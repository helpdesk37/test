package com.jiratool.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jiratool.entity.UserLogin;

@Repository
public interface UserProfileRepository extends JpaRepository<UserLogin, Long> {

}
