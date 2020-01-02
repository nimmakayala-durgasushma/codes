import java.util.StringTokenizer;
class Test2
{
  public static void main(String[] args)
  {
    String s =  "Something to be, Written and Shown, to the Participants";
	StringTokenizer st = new StringTokenizer(s,",");
	System.out.pritnln(st.countTokens());
	while(st.hasMoreTokens())
	 System.out.pritnln(st.nextToken());
   }
 }
 