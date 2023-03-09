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
public boolean checkPrime()
{
if(this.num==1||this.num==2)return true;
for(int i=2;i<this.num;i++)
{
if(this.num%i==0)return false;
}
return true;
}
}
class Test1Number
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int count=0;
System.out.println("Enter a number:");
int size=sc.nextInt();
int[]numList=new int[size];
int[]numPrime=new int[size];
System.out.println("Enter " +size+ " number:");
for(int i=0;i<size;i++)
{
numList[i]=sc.nextInt();
}
Number n=new Number();
for(int i=0;i<size;i++)
{
n.setNum(numList[i]);
if(n.checkPrime())
{
//System.out.println("Prime"+ob1.getNum());
numPrime[i]=n.getNum();
count++;
}
else
{
//System.out.println("Not prime");
numPrime[i]=0;
}
}
//print num prime
for(int i=0;i<size;i++)
{
if(numPrime[i]!=0)
System.out.println(numPrime[i]+" is not prime");
}
System.out.print("\nTotal prime numbers in input array is "+count);
}
}
