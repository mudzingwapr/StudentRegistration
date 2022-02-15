package com.mudzingwa.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mudzingwa.Service.JobServiceInterf;
import com.mudzingwa.Student.Job;
@Controller
public class JobController {
	
	private JobServiceInterf service;
	
      @Autowired
	public JobController(JobServiceInterf service) {
		super();
		this.service = service;
	}

      @PostMapping("/save")
      public Job saveJob(@RequestBody Job job) {
    	  return service.saveJob(job);
      }
      @GetMapping("/findAll")
      public List<Job> getAll(){
    	  return service.findAll();
      }
      @PutMapping("/update")
      public Job updateJob(Job job) {
    	  return service.updateById(job);
      }
      
      public void DeleteById(Integer id) {
    	  service.equals(id);
    	  
      }
      
}
