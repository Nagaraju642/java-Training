import java.util.*;
public class StudentSub
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter number of students: ");
int n=sc.nextInt();
int rollno[]=new int[n];
int s1[]=new int[n];
int s2[]=new int[n];
int s3[]=new int[n];
double total[]=new double[n];
double avg[]=new double[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter student "+(i+1)+"details: ");
System.out.println("RollNo: ");
rollno[i]=sc.nextInt();
System.out.println("Subject1 Marks: "); 
s1[i]=sc.nextInt();
System.out.println("Subject2 Marks: ");
s2[i]=sc.nextInt(); 
System.out.println("Subject3 Marks: ");
s3[i]=sc.nextInt(); 
total[i]=(s1[i]+s2[i]+s3[i]);
avg[i]=total[i]/3.0;
}
System.out.println("RollNo\t Total\t Average");
for(int i=0;i<n;i++)
{
System.out.println(rollno[i]+"\t "+total[i]+" \t"+avg[i]);
}
}
}