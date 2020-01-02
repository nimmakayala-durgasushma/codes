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
class Test3
{
  public static void main(String[] args)
  {
    Employee[] e1={new Employee(101,"Ajay",12000),new Employee(102,"chandhu",25000)};
	Department d = new Department(101,"sales",e1);
	System.out.println("deptid is"+d.getDeptid());
	System.out.println("deptname is"+d.getDeptname());
	System.out.println("Employee Details");
	Employee[] e2 = d.getEmployee();
	for(int i=0;i<e2.length;i++)
	{
	System.out.println("empid is"+e2[i].getEmpid());
	System.out.println("ename is"+e2[i].getEname());
	System.out.println("empsalary is"+e2[i].getSalary());
	System.out.println();
	}
   }
 }
   
   