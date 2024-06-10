package com.bindding;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	
	private int studentId;
	
	private String StudentName;
	
	private int StudentAge;
	
	private int StudentRank;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public int getStudentAge() {
		return StudentAge;
	}

	public void setStudentAge(int studentAge) {
		StudentAge = studentAge;
	}

	public int getStudentRank() {
		return StudentRank;
	}

	public void setStudentRank(int studentRank) {
		StudentRank = studentRank;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", StudentName=" + StudentName + ", StudentAge=" + StudentAge
				+ ", StudentRank=" + StudentRank + "]";
	}
	
	

}
