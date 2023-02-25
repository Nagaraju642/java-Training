 import java.util.Scanner;
public class Program304                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter two number:");
//consider two numbers as 4 and 5
int a=sc.nextInt();
int b=sc.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.print("Numbers after swappin:"+a+" "+b);
}
}
    
                                                                                                                                                                                                                                                                                                                    