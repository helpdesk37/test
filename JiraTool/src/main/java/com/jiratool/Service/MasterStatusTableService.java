package com.jiratool.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jiratool.entity.MasterStatusTable;
import com.jiratool.repo.MasterStatusTableRepository;

@Service
public class MasterStatusTableService {

	private final MasterStatusTableRepository masterStatusTableRepository;
	public MasterStatusTableService(MasterStatusTableRepository masterStatusTableRepository) {
		this.masterStatusTableRepository=masterStatusTableRepository;
	}
	public List<MasterStatusTable> getAllStatus() {
		return masterStatusTableRepository.findAll();
	}
}
