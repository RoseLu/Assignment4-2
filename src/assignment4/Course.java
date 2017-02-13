package assignment4;

import java.util.*;

public class Course {
	private String title;
	private int numberOfStudent;
	public ArrayList<Student> studentList = new ArrayList<Student>();

	public Course(String title) {
		this.title = title;
	}

	public ArrayList<Student> getStudent() {
		return studentList;
	}

	boolean isFull() {
		return (numberOfStudent >= 10) ? true : false;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfStudent() {
		return numberOfStudent;
	}

	public void registerStudent(Student student) {
		boolean f = isFull();
		if (f == false) {
			studentList.add(student);
			numberOfStudent = studentList.size();
			System.out.println(student.getName() + " with the ID of " + student.getId()
					+ " have successfully registered course " + getTitle());
		}

		else
			System.out.println("Course " + getTitle() + " is full and " + student.getName() + " with the ID of "
					+ student.getId() + " can't register it");
	}

}
