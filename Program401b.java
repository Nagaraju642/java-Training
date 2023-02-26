import java.util.*;
public class Program401b
{
static double area_of_a_rectangle(double s)
{
     return(s*s);
}
 static double perimeter_of_a_rectangle(double s)
{
      return(4*s);
}
public static void main(String[] args)
{
double s;
Scanner sc=new Scanner(System.in);
System.out.print("\nEnter the radius of the rectangle:");
s=sc.nextDouble();
System.out.println("Area of the rectangle:"+area_of_a_rectangle(s));
System.out.println("Perimeter of the rectangle:"+perimeter_of_a_rectangle(s));
}
}                                                                                                                                                                                      