 import java.util.Scanner;
class Program803
{
int n;
public static int factorialnum(int n)
{
int res=1;
while(n>0)
{
if(n==0)
{
return 1;
}
else
{
res=res*n;
n--;
}
}
return res;
} 
public static int productdigit(int n)
{
int product=1;
while(n>0)
{
product*=n%10;
n=n/10;
}
return product;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int temp1=sc.nextInt();
System.out.println("Enter a number:");
int temp2=sc.nextInt();
int result1=factorialnum(temp1);
int result2=productdigit(temp2);
System.out.println("factorial of "+temp1+" is "+result1);
System.out.println("p[roduct of digit "+temp2+" is "+result2);
}
}

