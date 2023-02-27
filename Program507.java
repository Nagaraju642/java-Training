class Rectangle
{
  private double length;
 private double breadth;
 public Rectangle()
{
   length=breadth=0.0;
}
   public Rectangle(double l,double b)
{
   length=l;
   breadth=b;
}
   public void area()
{
   System.out.print("area="+(length*breadth));
}
}
  public class Program507
{
  public static void main(String[] args)
{
  Rectangle myrectangle1=new Rectangle();
  Rectangle myrectangle2=new Rectangle(12,4);
  myrectangle1.area();
  myrectangle2.area();
   }
  }
                                                                                                                                                                                      