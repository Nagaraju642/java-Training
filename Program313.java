
			  
import java.util.Scanner;
public class Program313
{
static void displayDay(int day_no)
{
String s=new String();
switch(day_no)
	{	case 0:s="Sunday";break;
 		case 1:s="Monday";break;
 		case 2:s="Tuesday";break;
 		case 3:s="Wednsday";break;
		case 4:s="Thursday";break;
		case 5:s="Friday";break;
		case 6:s="Saturday";break;
		default: s="Incorrect day number";
	}
	System.out.println("Day is:"+s);
}//displayDay
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the day numbers(0-6):");
int day_no=sc.nextInt();
displayDay(day_no);
}
}                                                                                                                                                                                                                                                                                                                         