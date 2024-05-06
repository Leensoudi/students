package projectBegginer;

import java.util.Scanner;
import java.util.Set;

public class Registration {
	Scanner  scanner = new Scanner(System.in);
	public void viewStudent(Set<Student>studentSet,int id)
	{
		for(Student student:studentSet)
		{
			if(student.getId()==id)
			{
				System.out.println("student's id is: "+student.getId() );
				System.out.println("student's name is:"  +student.getName());
				System.out.println("student's contactDetail is:"  +student.getContactDetail());
				System.out.println("student's gender is:   "+student.getGender());
				System.out.println("student's age is:  " + student.getAge());
				return;
			}
		}System.err.println("this student isnt exist!");
		
	}
	
	
	public void addStudent(Set<Student> studentSet)
	{
		System.out.println(" enter student's id: ");
		int id = scanner.nextInt();
		for(Student student:studentSet)
		{
			if(student.getId() == id)
			{
				System.err.println("student id does exist! \n enter another id:");
				id=scanner.nextInt();
			}
		}
		
		System.out.println(" enter student's Name: ");
		String name = scanner.next();
		
		System.out.println(" enter student's age: ");
		int age = scanner.nextInt();
		
		System.out.println(" enter student's gender: ");	
		String gender = scanner.next();
		
		System.out.println(" enter students contact details: ");	
		String contactDetail = scanner.next();
		 Student student= new Student(name,gender,contactDetail ,age , id);
		
		studentSet.add(student);
		return;
			}
		
		
			

	
	
	public void deleteStudent(Set<Student>studentSet,int id)
	{
		for(Student student:studentSet)
		{
			
			if(student.getId()==id)
			{
				studentSet.remove(student);
				System.out.println("student is deleted .");
				return;
				
			}
			
			
		}
		 System.err.println("there's no student with this id...");
	}
	
	
	public void update(Set <Student> studentSet,int id)
	{
		for(Student student : studentSet)
		{
			
			if(student.getId() == id)
			{
				
				System.out.println("What information do you want to update \n "
						+ "A) Name \n B) Age \n C) Gender \n D) Contact details ");
				
				String input=scanner.next().toUpperCase();
				
				while ( !input.equals("NO")){
				switch(input)
				{
				case "NAME":
					System.out.println("Enter name: ");
					student.setName(scanner.next());
				break;
				
				case "AGE":
					System.out.println("Enter age: ");
					student.setAge(scanner.nextInt());
				break;
				case "GENDER":
					System.out.println("Enter gender: ");
					student.setGender(scanner.next());
				break;
				case "CONTACT DETAILS":
					System.out.println("Enter contact details: ");
					student.setContactDetail(scanner.next());
				break;
				case "NO":
					break;
				default:
					System.err.println("invalid option");
					break;
				
				}
				System.out.println("do you want to update something else \n "
						+ "1. Name \n 2. Age \n 3. Gender \n 4. Contact details\n 5.  no");
				
				 input=scanner.next().toUpperCase();
				
				}
				return;
				
			}
		

			
			
		}
		System.err.println("Student id doesnt exist!");

			
			
			
		}
	
	
	
	

}
