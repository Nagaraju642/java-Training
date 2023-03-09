 import java.util.Scanner;
class Number 
{
private int num;
public void setNum(int num)
{
this.num=num;
}
public int getNum()
{
return this.num;
}
}
class Test3SumNumber
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array:");
int size=sc.nextInt();
int arr[]=new int[size];
Number obj=new Number();
obj.setNum(size);
System.out.println("Enter the element of the array: ");
for(int i=0;i<size;i++)
{
arr[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<size;i++)
{
int n=arr[i];
while(n>0)
{
sum=sum+n%10;
n/=10;
}
}
System.out.println("sum of digits in the array "+sum);
}
}
