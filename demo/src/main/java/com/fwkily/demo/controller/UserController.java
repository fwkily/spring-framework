package com.fwkily.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fuwk
 * @Description:
 * @Date: 10:06 2022/2/11
 */
@RestController
public class UserController {


	@GetMapping("/test")
	public String test(){
		return "哈哈哈！";
	}

}
