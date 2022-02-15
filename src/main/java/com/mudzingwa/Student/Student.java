package com.mudzingwa.Student;

import java.util.List;
import java.util.Objects;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="studid")
    private Integer studid;
	@Column(name="college")
     private String college;
	@Column(name="studname")
	private String studentname;
	@Column(name="lname")
	private String lastname;
	@Autowired
	@Column(name="job")
	@OneToMany()
	private Job job;
	@Column(name="sex")
	private String sex;
	@ElementCollection
	@CollectionTable(name="coursetab",joinColumns=@JoinColumn(name="studid"))
	@Column(name="courses")
	private List<String>courses;
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	@Override
	public int hashCode() {
		return Objects.hash(college, courses, job, lastname, sex, studentname, studid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(college, other.college) && Objects.equals(courses, other.courses)
				&& Objects.equals(job, other.job) && Objects.equals(lastname, other.lastname)
				&& Objects.equals(sex, other.sex) && Objects.equals(studentname, other.studentname)
				&& Objects.equals(studid, other.studid);
	}
	@Override
	public String toString() {
		System.out.println("ID\t\tCOLLEGE\t\tSTUDENTNAME\t\tLASTNAME\t\tSEX\t\tCOURSES");
		return "[" + studid + ", \t" + college + ",\t" + studentname + ", \t"
				+ lastname + ",\t" + job + ",\t" + sex + ",\t" + courses + "\n";
	}
	
	
}
