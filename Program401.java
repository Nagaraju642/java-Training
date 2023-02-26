import java.util.*;
public class Program401
{
static double area_of_a_square(double s)
{
     return(s*s);
}
 static double perimeter_of_a_square(double s)
{
      return(4*s);
}
public static void main(String[] args)
{
double s;
Scanner sc=new Scanner(System.in);
System.out.print("\nEnter the radius of the square:");
s=sc.nextDouble();
System.out.println("Area of the square:"+area_of_a_square(s));
System.out.println("Perimeter of the square:"+perimeter_of_a_square(s));
}
}