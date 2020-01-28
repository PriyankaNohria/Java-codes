import java.util.*;
class Student
{
String name;
int roll,age;
Student(int roll,String name,int age)
{
this.roll=roll;
this.name=name;
this.age=age;
}
}
class Arr1
{
public static void main(String ar[])
{
Student s1=new Student(1,"A",10);
Student s2=new Student(2,"B",20);
Student s3=new Student(3,"C",30);
ArrayList<Student> a1=new ArrayList<Student>();
a1.add(s1);
a1.add(s2);
a1.add(s3);
Iterator it=a1.iterator();
while(it.hasNext())
{
Student x=(Student)it.next();
System.out.println(x.name+" "+x.roll+" "+x.age);
}
}
}