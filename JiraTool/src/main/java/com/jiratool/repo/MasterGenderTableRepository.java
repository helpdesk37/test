package com.jiratool.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jiratool.entity.MasterGenderTable;

@Repository
public interface MasterGenderTableRepository extends JpaRepository<MasterGenderTable,Long> {

}
