package data_management;
import java.util.ArrayList;

import part1_basicclasses.*;

public class manageData {
	public static ArrayList<Course> getListOfCourses(){
		ArrayList<Course> listOfCourses = new ArrayList<Course>();
		
		Course c0 = new Course("SQL Database", 1000),
				c1 = new Course("java", 1000),
				c2 = new Course("UML", 1020),
				c3 = new Course("WINDOWS OS", 1030),
				c4 = new Course("Project management", 4, 1000),
				c5 = new Course("Building doily", 0, 1040);
		
		listOfCourses.add(c0);
		listOfCourses.add(c1);
		listOfCourses.add(c2);
		listOfCourses.add(c3);
		listOfCourses.add(c4);
		listOfCourses.add(c5);

		return listOfCourses;
	}
	
	public static ArrayList<Teacher> getListOfTeachers(){
		ArrayList<Teacher> listOfTeachers = new ArrayList<Teacher>();
		
		Teacher t0 = new Teacher(1000, "Zeroug", "5147889014", "zeroug@hotmail.com"),
				t1 = new Teacher(1020, "Fode", "5146721234", "fode@hotmail.ca"),
				t2 = new Teacher(1030, "Guenaoui", "5146611218", "zeroug@hotmail.ca"),
				t3 = new Teacher(1040, "Catherine", "5147112218", "zeroug@hotmail.ca");
		
		listOfTeachers.add(t0);
		listOfTeachers.add(t1);
		listOfTeachers.add(t2);
		listOfTeachers.add(t3);
		
		return listOfTeachers;
	}
	
	public static ArrayList<Student> getListOfStudents(){
		ArrayList<Student> listOfStudents = new ArrayList<Student>();
		
		Student s0 = new Student(2000, "Marc", "5147881213", "marc@yahoo.ca"),
				s1 = new Student(2001, "Maria", "5146781415", "maria@hotmail.ca"),
				s2 = new Student(2002, "catherine", "4389124567", "catherine@yahoo.ca");
		
		listOfStudents.add(s0);
		listOfStudents.add(s1);
		listOfStudents.add(s2);

		return listOfStudents;
	}
	
	public static void teachCourses(ArrayList<Teacher> listOfTeachers, ArrayList<Course> listOfCourses) {
		listOfTeachers.get(0).teachCourse(listOfCourses.get(0));
		listOfTeachers.get(0).teachCourse(listOfCourses.get(1));
		listOfTeachers.get(0).teachCourse(listOfCourses.get(4));
		listOfTeachers.get(1).teachCourse(listOfCourses.get(2));
		listOfTeachers.get(2).teachCourse(listOfCourses.get(3));
	}
	
	public static void takeCourses(ArrayList<Student> listOfStudents, ArrayList<Course> listOfCourses) {
		listOfStudents.get(0).takeCourse(listOfCourses.get(0));
		listOfStudents.get(0).takeCourse(listOfCourses.get(5));
		listOfStudents.get(1).takeCourse(listOfCourses.get(1));
		listOfStudents.get(1).takeCourse(listOfCourses.get(2));
		listOfStudents.get(2).takeCourse(listOfCourses.get(3));
	}
	
	public static void teacherEvaluateStudent(ArrayList<Student> listOfStudents, ArrayList<Teacher> listOfTeachers) {
		listOfTeachers.get(0).evaluate(listOfStudents.get(0), 5);
		listOfTeachers.get(0).evaluate(listOfStudents.get(1), 7);
		listOfTeachers.get(0).evaluate(listOfStudents.get(2), 6);
		listOfTeachers.get(1).evaluate(listOfStudents.get(0), 3);
		listOfTeachers.get(1).evaluate(listOfStudents.get(1), 6);
		listOfTeachers.get(1).evaluate(listOfStudents.get(2), 5);

	}
	
	public static void studentEvaluateTeacher(ArrayList<Student> listOfStudents, ArrayList<Teacher> listOfTeachers) {
		listOfStudents.get(0).evaluate(listOfTeachers.get(0), 7);
		listOfStudents.get(0).evaluate(listOfTeachers.get(1), 5);
		listOfStudents.get(0).evaluate(listOfTeachers.get(2), 12);
		listOfStudents.get(1).evaluate(listOfTeachers.get(0), 8);
		listOfStudents.get(1).evaluate(listOfTeachers.get(1), 7);
		listOfStudents.get(2).evaluate(listOfTeachers.get(0), 7);
		listOfStudents.get(2).evaluate(listOfTeachers.get(1), 7);
		listOfStudents.get(2).evaluate(listOfTeachers.get(2), 8);
	}
	
	public static void displayTeacherInfo(Teacher teacher) {
		System.out.println(teacher);
		System.out.println("Avg evaluation is " + teacher.avgEvaluation());
		for(Integer i : teacher.returnDomain())
			System.out.println("Domain :" + i + "-" + Course.DOMAINS[i]);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	}
	
	public static void displayStudentInfo(Student student) {
		System.out.println(student);
		System.out.println("Avg evaluation is " + student.avgEvaluation());
		for(Integer i : student.returnDomain())
			System.out.println("Domain :" + i + "-" + Course.DOMAINS[i]);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

	}
}

