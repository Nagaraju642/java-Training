import java.util.*;
public class Program316
{
public static void main(String[] args)
{
int a, b,c;
System.out.print("Enter three numbers:");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a<b&&a<c)
System.out.println("The smallest among the three numbers is"+a);
else if(b<a&&b<c)
System.out.println("The smallest among the three numbers is"+b);
else
System.out.println("The smallest among the three number is"+c);
}
}
