package com.fwkily.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: fuwk
 * @Description:
 * @Date: 11:12 2022/2/10
 */
@Component
public class UserService {

//	@Autowired
//	private AdminB adminB;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private UserService userService;

//	@PostConstruct
//	public void a(){
//		admin = new Admin();
//		admin.setName("1");
//		admin.setPsw("2");
//		System.out.println(admin);
//	}
//
//	@Override
//	public void afterPropertiesSet() {
//		admin = new Admin();
//		admin.setName("aaa");
//		admin.setPsw("12345");
//		System.out.println(admin);
//
//	}


//	public UserService() {
//		System.out.println(0);
//	}

//	public UserService(AdminB adminB){
//		this.adminB = adminB;
//		System.out.println(1);
//	}
//
//	@Autowired
//	public UserService(AdminB adminB,AdminB adminB1){
//		System.out.println("--------------");
//		System.out.println(adminB);
//		System.out.println(adminB1);
//		System.out.println("--------------");
//		this.adminB = adminB1;
//		System.out.println(2);
//	}

	@Transactional
	public void test(){
//		System.out.println(adminB);
		jdbcTemplate.execute("INSERT INTO sipm.mas_seckill_stock\n" +
				"(id, account, activity_code, activity_type, create_time, last_update_tme, order_sn, org_code, spu_code)\n" +
				"VALUES(2, '1', '1', '1', '2022-02-10 09:22:52', '2022-02-10 09:22:52', '2', '2', '2');\n");
		//这里的userService使用的是代理对象（@Transactional底层是aop实现，使用了代理），所以会执行回滚等增强逻辑，如果不加，直接使用new UserService().a()则不会抛出异常 ，两条数据都插入成功
		//解决方案：使用自己依赖自己，使用的是代理对象执行a();
		userService.a();
	}

	@Transactional(propagation = Propagation.NEVER)
	public void a(){
//		System.out.println(adminB);
		jdbcTemplate.execute("INSERT INTO sipm.mas_seckill_stock\n" +
				"(id, account, activity_code, activity_type, create_time, last_update_tme, order_sn, org_code, spu_code)\n" +
				"VALUES(3, '1', '1', '1', '2022-02-10 09:22:52', '2022-02-10 09:22:52', '3', '3', '3');\n");
	}


}
