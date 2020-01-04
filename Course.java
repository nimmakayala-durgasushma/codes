package com.del.second.entity;
public class Course 
{
  int courseid;
  String coursename;
  int courseduration;
  double coursefee;
  public Course() {}
  public Course(int courseid, String coursename, int courseduration, double coursefee) 
  {
	this.courseid = courseid;
	this.coursename = coursename;
	this.courseduration = courseduration;
	this.coursefee = coursefee;
   }
   public int getCourseid() 
   {
	return courseid;
   }
   public void setCourseid(int courseid) {
	this.courseid = courseid;
   }
   public String getCoursename() {
	return coursename;
   }
   public void setCoursename(String coursename) {
	this.coursename = coursename;
   }
   public int getCourseduration() {
	return courseduration;
   }
  public void setCourseduration(int courseduration) {
	this.courseduration = courseduration;
  }
  public double getCoursefee() {
	return coursefee;
  }
  public void setCoursefee(double coursefee) {
	this.coursefee = coursefee;
  }
    
}
