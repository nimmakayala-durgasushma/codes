import java.util.Scanner;
class Task
{
 public static void main(String[] args)
 {
   Scanner s = new Scanner(System.in);
   System.out.println("Enter a number:");
   int a=s.nextInt();
   s.nextLine();
   System.out.println("Enter a string:");
   String b=s.nextLine();
   System.out.println(a+" "+b);
  }
 }