package part1_test;

import java.util.ArrayList;

import data_management.manageData;
import part1_basicclasses.Course;
import part1_basicclasses.Student;
import part1_basicclasses.Teacher;

public class TestPart1 {

	public static void main(String[] args) {
		ArrayList<Course> listOfCourses = manageData.getListOfCourses();
		ArrayList<Student> listOfStudents = manageData.getListOfStudents();
		ArrayList<Teacher> listOfTeachers = manageData.getListOfTeachers();
		manageData.teachCourses(listOfTeachers, listOfCourses);
		manageData.takeCourses(listOfStudents, listOfCourses);
		manageData.teacherEvaluateStudent(listOfStudents, listOfTeachers);
		manageData.studentEvaluateTeacher(listOfStudents, listOfTeachers);
		
		manageData.displayTeacherInfo(listOfTeachers.get(0));
		manageData.displayTeacherInfo(listOfTeachers.get(1));

		manageData.displayStudentInfo(listOfStudents.get(0));
		manageData.displayStudentInfo(listOfStudents.get(1));
		
	}

}
