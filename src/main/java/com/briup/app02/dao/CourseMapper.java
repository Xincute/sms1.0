package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Course;
import com.briup.app02.bean.Student;

public interface CourseMapper {
	Course findByCourseNumber(int courseNumber);
	void insertOfCourse(Course course);
	
}
