import java.io.File;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
class Test2
{
  public static void main(String[] args)
  {
    byte[] arr = {10,20,30,40,50};
	try(ByteArrayInputStream bis = new ByteArrayInputStream(arr))
	{
	 int ch;
	 while((ch=bis.read())!=-1)
	   System.out.print(ch+" ");
	}
	catch(IOException ex)
	{
	  System.out.println(ex);
	}
   }
 }