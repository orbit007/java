import java.util.*;
public class Main{
  public static class person{
    int age;
    String name;

    public void sayhi()
    {
      System.out.println(name+" "+age+"hello");
    }
    
  }
  public static void game(person p1,person p2)
    {
      int tage=p1.age;
      p1.age=p2.age;
      p2.age=tage;

      String tname=p1.name;
      p1.name=p2.name;
      p2.name=tname;
    }
  public static void main(String args[])
  {
    person p1=new person();
    p1.age=24;
    p1.name="abhishek";

    person p2=new person();
    p2.age=25;
    p2.name="rahul";

    p1.sayhi();
    p2.sayhi();
    game(p1,p2);
    p1.sayhi();
    p2.sayhi();

  }
}