package com.jiratool.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jiratool.entity.MasterDesignationTable;
import com.jiratool.repo.MasterDesignationTableRepository;

@Service
public class MasterDesignationTableService {
	
	private final MasterDesignationTableRepository masterDesignationTableRepository;
	
	public MasterDesignationTableService(MasterDesignationTableRepository masterDesignationTableRepository) {
		this.masterDesignationTableRepository = masterDesignationTableRepository;
	}

	public List<MasterDesignationTable> getAllDesignations() {
		return masterDesignationTableRepository.findAll();
	}
}
