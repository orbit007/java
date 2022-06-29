import java.util.*;
public class Main{
  public static class Node{
    int data;
    Node next;
  }
  public static class LinkedList{
    Node head;
    Node tail;
    int size;

    void addLast(int val)
    {
      Node node=new Node();
      node.data=val;

      if(this.size==0)
      {
        this.head=node;
        this.tail=node;

      }
      else{
        this.tail.next=node;
        this.tail=node;
      }
      this.size++;

    }
    int size()
    {
      return this.size;
    }

    void display()
    {
      Node ptr=this.head;
      while(ptr != null)
      {
        System.out.print(ptr.data);
        ptr=ptr.next;

      }
      System.out.println();
    }
  }

  public static void main(String[] args)
  {
    LinkedList li= new LinkedList();
    li.addLast(10);
    li.addLast(20);
    li.addLast(30);
    li.addLast(40);
    System.out.println(li.size());
    li.display();
    
  }
}