 import java.util.*;
 public class Program302                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
static int isEven(int n)
{
return(n&1);//return 0 for even,1 for odd
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the number:");
n=sc.nextInt();
if(isEven(n)==0);
System.out.print("Even\n");
System.out.print("Odd\n");
}
}
                                                                                                                                                                                                                                                                                                                             