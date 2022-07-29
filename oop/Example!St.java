import java.util.*;

public class Main{
  public static class person{

    int age;
    String name;

    public void sayshi()
    {
      System.out.println(name + age+ "hello");

    }
  }
  public static void main(String args[])
  {
    person p1=new person();
    p1.sayshi();
    p1.age=24;
    p1.name="abhishek";

    p1.sayshi();


  }
}