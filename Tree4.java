import java.util.ArrayList;
import java.util.ListIterator;
class Test1
{
  public static void main(String[] args)
  {
    ArrayList<String> list = new ArrayList<>();
	list.add("Welcome");
	list.add("farewell");
	list.add("Bye Bye");
	list.add(1,"Banana");
	ListIterator<String> itr = list.listIterator();
	while(itr.hasNext())
	  System.out.println(itr.next());
	System.out.println();
	while(itr.hasPrevious())
	   System.out.println(itr.previous());
   }
 }