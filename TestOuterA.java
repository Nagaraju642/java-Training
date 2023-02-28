 class TestOuterA 
{
static int data=600;
static class Inner
{
static void msg()
{
System.out.println("data is"+data);
}
}
public static void main(String[] args)
{
TestOuter.Inner obj=new TestOuter.Inner();
obj.msg();
}
}
