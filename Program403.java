import java.util.Scanner;
public class Program403
{
public static void main(String[] args)
{
int i,j,k;
i=100;j=79;k=209;
int min=0;
if(i<j)
{
if(i<k)min=i;
else min=k;
}
else
{
if(j<k)min=j;
else min=k;
}
System.out.println("Min of"+i+",m"+j+"and"+k+"is"+min);
}
}                                                                                                                                                                                      