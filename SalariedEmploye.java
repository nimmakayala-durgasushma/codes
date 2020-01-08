package com.deloitte.firstmvn.hibsecond.entity;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
//@DiscriminatorValue("Salaried")
@Entity
public class SalariedEmploye extends Employe 
{
    double salary;
    public SalariedEmploye(){}
	public SalariedEmploye(int empid,String ename,double salary) 
	{
		super(empid,ename);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
    
}
