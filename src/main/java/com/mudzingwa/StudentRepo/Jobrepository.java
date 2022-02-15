package com.mudzingwa.StudentRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mudzingwa.Student.Job;
@Repository
public interface Jobrepository extends JpaRepository<Job, Integer> {

}
