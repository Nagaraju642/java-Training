class Empolyee
{
float salary=40000;
}
class Program extends Empolyee
{
int bonus=10000;
public static void main(String[] args)
{
Program P=new Program();
System.out.println("Programer salary is:"+P.salary);
System.out.println("Bonus of Programmer is:"+P.bonus);
}
}