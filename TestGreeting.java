 class Greeting
{
void greet()
{
System.out.println("greet method of class Greeting called");
System.out.println("Thanks");
}
}
public class TestGreeting
{
public static void main(String[] args)
{
Greeting ob=new Greeting();
ob.greet();
}
}