class Box
{
  private double width;
 private double height;
 private double depth;
 public Box()
{
   width=height=depth=0.0;
}
   public Box(double w,double h,double d)
{
   width=w;
  height=h;
  depth=d;
}
   public void volume()
{
   System.out.print("volume="+(width*height*depth));
}
}
  public class Program504
{
  public static void main(String[] args)
{
  Box myBox1=new Box();
  Box myBox2=new Box(10,35,6);
  myBox1.volume();
  myBox2.volume();
}
}                                                                                                                                                                                      