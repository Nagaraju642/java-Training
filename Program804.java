 import java.util.Scanner;
class Program804
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
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
int result=factorialnum(n);
System.out.println("\nfactorial of a "+n+" is: "+result);
}
}

