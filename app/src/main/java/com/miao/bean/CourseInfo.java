package com.miao.bean;

import java.io.Serializable;

// CourseInfo用于记录课程信息
public class CourseInfo extends BaseInfo implements Serializable{

    private static final long serialVersionUID = 2074656067805712769L;
	
	private int cid;		// 课程标记id
	private String coursename; //课程名
	private String teacher;		// 教师
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

}