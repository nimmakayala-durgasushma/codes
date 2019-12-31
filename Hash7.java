import java.util.HashSet;
import java.util.Iterator;
class Test1
{
  public static void main(String[] args)
  {
    HashSet<Employee> hs = new HashSet<Employee>();
	hs.add(new Employee(101,"Ajay",1000.00));
	hs.add(new Employee(102,"Chndhu",3000.00));
	hs.add(new Employee(103,"Babu",2000.00));
	hs.add(new Employee(101,"Ajay",1000.00));
	for(Employee e : hs)
	  e.display();
	Iterator<Employee> itr = hs.iterator();
	 while(itr.hasNext())
	 itr.next().display();
   }
 }