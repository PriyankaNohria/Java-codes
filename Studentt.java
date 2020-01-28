import java.util.*;

public class Studentt {
  
   private static class MyComp implements Comparator<Studentt>
    {
      public int compare(Studentt s1,Studentt s2){
          return s1.id-s2.id;
         }
     }

public static void main(String ar[]){

 Studentt s=new Studentt(2,"abc",2.0f);
 List<Studentt> list=new ArrayList<>();
 list.add(s);
 list.add(new Studentt(3,"xyz",3.0f));
 list.add(new Studentt(5,"xs",4.0f));
 list.add(new Studentt(1,"vc",5.0f));
 list.add(new Studentt(4,"mno",6.0f));
Collections.sort(list,new MyComp());
 for(Studentt d:list)
   System.out.println(d);

    System.out.println("**************");
}

 private int id;
 private String name;
 private float cgpa;
 public Studentt(int id,String name,float cgpa) {
  this.id=id;
  this.name=name;
  this.cgpa=cgpa;
 }

public String toString(){
  return "[id : "+id+",name : "+name+",cgpa : "+cgpa+"]";
}
}