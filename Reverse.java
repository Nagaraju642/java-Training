
import java.util.Scanner;
public class Reverse 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr=new int[n];
		for(int i =0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int [] arr1 = new int[n];
		for(int i = arr.length-1,j=0;i>=0&&j<arr1.length;i--,j++){
			arr1[j]=arr[i];
		}
		for(int i = 0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
	}
}
