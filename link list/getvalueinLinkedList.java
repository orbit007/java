import java.util.*;
public class Main{
  public static class Node{
    int data;
    Node next;
  }

  public static class link{

    Node head;
    Node tail;
    int size;

    void add(int val)
    {
      Node node=new Node();
      node.data=val;

      if(this.size==0)
      {
        this.head=node;
        this.tail=node;
        
      }
      else
      {
        this.tail.next=node;
        this.tail=node;

      }
      this.size++;

    }

    void rem()
    {
      if(this.size==0)
      {
        System.out.println(" list iws empy");
      }
      else{
        this.head=this.head.next;
        this.size--;

      }
    }

    void display()
    {

      Node ptr=this.head;

      while(ptr != null)
      {
        System.out.println(ptr.data);
        ptr=ptr.next;
      }
    }
    void getf()
    {
      if(this.size==0)
      {
        System.out.println("list is empty");
      }
      else{
      Node fs=this.head;
      System.out.println(fs.data);
      }
    }

    void getls()
    {
      if(this.size==0)
      {
        System.out.println("list is empty");
      }
      else{
      Node ls=this.tail;
      System.out.println(ls.data);
      }
    }

    void getAt(int n)
    {
      Node x= this.head;
      while(n !=0)
      {
        x=x.next;
        n--;
      }
      System.out.println(x.data);
    }
  }
  public static void main(String[] args)
  {
      link li= new link();
      li.add(10);
      li.add(20);
      li.add(30);
      li.add(40);
      li.getf();
      li.getls();
      li.getAt(2);
      


  }
}