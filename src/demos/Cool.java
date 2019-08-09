package demos;

public class Cool
{
  private int a;
  public double b;
  
  public Cool(int first, double second)
  {
    this.a = first;
    this.b = second;
  }
  
  public static void incrementBoth(Cool c1) {
    c1.a = c1.a + 1;
    c1.b = c1.b + 1.0;
  }
  
  // new method
  public static void incrementA(int first)
  {
    first = first + 1;
  }
  
  // new method
  {
  public static void incrementB(double second)
    second = second + 1.0;
  }
  
  public static void main(String[] args)
  {
    Cool c1 = new Cool(10, 20.5);
    Cool c2 = new Cool(10, 31.5);
    // different code below
    incrementA(c2.a);
    incrementB(c2.b);
    System.out.println(c2.a + ", "+ c2.b);
  }
}