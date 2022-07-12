import java.util.*;
public class Main{
  public static class Node{
    int data;
    Node next;


  }
  public static class Linkedlist{
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
        node.next=this.head;
        this.head=node;

      }
      this.size++;

    }

    void display()
    {
      Node ptr=this.head;
      if(this.size==0)
      {
        System.out.println("list is empty");
      }
      else{
        while(ptr != null)
        {
          System.out.println(ptr.data);
          ptr=ptr.next;
        }
      }
    }
    Node getAt(int n)
    {
     

      Node x=this.head;
      for(int i=0;i<n;i++)
      {
        x=x.next;

      }

      return x;
    
    }

    void rev()
    {
      int l=0;
      int r=this.size-1;

      while(l<r)
      {
        Node n1=this.getAt(l);
        Node n2=this.getAt(r);

        int temp=n1.data;
        n1.data=n2.data;
        n2.data=temp;
        l++;
        r--;
      }
    }
  }
  public static void main(String[] args)
  {
    Linkedlist li=new Linkedlist();
    li.add(10);
    li.add(20);
    li.add(30);
    li.add(40);
    li.display();
    li.rev();
    li.display();
    

  }
}