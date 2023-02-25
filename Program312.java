
			  
import java.util.Scanner;
public class Program312
{
static void displayMonth(int month_no)
{
String s=new String();
switch(month_no)
	{	case 0:s="Jan";break;
 		case 1:s="Feb";break;
 		case 2:s="March";break;
 		case 3:s="April";break;
		case 4:s="May";break;
		case 5:s="June";break;
		case 6:s="July";break;
		case 7:s="Augest";break;
		case 8:s="September";break;
		case 9:s="Oct";break;
		case 10:s="Nove";break;
		case 11:s="Dec";break;
		default: s="Incorrect month number";
	}
	System.out.println("Month is:"+s);
}//displayMonth
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the month numbers(0-12):");
int month_no=sc.nextInt();
displayMonth(month_no);
}
}