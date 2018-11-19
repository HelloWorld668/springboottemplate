package com.xc.springboottemplate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableJpaAuditing
@MapperScan("com.xc.springboottemplate.repository.mapper")
public class SpringboottemplateApplicationTests {

	@Test
	public void contextLoads() {
	}

}
