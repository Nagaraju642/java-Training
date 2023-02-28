 class Student
 {
	 int rollno;
	 String name;
	 static String college="MTICA";
	 static void change()
	 {
		 college="KBJL";
	 }
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
		 Student.change();
		 Student s1=new Student(111,"Kiran");
		 Student s2=new Student(222,"Ramu");
		 Student s3=new Student(333," ravi");
		 s1.display();
		 s2.display();
		 s3.display();
 }
 }