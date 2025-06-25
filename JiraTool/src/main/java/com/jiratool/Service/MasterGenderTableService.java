package com.jiratool.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jiratool.entity.MasterGenderTable;
import com.jiratool.repo.MasterGenderTableRepository;

@Service
public class MasterGenderTableService {

	
	private final MasterGenderTableRepository masterGenderTableRepository;

	public MasterGenderTableService(MasterGenderTableRepository masterGenderTableRepository) {
		this.masterGenderTableRepository = masterGenderTableRepository;
	}
	public List<MasterGenderTable> getAllGenders() {
		return masterGenderTableRepository.findAll();
	}
}
