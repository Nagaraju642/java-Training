import java.util.Scanner;
class Interest2
{
public static void main(String[] args)
{
double principal,rate,time;
Scanner sc=new Scanner(System.in);
principal=sc.nextDouble();
rate=sc.nextDouble();
time=sc.nextDouble();
/*calculate compound interest*/
double CI=principal*(Math.pow((1+rate/100),time));
System.out.println("Compound interest is "+CI);
}
}