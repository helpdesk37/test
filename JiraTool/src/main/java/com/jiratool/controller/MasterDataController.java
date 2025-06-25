package com.jiratool.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiratool.Service.MasterDepartmentTableService;
import com.jiratool.Service.MasterDesignationTableService;
import com.jiratool.Service.MasterGenderTableService;
import com.jiratool.Service.MasterStatusTableService;
import com.jiratool.entity.MasterDepartmentTable;
import com.jiratool.entity.MasterDesignationTable;
import com.jiratool.entity.MasterGenderTable;
import com.jiratool.entity.MasterStatusTable;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/master")
public class MasterDataController {

	private final MasterGenderTableService masterGenderTableService;
	private final MasterDepartmentTableService masterDepartmentTableService;
	private final MasterDesignationTableService masterDesignationTableService;
	private final MasterStatusTableService masterStatusTableService;
	public MasterDataController(MasterGenderTableService masterGenderTableService,MasterDepartmentTableService masterDepartmentTableService,MasterDesignationTableService masterDesignationTableService,MasterStatusTableService masterStatusTableService) {
		this.masterGenderTableService = masterGenderTableService;
		this.masterDepartmentTableService=masterDepartmentTableService;
		this.masterDesignationTableService=masterDesignationTableService;
		this.masterStatusTableService=masterStatusTableService;
	}
	
	@GetMapping("/gender")
	public ResponseEntity<List<MasterGenderTable>> getAllGenders(){
		return ResponseEntity.ok(masterGenderTableService.getAllGenders());
	}
	
	@GetMapping("/department")
	public ResponseEntity<List<MasterDepartmentTable>> getAllDepartments(){
		return ResponseEntity.ok(masterDepartmentTableService.getAllDepartments());
	}
	
	@GetMapping("/designation")
	public ResponseEntity<List<MasterDesignationTable>> getAllDesignations(){
		return ResponseEntity.ok(masterDesignationTableService.getAllDesignations());
	}
	
	@GetMapping("/status")
	public ResponseEntity<List<MasterStatusTable>> getAllStatus(){
		return ResponseEntity.ok(masterStatusTableService.getAllStatus());
	}
}
