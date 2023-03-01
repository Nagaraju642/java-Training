import java.util.Scanner;
 class MyDate1
{
private int day;
private int month;
private int year;
public void setDay(int day)
{
this.day=day;
}
public void setMonth(int month)
{
this.month=month;
}
public void setYear(int year)
{
this.year=year;
}
public void displayDate()
{
System.out.println("The date you have entered is"+day+"-"+month+"-"+year);
}
}
public class Program702
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
MyDate1 d1=new MyDate1();
System.out.println("Enter the day");
d1.setDay(sc.nextInt());
System.out.println("Enter the month");
d1.setMonth(sc.nextInt());
System.out.println("Enter the year");
d1.setYear(sc.nextInt());
d1.displayDate();
MyDate1 d2=new MyDate1();
System.out.println("Enter the day");
d2.setDay(sc.nextInt());
System.out.println("Enter the month");
d2.setMonth(sc.nextInt());
System.out.println("Enter the year");
d2.setYear(sc.nextInt());
d2.displayDate();
}
}

