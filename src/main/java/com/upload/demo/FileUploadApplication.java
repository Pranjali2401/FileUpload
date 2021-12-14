package com.upload.demo;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.upload.demo.controller.copy.FileUploadController;

@SpringBootApplication
public class FileUploadApplication {
	

	public static void main(String[] args) {
		new File(FileUploadController.uploadDirectory).mkdir();
		SpringApplication.run(FileUploadApplication.class, args);
	}

}
