package part1_basicclasses;

import java.util.ArrayList;

public class Student extends Person {
	private ArrayList<Course> listOfTakenCourses;

	public Student(int id, String name, String phone, String email) {
		super(id, name, phone, email);
		listOfTakenCourses = new ArrayList<Course>();
	}

	public ArrayList<Course> getListOfTakenCourses() {
		return listOfTakenCourses;
	}

	public void setListOfTakenCourses(ArrayList<Course> listOfTakenCourses) {
		this.listOfTakenCourses = listOfTakenCourses;
	}

	@Override
	public ArrayList<Integer> returnDomain() {
		ArrayList<Integer> domains = new ArrayList<Integer>();
		for(Course one : listOfTakenCourses)
			if(!domains.contains(one.getDomain()))
				domains.add(one.getDomain());
		return domains;
	}

	@Override
	public void evaluate(Person teacher, int grade) {
		if(teacher instanceof Teacher)
			if(grade >= 0 && grade <= 10)
				teacher.getEvaluations().add(grade);
	}
 
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		sb.append(super.toString());
		sb.append("\n----------List of taken courses-----------");
		for(Course one : listOfTakenCourses)
			sb.append("\n" + one.toString());
		sb.append("\nTotal number of taken courses: " + listOfTakenCourses.size());
		sb.append("\n------------------------------------------");
		return sb.toString();
	}
	
	
	public void takeCourse(Course course) {
		listOfTakenCourses.add(course);
	}
	
	public ArrayList<Integer> listOfTeachers(){
		ArrayList<Integer> listT = new ArrayList<Integer>();
		for(Course one : listOfTakenCourses)
			listT.add(one.getTeacherId());
		return listT;
	}
	
}
