class Triangle
{
  private double base;
 private double height;
 public Triangle()
{
   base=height=0.0;
}
   public Triangle(double b,double h)
{
   base=b;
   height=h;
}
   public void area()
{
   System.out.print("area="+(base*height));
}
}
  public class Program506
{
  public static void main(String[] args)
{
  Triangle mytriangle1=new Triangle();
  Triangle mytriangle2=new Triangle(10,3);
  mytriangle1.area();
  mytriangle2.area();
   }
  }
                                                                                                                                                                                      