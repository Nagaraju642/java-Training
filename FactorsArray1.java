import java.util.*;
public class FactorsArray1
{
public static void main(String[] args)
{
int num;
Scanner sc=new Scanner(System.in);
System.out.print("\nEnter a number: ");
num=sc.nextInt();
int size=(int)num/2;
int[]FA=new int[size];
int i,count=0;
//System.out.print("\nThe factors of "+ num +" are: ");
for(i=1;i<=num;i++)
{
if(num%i==0)
{
count=count+1;
//System.out.print(i+" ");
}
}
System.out.println("\nTotal factors of "+ num +" : "+ count);
}
}
