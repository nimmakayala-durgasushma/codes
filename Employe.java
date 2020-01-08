package com.deloitte.firstmvn.hibsecond.entity;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
//@DiscriminatorColumn(name="type")
public abstract class Employe 
{
  @Id
  int empid;
  String ename;
  public Employe() {}
  public Employe(int empid, String ename) {   
	this.empid = empid;
	this.ename = ename;
   }
  public int getEmpid() {
	return empid;
   }
  public void setEmpid(int empid) {
	this.empid = empid;
   }
  public String getEname() {
	return ename;
   }
  public void setEname(String ename) {
	this.ename = ename;
   }
  
   
   
}
