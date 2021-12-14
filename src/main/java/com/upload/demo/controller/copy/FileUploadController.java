package com.upload.demo.controller.copy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {

	public static String uploadDirectory = System.getProperty("user.dir") + "/uploads";

	@PostMapping("/upload")
	public String uploadPhoto(Model model, @RequestParam("image") MultipartFile[] multipartFile) throws IOException {
		for (MultipartFile file : multipartFile) {

			Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
			Files.write(fileNameAndPath, file.getBytes());
		}

		return "Upload Successfully !";
	}

}
