import java.util.HashSet;
import java.util.Iterator;
class Test1
{
  public static void main(String[] args)
  {
     HashSet<String> hs = new HashSet<String>();
	 hs.add("Welcome");
	 hs.add("Hello");
	 hs.add("Bye Bye");
	 hs.add("Farewell");
	 System.out.println(hs.add("Welcome"));
	 System.out.println(hs.size());
	 for(String s : hs)
	   System.out.println(s);
	 hs.clear();
	 System.out.println(hs.remove("hello"));
	 System.out.println(hs.contain("Hello"));
  }
}