package com.mudzingwa.StudentRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mudzingwa.Student.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
