package com.parag.filecompress.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.parag.filecompress.util.CompressUtil;

@RestController
public class CompressionController {
	
	@GetMapping("/compress/inputDir/{inputDir}/outputDir/{outputDir}/maxSize/{maxSize}")
	public void compressFile(@RequestParam String inputDir, 
			@RequestParam String outputDir, @RequestParam String maxSize) {
		try {
			CompressUtil.compress(inputDir, outputDir, maxSize);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@GetMapping("/compress/inputDir/{zipFilePath}/outputDir/{outputDir}/maxSize/{maxSize}")
	public void deCompressFile(@RequestParam String zipFilePath,@RequestParam String outputDir) throws IOException {
		CompressUtil.unzip(zipFilePath, outputDir);
	}

}
