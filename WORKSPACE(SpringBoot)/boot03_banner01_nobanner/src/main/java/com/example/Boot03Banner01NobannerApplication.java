package com.example;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot03Banner01NobannerApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Boot03Banner01NobannerApplication.class);
		
		app.setBannerMode(Banner.Mode.OFF); //실행시 배너 삭제
		app.run(args);
	}

}
