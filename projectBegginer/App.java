package projectBegginer;

import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		try {

			Set<Student> studentSet = new LinkedHashSet<Student>();
			Registration reg = new Registration();

			System.out.println("please choose an option:");
			System.out.println("1.add\n" + "2.view\n" + "3.update\n" + "4.delete\n" + "5.exit\n");

			Scanner input = new Scanner(System.in);
			String choice = input.next().toUpperCase();

			while (!choice.equals("EXIT")) {

				switch (choice) {
				case "ADD":
					reg.addStudent(studentSet);
					break;
				case "VIEW":
					System.out.println("enter student's id:");
					reg.viewStudent(studentSet, input.nextInt());
					break;
				case "UPDATE":
					System.out.println("enter the student's id you would like to update:");
					reg.update(studentSet, input.nextInt());
					break;
				case "DELETE":
					System.out.println("enter the student's id you would like to delete:");
					reg.deleteStudent(studentSet, input.nextInt());
					break;

				case "EXIT":
					break;
				default:
					System.err.println("invalid choice");

				}

				System.out.println("please choose an option:");
				System.out.println("1.add\n" + "2.view\n" + "3.update\n" + "4.delete\n" + "5.exit\n");
				choice = input.next().toUpperCase();
					
			}
			
			GradeTracker gradetracker=new GradeTracker();
			System.out.println("please choose an option:\n"+"1.add\n" +"2.view\n" +"3.avg\n" +"4.top performance\n" +"5.exit\n");
			choice = input.next().toUpperCase();
			while (!choice.equals("EXIT")) {
				switch(choice)
				{
				case "ADD":
					System.out.println("enter student's id you would like to enter his grades");
					gradetracker.addGrade(studentSet,input.nextInt());
					break;
				case "VIEW":
					System.out.println("enter student's id you would like to view his grades");
					gradetracker.viewGrade(studentSet,input.nextInt());
					break;
				case "AVG":
					System.out.println("enter student's id you would like to calculate his average");
					System.out.println(gradetracker.averageGrade(studentSet,input.nextInt()));
					break;
				case"TOPPERFORMANCE":
					gradetracker.topPerformance(studentSet);
					break;
				case "EXIT":
				    break;
				default:
					System.err.println("invalid choice");
				}
				System.out.println("please choose an option:\n"+"1.add\n" +"2.view\n" +"3.avg\n" +"4.top performance\n" +"5.exit\n");
				choice = input.next().toUpperCase();
			}
				
		}
		

		catch (InputMismatchException e) {
			System.err.println("invalid input..please enter correctly");
		}
				
		/**
		 * This is test for branches
		 */
	}
}
