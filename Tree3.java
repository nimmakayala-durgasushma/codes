import java.util.ArrayList;
import java.util.Iterator;
class Test1
{
  public static void main(String[] args)
  {
    ArrayList<String> list = new ArrayList<>();
	list.add("Welcome");
	list.add("farewell");
	for(String s : list)
	 System.out.println(s);
	for(int i=0;i<list.size();i++)
	 System.out.println(list.get(i));
   }
 }