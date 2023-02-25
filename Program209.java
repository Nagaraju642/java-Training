import java.util.*;
public class Program209
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int p,q,difference,product;
		System.out.println("enter p value:");
		p=sc.nextInt();
		System.out.println("enter q value:");
		q=sc.nextInt();
		difference=p-q;
		product=p*q;
		System.out.println("the difference between two numbers is:"+difference);
			System.out.println("the product of two numbers is:"+product);
			if(p>q)
		{
				System.out.println(p+" is larger than"+ q);
		}
		else
		{
			System.out.println(q+" is larger than"+ p);
		}
		if(p<q)
		{
			System.out.println(p+" is smaller than"+ q);
		}
		else
		{
			System.out.println(q+" is smaller than"+ p);
		}
}
}