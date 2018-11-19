    package com.xc.springboottemplate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@MapperScan("com.xc.springboottemplate.repository.mapper")
public class SpringboottemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringboottemplateApplication.class, args);
	}
}
