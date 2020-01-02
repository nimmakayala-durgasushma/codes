class Person
{
  private int ssn,age;
  private String name;
  public Person(){}
  public Person(int ssn,String name,int age)
  {
    this.ssn=ssn;
	this.name=name;
	this.age=age;
  }
  public void setSsn(int ssn)
  {
    this.ssn=ssn;
  }
  public void setName(String name)
  {
    this.name=name;
  }
  public void setAge(int age)
  {
    this.age=age;
  }
  public int getSsn(){ return ssn; }
  public String getName(){ return name; }
  public int getAge(){ return age; }
}
class Student extends Person
{
  int rno;
  int marks;
  public Student(){}
  public Student(int ssn,String name,int age,int rno,int m)
  {
     super(ssn,name,age);
	 this.rno=rno;
	 this.marks=marks;
  }
  public void setRno(int rno)
  {
    this.rno=rno;
   }
   public void setMarks(int marks)
   {
     this.marks=marks;
   }
   public int getRno() { return rno; }
   public int getMarks() { return marks; }
 }
 class Inheritance
 {
   public static void main(String[] args)
   {
     Student s = new Student(101,"Ajay",20,15,78);
	 System.out.println(s.getSsn());
	 System.out.println(s.getName());
	 System.out.println(s.getAge());
	 System.out.println(s.getRno());
	 System.out.println(s.getMarks());
   }
 }
   
	 