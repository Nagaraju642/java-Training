import java.util.Scanner;
class Factorial802
{
public static void main(String[] args)
{
int fact,i=1;
int n=5;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int num =sc.nextInt();
while(n>=0)
{
fact=fact*i;
i++;
}
System.out.println("\nFactorial of "+n+" is: "+fact);
}
}