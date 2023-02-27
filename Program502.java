import java.util.Scanner;
public class Program502
{
static double calculateArea(double base,double height)
{
double temp;
temp=1.0/2.0*base*height;
     return temp;
}
public static void main(String[] args)
{
double base,height,area;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the base of the triangle:");
base=sc.nextDouble();
System.out.print("\nEnter the height of the triangle:");
height=sc.nextDouble();
area=calculateArea(base,height);
System.out.println("Area of a triangle with base"+base+"height"+height+"is"+area+"sq units");
}
}                                                                                                                                                                                      