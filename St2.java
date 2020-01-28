import java.util.*;
class St2
{
public static void main(String ar[])
{
Scanner obj=new Scanner(System.in);
int n=obj.nextInt();
List<Integer> l=getMagic(n);
Iterator it=l.iterator();
while(it.hasNext())
{
System.out.print(it.next()+" ");
}
}
public static List<Integer> getMagic(int n)
{
List<Integer> l=new ArrayList<Integer>();
for(int i=0;i<n;i++)
{
l.add(i+1);
}
for(int i=1;i<l.size();i++)
{
if(isPrime(l.get(i)))
{
int ad=l.get(i);
for(int j=i+ad;j<l.size();j=j+ad)
{
l.remove(j);
j--;
}
} 
}
return l;
}
public static boolean isPrime(int n)
{
int flag=0;
if(n==0||n==1)
{
return false;
}
else if(n==2)
{
return true;
}
else
{
for(int i=2;i<=n/2;i++)
{
if(n%i==0)
{
flag=1;
break;
}
}
if(flag==0)
{
return true;
}
else{
return true;
}
}
}
}