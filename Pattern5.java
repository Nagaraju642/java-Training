
class Pattern5
{
static void printPatternOneRow(char ch,int nc)
{
for(int i=0;i<nc;i++)
{
System.out.print(ch);
}
System.out.print("\n");
}
static void printPattern(int nr, char ch)
{
for(int i=1;i<=nr;i++)
{
printPatternOneRow(ch,i);
}
}
public static void main(String[] args)
{
printPattern(15,'*');
}
}