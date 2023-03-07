import java.util.Scanner;
public class PrimeNumbersInArray
{
public static boolean isPrime(int num)
{
if(num==1||num==2)
return true;
for(int i=2;i<num;i++)
{
if(num%i==0)
return false;
}
return true;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the size of the array:");
int n=sc.nextInt();
int[]arr=new int[n];
System.out.println("Enter the element of the array:");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("The prime number in the arrays are:");
for(int i=0;i<n;i++)
{
if(isPrime(arr[i]))
{
System.out.println(arr[i]+ " ");
}
}
}
}
