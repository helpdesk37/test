package com.jiratool.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jiratool.entity.MasterDepartmentTable;
import com.jiratool.repo.MasterDepartmentTableRepository;

@Service
public class MasterDepartmentTableService {

	private final MasterDepartmentTableRepository masterDepartmentTableRepository;
	public MasterDepartmentTableService(MasterDepartmentTableRepository masterDepartmentTableRepository) {
		this.masterDepartmentTableRepository = masterDepartmentTableRepository;
	}
	public List<MasterDepartmentTable> getAllDepartments(){
		return masterDepartmentTableRepository.findAll();
	}
}
