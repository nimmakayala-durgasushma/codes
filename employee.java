class Employee
{
  int empid;
  double salary;
  String ename;
  public Employee(){}
  public Employee(int empid,double salary,String ename)
  {
   this.empid=empid;
   this.salary=salary;
   this.ename=ename;
  }
  public String toString()
  {
    return "Empid is"+empid+"\n Salary is"+salary+"\n Ename is"+ename;
  }
}
class Test
{
  public static void main(String[] args)
  {
    Employee e=new Employee(101,25000,"Ajay");
	System.out.println(e);
   }
}
	


