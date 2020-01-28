import java.util.*;
class Book
{
String title;
double price;
Book(String title,double price)
{
this.title=title;
this.price=price;
}
String getTitle()
{
return title;
}
double getPrice()
{
return price;
}
}
class MyComparator implements Comparator
{
public int compare(Object obj1,Object obj2)
{
Book book1=(Book)obj1;
Book book2=(Book)obj2;
if(book1.getPrice()<book2.getPrice())
return(-1);
else
return(1);
}
}
public class Tree
{
public static void main(String ar[])
{
Book b1,b2,b3;
b1=new Book("PHP",30.000);
b2=new Book("Java",50.000);
b3=new Book("C++",40.000);
TreeSet t=new TreeSet(new MyComparator());
t.add(b1);
t.add(b2);
t.add(b3);
Book b;
Iterator it=t.iterator();
while(it.hasNext())
{
b=(Book)(it.next());
System.out.println(b.getTitle()+"  "+b.getPrice());
}
}
}