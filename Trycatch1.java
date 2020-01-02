class Trycatch1
{
  public static void main(String[] args)
  {
    try
	{
	  int a=50,b=0,c;
	  c=a/b;
	  System.out.println("divison is"+c);
	}
	catch(ArithmeticException e )
	{
	  System.out.println(e);
    }
   }
 }
	  