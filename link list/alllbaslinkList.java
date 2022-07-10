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

    void addl(int val)
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
    void addf(int val)
    {
      Node node=new Node();
      node.data=val;

      if(this.size==0)
      {
        this.head=node;
        this.tail=node;
      }

      else{
        node.next=this.head;
        this.head=node;
      }
      this.size++;
    }

    void remf()
    {
      if(this.size==0)
      {
        System.out.println("list is empty");
      }
      else{
        this.head=this.head.next;
        this.size--;
      }
    }

    void reml()
    {
      if(this.size==0)
      {
        System.out.println("list is empty");
      }
      else{
        
        Node p=this.head;
        for(int i=1;i<this.size-1;i++)
        {
          p=p.next;

        }

        this.tail=p;
        p.next=null;
       // this.tail.next=null;
        this.size--;
      }
    }
    void display()
    {
      Node ptr=this.head;
      while(ptr !=null)
      {
        System.out.println(ptr.data);
        ptr=ptr.next;
      }
    }
  }
  public static void main(String[] args)
  {
      link li= new link();
      li.addl(10);
      li.addl(20);
      li.addl(30);
      li.addf(50);
      li.addf(60);
      li.remf();
      li.remf();
      li.reml();
      li.display();
  }
}