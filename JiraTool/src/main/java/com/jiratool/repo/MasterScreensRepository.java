package com.jiratool.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiratool.entity.Screen;

public interface MasterScreensRepository extends JpaRepository<Screen, Long> {

}
