package com.mudzingwa.Service;

import java.util.List;

import com.mudzingwa.Student.Student;

public interface StudentServiceInterface {
	public List<Student> findAll();
	public Student saveStudent(Student st);
	public Student findById(Integer id);
	public void deleteStudent(Integer id);
	public Student UpdateStuden(Integer id,Student st);

}
