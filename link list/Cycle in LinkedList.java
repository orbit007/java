class GFG{
    boolean iscycle(Node head)
    {
        Node slow=head;
        NOde fast=head;

        while(fast !=null && fast.next != null)
        {
            slow=slow.next;
            fast=fast.next.next;

            if(fast == slow)
            {
                return true;  // cycle
            }
        }
        return false;  // not cycle
    }
}