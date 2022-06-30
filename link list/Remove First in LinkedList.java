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

    void addLast(int val)
    {
      Node node = new Node();
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

    void display()
    {
      Node ptr=this.head;
      while(ptr != null)
      {
        System.out.print(ptr.data);
        ptr=ptr.next;

      }

    }
    void rem()
    {
        if(this.size==0)
        {
          System.out.println();
        }
        else{
          this.head=this.head.next;
          this.size--;
        }
    }
  }
  public static void main(String[] args)
  {
        link li=new link();
        li.addLast(10);
        li.addLast(20);
        li.addLast(30);
        li.addLast(40);
        
        li.rem();
        li.display();
  }
}