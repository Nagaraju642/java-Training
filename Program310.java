  
 import java.util.Scanner;
public class Program310
{
static void displayDay(int day_no)
{
String s=new String();
if(day_no==0)s="Sunday";
 else if(day_no==1)s="Monday";
 else if(day_no==2)s="Tuesday";
 else if(day_no==3)s="Wednsday";
 else if(day_no==4)s="Thursday";
 else if(day_no==5)s="Friday";
 else if(day_no==6)s="Saturday";
else s="Incorrect day number";
System.out.println("Day is:"+s);
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the day numbers(0-6):");
int day_no=sc.nextInt();
displayDay(day_no);
}
}

                                                                                                                                                                                                                                                                                                                           