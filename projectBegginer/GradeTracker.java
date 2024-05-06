package projectBegginer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class GradeTracker {
	Scanner scanner = new Scanner(System.in);

	public void addGrade(Set<Student> studentSet,int id) {
		Map<String, Double> courses = new HashMap<>();
		for(Student student:studentSet)
		{
			if(student.getId() == id)
			{
				System.out.println("Enter the course name and the grade (or type 'exit' to finish):");
				while (true) {

					System.out.print("  Course name:\n ");
					String course = scanner.next();

					if (course.toUpperCase().equals("EXIT")) {
						break;
					}

					System.out.println("  Grade: ");
					double grade = scanner.nextDouble();
					scanner.nextLine();
					courses.put(course, grade);
				
				}
					
				student.setCourses(courses);
				return;
				}
		}
		System.err.println("this id isnt exist!");
	
				
}

	public void viewGrade(Set<Student> studentSet,int id) {

		for (Student student : studentSet) {
			
			if (student.getId() == id) {
				Map<String, Double> courses = student.getCourses();
				for (String coursename : courses.keySet()) {

					System.out.print(" course:" + coursename);
					System.out.println("    grade:" + courses.get(coursename));
				
					

				}
				return;
				

			}
			
			
		}
		System.err.println("re enter the id or grades aren't entered");
		

	}

	public double averageGrade(Set<Student> studentSet,int id) {
		double sum = 0;
		double avg = 0;
		int count = 0;
		for (Student student : studentSet) {
		
			if (student.getId() == id) {
				Map<String, Double> courses = student.getCourses();
				for (String i : courses.keySet()) {
					count++;

					double grade = courses.get(i);
					sum += grade;

				}
				avg = sum / count;
				

			}
			
	
		}
		return avg;
		
		
		
		

		
	}
	

	public void topPerformance(Set<Student> studentSet) {
		double max = 0;
		String maxStudent="";
		for (Student student : studentSet) {
			
			double averageGrade = averageGrade(studentSet,student.getId());
			if (averageGrade > max) {
					max = averageGrade;
					 maxStudent=student.getName();
				}
	
					}
		System.out.println("the student with top performance is: " +maxStudent +" with an average:"+max);
			

	}
}
