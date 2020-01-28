import java.io.*;
class FileInStream
{
public static void main(String ar[])
{
try
{
FileInputStream t=new FileInputStream("file.txt");
int i=t.read();
System.out.println((char)i);
t.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}