import java.util.Scanner;
public class Program404
{
public static void main(String[] args)
{
int i,j,k;
i=100;j=79;k=209;
int min;
min=0;
if(i<j && i<k)min=i;
if(j<i && j<k)min=j;
if(k<i && k<j)min=k;
System.out.println("Min of"+i+",m"+j+"and"+k+"is"+min);
}
}                                                                                                                                                                                      