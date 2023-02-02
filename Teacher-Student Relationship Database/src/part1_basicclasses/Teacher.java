package part1_basicclasses;

import java.util.ArrayList;

public class Teacher extends Person {
	private ArrayList<Course> listOfTaughtCourses;

	public Teacher(int id, String name, String phone, String email) {
		super(id, name, phone, email);
		listOfTaughtCourses = new ArrayList<Course>();
	}
	
	

	public ArrayList<Course> getListOfTaughtCourses() {
		return listOfTaughtCourses;
	}



	public void setListOfTaughtCourses(ArrayList<Course> listOfTaughtCourses) {
		this.listOfTaughtCourses = listOfTaughtCourses;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		sb.append(super.toString());
		sb.append("\n++++++++++List of taught courses++++++++");
		for(Course one : listOfTaughtCourses)
			sb.append("\n" + one.toString());
		sb.append("\nTotal number of taught courses: " + listOfTaughtCourses.size());
		sb.append("\n++++++++++++++++++++++++++++++++++++++++");
		return sb.toString();
	}
	
	@Override
	public ArrayList<Integer> returnDomain() {
		ArrayList<Integer> domains = new ArrayList<Integer>();
		for(Course one : listOfTaughtCourses)
			if(!domains.contains(one.getDomain()))
				domains.add(one.getDomain());
		return domains;
	}

	@Override
	public void evaluate(Person student, int grade) {
		if(student instanceof Student)
			if(grade >= 0 && grade <= 10)
				student.getEvaluations().add(grade);
	}
	
	public void teachCourse(Course course) {
		listOfTaughtCourses.add(course);
	}
	
	public Course findCourse(int courseId) {
		for(Course one : listOfTaughtCourses)
			if(one.getCourseId() == courseId)
				return one;
		return null;
	}

}
