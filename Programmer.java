class Empolyee
{
float salary=40000;
}
class Programmer extends Empolyee
{
int bonus=10000;
public static void main(String[] args)
{
Programmer P=new Programmer();
System.out.println("Programmer salary is : "+P.salary);
System.out.println("Bonus of Programmer is : "+P.bonus);
}
}