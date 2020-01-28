import java.util.*;
class Student implements Comparable<Student>
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
public int compareTo(Student st)
{
if(age==st.age)
return 0;
else if(age>st.age)
return 1;
else
return -1;
}
}
public class Comp
{
public static void main(String ar[])
{
ArrayList<Student> al=new ArrayList<Student>();
al.add(new Student(101,"Vinesh",25));
al.add(new Student(106,"Deepak",29));
al.add(new Student(105,"Aman",24));
Collections.sort(al);
for(Student st:al)
System.out.println(st.roll+" "+st.name+" "+st.age);
}
} 