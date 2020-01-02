class Employee
{
  int empid;
  String ename;
  double salary;
  public Employee(){}
  Employee(int empid,String ename,double salary)
  {
    this.empid=empid;
	this.ename=ename;
	this.salary=salary;
  }
  public void setEmpid(int empid)
  {  
     this.empid=empid;
  }
  public void setEname(String ename)
  {
     this.ename=ename;
  }
  public void setSalary(double Salary)
  {
     this.salary=salary;
  }
  public int getEmpid(){ return empid; }
  public String getEname(){ return ename; }
  public double getSalary(){ return salary;}
  public boolean equals(Object obj)
  {
     Employee e=(Employee)obj;
	 return empid==e.empid && ename.equals(e.ename) && salary==(e.salary);
  }
 }
 class Department
 {
   int deptid;
   String deptname;
   Employee[] e;
   public Department(){}
   Department(int deptid,String deptname,Employee[] e)
   {
     this.deptid=deptid;
	 this.deptname=deptname;
	 this.e=e;
   }
   public void setDeptid(int deptid)
   {
     this.deptid=deptid;
   }
   public void setDeptname(String deptname)
   {
      this.deptname=deptname;
   }
   public void setE(Employee[] e)
   {
      this.e=e;
   }
   public int getDeptid(){ return deptid; }
   public String getDeptname(){ return deptname; }
   public Employee[] getE(){ return e; }
}
class Test32
{
  public static void main(String[] args)
  {
    Employee e1 = new Employee(101,"Ajay",1000);
	Employee e2 = new Employee(101,"Ajay",1000);
	System.out.println(e1.equals(e2));
	}
 }
 
   
   