import java.io.File;
class Test2
{
  public static void main(String[] args)
  {
    File f = new File("Test2.java");
	System.out.println(f.isFile());
	System.out.println(f.length());
	System.out.println(f.isDirectory());
   }
 }