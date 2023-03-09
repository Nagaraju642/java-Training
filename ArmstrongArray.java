import java.util.Scanner;
 public class ArmstrongArray 
{
 public static void main(String[] args)
 {
 Scanner input = new Scanner(System.in);
 System.out.print("Enter the length of the array: "); 
int length = input.nextInt();
 int[] arr = new int[length]; 
for (int i = 0; i < length; i++)
 {
 System.out.print("Enter the " + (i + 1) + "th element: ");
 arr[i] = input.nextInt();
 }
 for (int num : arr)
 {
 int sum = 0; 
int temp = num;
 int numLength = String.valueOf(num).length();
 while (temp != 0)
 { 
int digit = temp % 10;
 sum += Math.pow(digit, numLength); 
temp /= 10;
 }
 if (sum == num) 
{
 System.out.println(num + " is an Armstrong number.");
 }
 else 
{
 System.out.println(num + " is not an Armstrong number.");
 }
 } 
input.close();
 }
 }
