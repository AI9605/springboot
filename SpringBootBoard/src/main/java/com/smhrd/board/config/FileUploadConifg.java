package com.smhrd.board.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

// 환경 설정 클래스 파일 
@Configuration
public class FileUploadConifg {
	
	// application.properties 에 있는 file.upload-dir 를 참고 
	@Value("${file.upload-dir}") 
	private String uploadDir; // C:/Upload 라는 폴더 
	
	public String getUploadDir() {
		return this.uploadDir;
	}
}

// FileUploadConfig -> 경로 변수 