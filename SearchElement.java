import java.util.Scanner;
class SearchElement
{
public static void main(String[] args)
{
int n,x,Flag=0,i=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter number of elements you want in array: ");
n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter all the elements: ");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("Enter element you want to find: ");
x=s.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==x)
{
Flag=1;
break;
}
else
{
Flag=0;
}
}
if(Flag==1)
{
System.out.println("Element found at position: "+(i+1));
}
else
{
System.out.println("Element not found");
}
}
}
