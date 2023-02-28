 class Student
 {
	 int rollno;
	 String name;
	 static String college="MTICA";
	 Student(int r,String n)
	 {
		 rollno=r;
		 name=n;
	 }
	 void display()
	 {
		 System.out.println(rollno+" "+name+" "+college);
	 }
 }
 public class ProgramStudent604
 {
	 public static void main(String[] args)
 {
		 Student s1=new Student(111,"Kiran");
		 Student s2=new Student(222,"Ramu");
		 s1.display();
		 s2.display();
 }
 }