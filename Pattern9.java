
class Pattern9
{
static void printPatternOneRow(char ch,int nc)
{
for(int i=0;i<nc;i++)
{
System.out.print(ch);
}
System.out.print("\n");
}
static void printPatternDec(int nr, char ch)
{
for(int i=nr;i>=0;i--)
{
printPatternOneRow(ch,i);
}
}
static void printPatternInc(int nr, char ch)
{
for(int i=0;i<=nr;i++)
{
printPatternOneRow(ch,i);
}
}
public static void main(String[] args)
{
int n=20;
char c='&';
if(n%2==0)
{
printPatternInc(n/2,c);
printPatternDec(n/2,c);
}
else
{
printPatternInc((int)(n/2),c);
printPatternDec((n+1)/2,c);
}
}
}