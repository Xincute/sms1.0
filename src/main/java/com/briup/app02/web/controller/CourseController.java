package com.briup.app02.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.briup.app02.bean.Course;
import com.briup.app02.service.ICourseService;

@RestControllerAdvice
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private ICourseService courseService;
	@GetMapping("findStudentByCourseNumber")
	public Course findStudentByCourseNumber(int courseNumber){
		try{
		Course c = courseService.findByCourseNumber(courseNumber);
		return c;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
	 }
	@GetMapping("insertOfCourse")
	public String insertOfCourse(Course course){
		try{
			courseService.insertOfCourse(course);
			return "插入成功";
		}catch(Exception e){
			e.printStackTrace();
			return "插入失败";
		}
	}
}
