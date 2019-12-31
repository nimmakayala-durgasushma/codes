class Employee
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
   public void display()
   {
     System.out.println(empid+"  "+ename+"  "+salary);
   }
 }
 class Test
 {
  public static void main(String[] args)
  {
    display();
  }
 }