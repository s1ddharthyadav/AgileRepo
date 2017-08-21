package com.cg.coachingcentre.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StandardCourses {

	@Id
	private int courseID;
	
	private int monthlyFees;
	private float extraClassesRate;
	private String subjects, courseName, roomNo, category;
	
	public StandardCourses() {
		super();
	}

	public StandardCourses(int courseID, int monthlyFees, float extraClassesRate, String subjects, String courseName,
			String roomNo, String category) {
		super();
		this.courseID = courseID;
		this.monthlyFees = monthlyFees;
		this.extraClassesRate = extraClassesRate;
		this.subjects = subjects;
		this.courseName = courseName;
		this.roomNo = roomNo;
		this.category = category;
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public int getMonthlyFees() {
		return monthlyFees;
	}

	public void setMonthlyFees(int monthlyFees) {
		this.monthlyFees = monthlyFees;
	}

	public float getExtraClassesRate() {
		return extraClassesRate;
	}

	public void setExtraClassesRate(float extraClassesRate) {
		this.extraClassesRate = extraClassesRate;
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Course [courseID=" + courseID + ", monthlyFees=" + monthlyFees + ", extraClassesRate="
				+ extraClassesRate + ", subjects=" + subjects + ", courseName=" + courseName + ", roomNo=" + roomNo
				+ ", category=" + category + "]";
	}	
}