import java.util.*;
public class Main{
  public static class person{
    int age;
    String name;

    public void sayHi()
    {
      System.out.println(name+ " "+ age+ " "+ "hello");

    }
  }
  public static void swap(person p1, person p2)
  {
    person temp=p1;
    p1=p2;
    p2=temp;
  }
  public static void main(String args[])
  {
    person p1=new person();
    p1.name="abhishek";
    p1.age=24;

    person p2=new person();
    p2.name="rahul";
    p2.age=25;

    p1.sayHi();
    p2.sayHi();

    swap(p1,p2);
    p1.sayHi();
    p2.sayHi();



  }
}