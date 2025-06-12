package com.jiratool.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/upload")
public class FileUploadController {
	private static final String uploadFile = "D:/reactUploadImg/";

	@PostMapping("/image")
	public ResponseEntity<String> uploadImages(@RequestParam("files") MultipartFile[] files) {
		StringBuilder sb = new StringBuilder();
		for (MultipartFile file : files) {
			File destination = new File(uploadFile + file.getOriginalFilename());
			try {
				file.transferTo(destination);
				sb.append("uploaded:").append(file.getOriginalFilename()).append("\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				sb.append("Failed to upload:").append(file.getOriginalFilename()).append("\n");
				e.printStackTrace();
			}
		}
		return ResponseEntity.status(HttpStatus.OK).body(sb.toString());
	}
}
