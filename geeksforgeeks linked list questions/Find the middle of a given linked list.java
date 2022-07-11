import java.util.*;
public class Main{

  public static class Node{
    int data;
    Node next;
  }

  public static class linkedlist{
    Node head;
    Node tail;
    int size;


    void add(int vall)
    {
      Node node = new Node();
      node.data=vall;

      if(this.size==0)
      {
        this.head=node;
        this.tail=node;
      }
      else
      {
        node.next=this.head;
        this.head=node;

      }

     this.size++;


    }

    int mid()
    {
       Node f=this.head;
       Node s=this.head;

       while(f.next != null && f.next.next != null)
       {
         s=s.next;
         f=f.next.next;
       } 

      return s.data; 
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
  }

  public static void main(String[] args)
  {
     linkedlist li = new linkedlist();
     li.add(10);
     li.add(20);
     li.add(30);
     li.add(40);
     li.add(50);
     li.display();
     int fin=li.mid();
     System.out.println(fin);

  }
}