import java.util.Scanner;
public class Program303
{
	public static boolean isEvenOdd(int n){
		boolean even_no = false;
		for(int i =0;i<=n;i++){
			even_no=!even_no;
		}
		return even_no;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		if(isEvenOdd(n)){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
	}
}