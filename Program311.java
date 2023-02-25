  
 import java.util.Scanner;
public class Program311
{
static void displayMonth(int month_no)
{
String s=new String();
  if(month_no==0)s="Jan";
 else if(month_no==1)s="Feb";
 else if(month_no==2)s="March";
 else if(month_no==3)s="April";
 else if(month_no==4)s="May";
 else if(month_no==5)s="June";
else if(month_no==6)s="July";
else if(month_no==7)s="Augest";
else if(month_no==8)s="September";
else if(month_no==9)s="Oct";
else if(month_no==10)s="Nove";
else if(month_no==11)s="Dec";
else s="Incorrect month number";
System.out.println("Month is:"+s);
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the month numbers(0-6):");
int month_no=sc.nextInt();
displayMonth(month_no);
}
}

                                                                                                                                                                                                                                                                                                                           