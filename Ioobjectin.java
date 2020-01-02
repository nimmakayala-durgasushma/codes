import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
class Test2
{
  public static void main(String[] args)
  {
    Employee e = null;
	try(FileInputStream fos = new FileInputStream("emp.dat");
	    ObjectInputStream oos = new ObjectInputStream(fos);
		)
	 {
	   e = (Employee)oos.readObject();
	   System.out.println(e.getEmpid()+" "+e.getEname()+" "+e.getSalary());
	 }
	 catch(IOException | ClassNotFoundException ex)
	 {
	   System.out.println(ex);
	 }
   }
 }