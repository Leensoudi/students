package projectBegginer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student  {
	Scanner  scanner = new Scanner(System.in);
	
	private String name, gender, contactDetail;
	private int age,id;
	
	private Map<String,Double> courses=new HashMap<>();
	
	
	public Map<String, Double> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, Double> courses) {
		this.courses = courses;
	}

	public Student(String name, String gender, String contactDetail, int age,int id) {
		this.name = name;
		this.gender = gender;
		this.contactDetail = contactDetail;
		this.age = age;
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactDetail() {
		return contactDetail;
	}

	public void setContactDetail(String contactDetail) {
		this.contactDetail = contactDetail;
	}

	public int getAge() {
		
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student() {
		name="";
		age=0;
		contactDetail="";
		gender="";
		id=0;
		
	}
	

	
	
	
	
	
	

}
