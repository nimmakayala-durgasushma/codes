class Employee implements java.io.Serializable
{
  int empid;
  String ename;
  double salary;
  public Employee(){}
  public Employee(int empid,String ename,double salary)
  {
    this.empid=empid;
    this.ename=ename;
    this.salary=salary;
   }
   public void setEmpid(int empid){ this.empid=empid; }
   public void setEname(String ename){ this.ename=ename; }
   public void setSalary(double salary){ this.salary=salary; }
   public int getEmpid(){ return empid; }
   public String getEname(){ return ename; }
   public int getSalary(){ return salary; }
 }