package com.fwkily.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @Author: fuwk
 * @Description:
 * @Date: 15:42 2022/1/24
 */
@Configuration
@ComponentScan("com.fwkily")
@EnableTransactionManagement
public class AppConfig {


	@Bean
	public JdbcTemplate jdbcTemplate(){
		return new JdbcTemplate(dataSource());
	}


	@Bean
	public PlatformTransactionManager platformTransactionManager(){
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(dataSource());
		return transactionManager;
	}

	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3307/sipm?useUnicode=true&characterEncoding=UTF-8&readOnlyPropagatesToServer=false&useSSL=false");
		dataSource.setUsername("sipm_user");
		dataSource.setPassword("GGTibbivfft%^*HO");
		return dataSource;
	}

//	@Bean
//	public UserService userService(){
//		return new UserService();
//	}

//	@Bean
//	public AdminB adminB(){
//		AdminB adminB = new AdminB();
//		System.out.println(adminB);
//		return adminB;
//	}
//
//	@Bean
//	public AdminB adminB1(){
//		AdminB adminB1 = new AdminB();
//		System.out.println(adminB1);
//		return adminB1;
//	}

}
