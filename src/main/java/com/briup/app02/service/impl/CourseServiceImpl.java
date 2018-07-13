package com.briup.app02.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Course;
import com.briup.app02.dao.CourseMapper;
import com.briup.app02.service.ICourseService;

@Service
public class CourseServiceImpl implements ICourseService {
	@Autowired
	private CourseMapper courseMapper;
	@Override
	public Course findByCourseNumber(int courseNumber) throws Exception {
		return courseMapper.findByCourseNumber(courseNumber);
	}
	@Override
	
	public void insertOfCourse(Course course) throws Exception{
		courseMapper.insertOfCourse(course);
	}

	

}
