package com.mudzingwa.Controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mudzingwa.Service.StudentServiceInterface;
import com.mudzingwa.Student.Student;



@RestController
public class StudentController {
	private StudentServiceInterface service;
     @Autowired
	public StudentController(StudentServiceInterface service) {
	this.service = service;
	}
	
     @GetMapping("/findStudent/{id}")
	public Student getStudent(@PathVariable Integer id) {
    	 return service.findById(id);
			}
     @GetMapping("/findAll")
     public List<Student>findall(){
    	 return service.findAll();
     }
     @PostMapping("/save")
     public Student saveStudent(@RequestBody Student st) {
    	 return service.saveStudent(st);
     }
     @DeleteMapping("/delete/{id}")
     public void DeleteStudent(@PathVariable Integer id) {
        	 
     }
public Student updateStudent(@PathVariable Integer id,@RequestBody Student st) {
	return service.UpdateStuden(id, st);
}
}
