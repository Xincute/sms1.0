package com.briup.app02.service;

import com.briup.app02.bean.Course;

public interface ICourseService {
	 Course findByCourseNumber(int courseNumber) throws Exception;

	void insertOfCourse(Course course) throws Exception;

	
}
