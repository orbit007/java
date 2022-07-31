import java.util.*;
import java.util.Stack;
import java.util.Queue;
import java.util.ArrayDeque;
public class Main{

  public static void QueueIntro()
  {

    Queue<Integer> queue=new ArrayDeque<>();
    
    System.out.println(queue);
    queue.add(10);
    System.out.println(queue.size()+"  "+queue);
    queue.add(20);
    System.out.println(queue.size()+"  "+queue);
    queue.add(30);
    System.out.println(queue.size()+"  "+queue);
    queue.add(40);
    System.out.println(queue.size()+"  "+queue);
    queue.add(50);
    System.out.println(queue.size()+"  "+queue);

    for (int ele: queue)
    {
      System.out.println(ele);
    }

    queue.remove();
    System.out.println(queue);

    System.out.println(queue.peek());
  }
  public static void main(String args[])
  {

    Stack<Integer> st=new Stack<Integer>();

    System.out.println(st);
    st.push(10);
    System.out.println(st.size()+"  "+st);
    st.push(20);
    System.out.println(st.size()+"  "+st);
    st.push(30);
    System.out.println(st.size()+"  "+st);
    st.push(40);
    System.out.println(st.size()+"  "+st);

    for (int ele: st)
    {
      System.out.println(ele);
    }
    System.out.println(st.pop());
    System.out.println(st);
    System.out.println(st.peek());

    QueueIntro();
  }
}