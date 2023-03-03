 import java.util.Scanner;
 public class TestProgram
 {
	 public static void main(String[] args)
	 {
		 double x1,y1,x2,y2,res;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter x coordinates and y coordinates:");
		 x1=sc.nextDouble();
		 y1=sc.nextDouble();
		 Point P=new Point(x1,y1);
		 res=P.distance_from_origin();
		 System.out.println("Distance of point from origin is "+res);
	 }
 }
 