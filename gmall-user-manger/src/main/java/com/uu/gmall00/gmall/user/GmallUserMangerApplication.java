package com.uu.gmall00.gmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 核心启动类@SpringBootApplication
 */
@SpringBootApplication
@MapperScan(basePackages = "com.uu.gmall00.gmall.user.mapper") //mapper的扫描范围
public class GmallUserMangerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallUserMangerApplication.class, args);
	}

}
