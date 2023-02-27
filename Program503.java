
 class Box
{
double width;
double height;
double depth;
}
class Program503
{
public static void main(String[] args)
{
Box myBox=new Box();
double vol;
myBox.width=100;
myBox.height=200;
myBox.depth=150;
vol=myBox.width*myBox.height*myBox.depth;
System.out.println("Volume is"+vol);
}
}                                                                                                                                                                                      