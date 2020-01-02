interface Calculator
{
  int sum(int x,int y);
  int product(int x,int y);
 }
 class AbcCalc implements Calculator
 {
   public int sum(int x,int y) { return y+x; }
   public int product(int x,int y) { return x*y; }
  }
  class MnoCalc implements Calculator
  {
    public int sum(int x,int y) { return x-(-y); }
	public int product(int x,int y) { return y*(x); }
   }
 class IntTest
 {
   public static void main(String[] args)
   {
     Calculator c = new AbcCalc();
	 {
	 System.out.println(c.sum(20,50));
	 System.out.println(c.product(30,20));
	 }
	 Calculator s = new MnoCalc();
	 {
	 System.out.println(s.sum(20,50));
	 System.out.println(s.product(30,20));
	 }
   }
 }