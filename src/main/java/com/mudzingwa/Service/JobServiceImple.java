package com.mudzingwa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mudzingwa.Student.Job;
import com.mudzingwa.StudentRepo.Jobrepository;
@Service
public class JobServiceImple implements JobServiceInterf {
private Jobrepository repository;

      @Autowired
	public JobServiceImple(Jobrepository repository) {
	super();
	this.repository = repository;
}

	@Override
	public List<Job> findAll() {
		
		return repository.findAll();
	}

	@Override
	public Job getJobById(Integer id) {
		
		return repository.findById(id).get();
	}

	@Override
	public void deleteById(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public Job updateById(Job job) {
		
		return repository.save(job);
	}

	@Override
	public Job saveJob(Job job) {
		
		return repository.save(job);
	}

}
