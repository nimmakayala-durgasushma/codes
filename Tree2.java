import java.util.TreeSet;
import java.util.Iterator;
class Test1
{
  public static void main(String[] args)
  {
    TreeSet<Employee> tset = new TreeSet<>();
	tset.add(new Employee(102,"Babu",2000));
	tset.add(new Employee(101,"Arun",1000));
	tset.add(new Employee(104,"Dinesh",4000));
	tset.add(new Employee(103,"chandhu",2500));
	for(Employee e : tset)
	   e.display();
   }
 }