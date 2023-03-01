 import java.util.Scanner;
class Number 
{
private int n1;
public void setn1(int n1)
{
this.n1=n1;
}
public int getn1()
{
return this.n1;
}
public int reverseDigit()
{
int sum=0;
int n=this.n1;
while(n>0)
{
sum=sum*10+n%10;
n=n/10;
}
return sum;
}
}
class Program709
{
public static void main(String[] args)
{
Number ob1=new Number();
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int temp=sc.nextInt();
ob1.setn1(temp);
int res=ob1.reverseDigit();
System.out.println("Reverse of digits of "+ob1.getn1()+" is "+res);
}
}

