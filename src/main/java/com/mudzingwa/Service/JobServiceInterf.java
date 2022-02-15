package com.mudzingwa.Service;

import java.util.List;

import com.mudzingwa.Student.Job;

public interface JobServiceInterf {
	public Job saveJob(Job job);
	public List<Job> findAll();
	public Job getJobById(Integer id);
	public void deleteById(Integer id);
	public Job updateById(Job job);

}
