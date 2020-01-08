package com.deloitte.firstmvn.hibsecond.entity;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
//@DiscriminatorValue("Hourly")
@Entity
public class HourlyEmploye extends Employe 
{
    double rate;
    int hours;
    public HourlyEmploye(){}
    public HourlyEmploye(int empid,String ename,double rate, int hours) 
	{
		super(empid,ename);
		this.rate = rate;
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}    
	
}
