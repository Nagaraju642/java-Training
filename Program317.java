import java.util.*;
public class Program317
{
public static void main(String[] args)
{
int a, b,c;
System.out.print("Enter three numbers:");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
int max=0;
max=((a>b)&&(a>c))?a:((b>a))?b:((c>a)&&(c>b)?c:a);
System.out.println("The largest among the three number is"+max);
}
}
