package com.briup.app02.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 路由器的命名空间
 * http://127.0.0.1:8080 可以访问到当前项目
 * http://127.0.0.1:8080/test 可以访问到当前项目TestController这个类
 * http://127.0.0.1:8080/test/hello 可以访问到hello这个函数
 * @author CJIAJUN
 *
 */
@RestController
@RequestMapping("/test")
public class TestController {
	@GetMapping("hello")
	public String hello(){
		return "Hello world";
	}
}
