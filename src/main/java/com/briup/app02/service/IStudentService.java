package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Student;

public interface IStudentService {
	List<Student> findAll() throws Exception;
	
	Student findById(long id) throws Exception;
	void deleteById(long id) throws Exception;
}
