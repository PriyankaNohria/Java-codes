import java.util.Scanner;
class Final
{
private final int x;
private final static int y;
Final(int z)
{
x=z;
}
static
{
y=6;
}
void disp()
{
System.out.println(x);
System.out.println(y);
}
public static void main(String ar[])
{
final Final obj=new Final(5);
obj.disp();
}
}