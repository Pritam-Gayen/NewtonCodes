import java.util.*;
//import java.io.*;

public class TestHashNode
{
    public static void main(String[] args)
    {
        HashMap<Node,Integer> hm=new HashMap<>();
        Node head=new Node(20);
        hm.put(head,1);
        System.out.println(hm.get(head));
    }

}
class Node
{
    int val;
    Node next;
    Node(int val)
    {
        this.val=val;
        next=null;
    }
}
