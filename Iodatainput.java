import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.DataInputStream;
class Test2
{
  public static void main(String[] args)
  {
   try(FileInputStream fos = new FileInputStream("abc.dat");
       DataInputStream dos = new DataInputStream(fos);
	   )
   {
       int i=dos.readInt();
	   float f = dos.readFloat();
	   double d=dos.readDouble();
	   System.out.println(i);
	   System.out.println(f);
	   System.out.println(d);
    }
	catch(IOException ex)
	{
	  System.out.println(ex);
	}
   }
 }