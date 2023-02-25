  
 import java.util.Scanner;
public class Program309
{
static void displayDay(int day_no)
{
String s=new String();
 if(day_no==0)s="Sunday";
 if(day_no==1)s="Monday";
 if(day_no==2)s="Tuesday";
 if(day_no==3)s="Wednsday";
 if(day_no==4)s="Thursday";
 if(day_no==5)s="Friday";
 if(day_no==6)s="Saturday";
if(day_no<0||day_no>6) s="Incorrect day number";
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

                                                                                                                                                                                                                                                                                                                           