class Trycatch2
{
  public static void main(String[] args)
  {
    try
	{
	  int a=50,b=0,c;
	  c=a/b;
	  System.out.println("divison is"+c);
	}
	catch(Exception e )
	{
	  System.out.println("can't divided by zero");
    }
   }
 }