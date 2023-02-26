import java.util.Scanner;
public class Program402
{
public static void main(String[] args)
{
int i,j;
Scanner sc=new Scanner(System.in);
System.out.print("\nEnter two integers:");
i=sc.nextInt();
j=sc.nextInt();
if(i==0)
System.out.println("Division by error");
else
System.out.println("divided by"+j+"is"+(i/j));
}
}                                                                                                                                                                                      