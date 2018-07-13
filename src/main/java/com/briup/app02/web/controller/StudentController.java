package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Student;
import com.briup.app02.service.IStudentService;
import com.briup.app02.util.MsgResponse;

import ch.qos.logback.core.db.dialect.MsSQLDialect;

@RestController
@RequestMapping("/student")
public class StudentController {
	//注入studentService的实例
	@Autowired
	private IStudentService studentService;
	@GetMapping("findAllStudent")
	public MsgResponse findAllStudent(){
		try {
			List<Student> list = studentService.findAll();
			return MsgResponse.success("查找成功", list);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
		
	}
	@GetMapping("findStudentById")
	public Student findStudentById(long id){
		try{
		Student student = studentService.findById(id);
		return student;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	@GetMapping("deleteStudentById")
	public MsgResponse deleteById(long id){
		try {
			studentService.deleteById(id);
			return MsgResponse.success("删除成功", null);
		} catch (Exception e) {
			return MsgResponse.error(e.getMessage());
		}
	}
}
