import java.util.*;
public class Program501
{
static double area_of_a_triangle(double s)
{
     return(s*s);
}
 static double perimeter_of_a_triangle(double s)
{
      return(4*s);
}
public static void main(String[] args)
{
double s;
Scanner sc=new Scanner(System.in);
System.out.print("\nEnter the radius of the triangle:");
s=sc.nextDouble();
System.out.println("Area of the triangle:"+area_of_a_triangle(s));
System.out.println("Perimeter of the triangle:"+perimeter_of_a_triangle(s));
}
}                                                                                                                                                                                      