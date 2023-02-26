import java.util.Scanner;
public class Program405
{
public static void main(String[] args)
{
System.out.println("This is example to understand scope of variable");
int i;
i=15;
{
System.out.println("we are in a new block");
int j;
j=i*i;
System.out.println("iandj in new block are"+i+""+j);
}
int k;
k=i+2;
int j;
j=k+100;
System.out.println("iandj out of the new block are:"+i+""+j);
}
}                                                                                                                                                                                      