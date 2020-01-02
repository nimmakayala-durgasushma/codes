import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
class Test2
{
  public static void main(String[] args)
  {
   try(FileInputStream fos = new FileInputStream("abc.dat");
       BufferedInputStream bos = new BufferedInputStream(fos);
	   )
   {
    int ch;
	while((ch=bos.read())!=-1)
	 System.out.print((char)(ch)+" ");
    }
	catch(IOException ex)
	{
	  System.out.println(ex);
	}
   }
 }