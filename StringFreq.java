import java.util.Scanner;
class StringFreq
{
public static void main(String ar[])
{
int count=1;
Scanner obj=new Scanner(System.in);
String str=obj.next();
char ch[]=str.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(ch[i]=='0')
{}
else{
for(int j=i+1;j<ch.length;j++)
{
if(ch[i]==ch[j])
{
count++;
ch[j]='0';
}
}
if(count>=1){
System.out.print(ch[i]);
System.out.print(count);
}
else{}
count=1;
}}
}
}
