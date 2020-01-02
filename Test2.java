class Student
{
   public int rno;
   public String name;
   public int m1;
   public int m2;
   public int m3;
   public Student(int rno,String name,int m1,int m2,int m3)
  {
    this.rno=rno;
    this.name=name;
    this.m1=m1;
    this.m2=m2;
    this.m3=m3;
  }
  public int getTotalMarks()
  {
    return m1+m2+m3;
  }
  public int getAverage()
  {
    return (m1+m2+m3)/3;
  }
  public String getResults()
  {
     if(m1>40 && m2>40&& m3>40)
	   return "passed";
	 else
	   return "failed";
  }
  public String getDivision()
  {
      if(m1>40 && m2>40 && m3>40)
	  {
	    int avg=getAverage();
	    if(avg>70)
		 return "first";
	    else
		  return "second";
	  }
	  else
	    return "nill";
   }
   public int getRno(){return rno;}
   public String getName(){return name;}
 }
 class Test2
 {
   public static void main(String[] args)
   {
     Student s=new Student(101,"Ajay",88,70,92);
	 System.out.println(s.getRno());
	 System.out.println(s.getTotalMarks());
	 System.out.println(s.getAverage());
	 System.out.println(s.getResults());
	 System.out.println(s.getDivision());
   }
 }
    
  
 