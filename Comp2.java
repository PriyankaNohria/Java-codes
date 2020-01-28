import java.util.*;
class Student
{
int roll;
String name;
int age;
Student(int roll,String name,int age)
{
this.roll=roll;
this.name=name;
this.age=age;
}
}
class AgeComparator implements Comparator<Student>
{
public int compare(Student st1,Student st2)
{
if(st1.age==st2.age)
return 0;
else if(st1.age>st2.age)
return 1;
else
return -1;
}
}
class NameComp implements Comparator<Student>
{
public int compare(Student st1,Student st2)
{
return st1.name.compareTo(st2.name); 
}
}
public class Comp2
{
public static void main(String ar[])
{
TreeSet<Student> al=new TreeSet<Student>(new NameComp());
al.add(new Student(101,"Vijay",23));
al.add(new Student(106,"Ajay",27));
al.add(new Student(105,"Jai",21));
System.out.println("Name According");
Iterator it=al.iterator();
while(it.hasNext())
{
Student st=(Student)it.next();
System.out.println(st.roll+" "+st.name+" "+st.age);
}
System.out.println("Age According");
TreeSet<Student> al1=new TreeSet<Student>(new AgeComparator());
al1.addAll(al);
Iterator it1=al.iterator();
while(it1.hasNext())
{
Student st1=(Student)it1.next();
System.out.println(st1.roll+" "+st1.name+" "+st1.age);
}
}
}