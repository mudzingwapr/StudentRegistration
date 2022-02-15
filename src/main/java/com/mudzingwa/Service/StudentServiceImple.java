package com.mudzingwa.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mudzingwa.Student.Student;
import com.mudzingwa.StudentRepo.StudentRepo;
@Service
public class StudentServiceImple implements StudentServiceInterface {
private StudentRepo  repository;
	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
  @Autowired
	public StudentServiceImple(StudentRepo repository) {
				this.repository = repository;
	}

	@Override
	public Student saveStudent(Student st) {
		
		return repository.save(st);
	}

	@Override
	public Student findById(Integer id) {
		
		return repository.findById(id).get();
	}

	@Override
	public void deleteStudent(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public Student UpdateStuden(Integer id, Student st) {
		
		
		
			return repository.save(st);
	}

}
