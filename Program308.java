 import java.util.Scanner;
public class Program308                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter two number:");
//consider two numbers as a=4 and b=5
int a=sc.nextInt();
int b=sc.nextInt();
a=a^b;
b=a^b;
a=a^b;
System.out.print("Numbers after swappin:"+a+" "+b);
}
}
    
                                                                                                                                                                                                                                                                                                                    