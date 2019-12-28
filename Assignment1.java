import java.util.ArrayList;
import java.util.Iterator;
class Student
{
  int stuid;
  String name;
  int age;
  public Student(){}
  public Student(int stuid,String name,int age)
  { this.stuid=stuid; this.name=name; this.age=age; }
  public void setStuId(int stuid){ this.stuid=stuid; }
  public void setName(String name){ this.name=name; }
  public void setAge(int age){ this.age=age; }
  public int getStuId(){ return stuid; }
  public String getName(){ return name; }
  public int getAge(){ return age; }
 }
class Training
{
  int trainingid;
  String trainingname;
  ArrayList<student> slist = new ArrayList<>();
  slist.add(101);
  slist.add("ajay");
  slist.add(25);
  public Training(){}
  public Training(int stuid,String name,int age,int trainingid,String trainingname)
  { this.s=s; this.trainingid=trainingid; this.trainingname=trainingname; }
  public void setTrainingId(int trainingid)
  {
    this.trainingid=trainingid;
   }
   public void setTrainingName(String trainingname)
   {
     this.trainingname=trainingname;
   }
   public void setS(Student s){ this.s=s; }
   public int getTrainingId(){ return trainingid; }
   public String getTrainingName(){ return trainingname; }
   public Student getS(){ return s; }
 }
class Test1
{
  public static void main(String[] args)
  {
    Training t = new Training(101,"Java",new Student(213,"Ajay",24));
    System.out.println(t.getStuid());
	System.out.println(t.getName());
   }
 }
 
  