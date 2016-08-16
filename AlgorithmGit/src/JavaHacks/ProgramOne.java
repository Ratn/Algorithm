/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaHacks;

/**
 * you have a singly linked list of more than 2 element
 * change the middle node to doubly linked list. point it's previous pointer to 
 * first Node and next node to signly's next node. point last to middle element.
 * The idea is to create a shape of digit 8
 * 
 * 1-> 2-> 3-> 4-> 5  "3 will be doubly Node."
 * 3-> next = 4
 * 3-> prev = 1
 * 5-> next = 3
 * 
 * @author ratn
 */
interface MyInt {
    public void addNode(MyInt obj);
}
class Node implements MyInt{
    public int data;
    public MyInt next;
    @Override
    public void addNode(MyInt obj) {
        System.out.print("Node");
        this.next = (Node) obj;
    }
    Node(int x) {
        this.data = x;
        this.next = null;
    }
}
class MiddleNode implements MyInt{
    public int data;
    MyInt next;
    MyInt prev;
    @Override
    public void addNode(MyInt obj) {
        System.out.print("Middle");
        this.next = (MiddleNode) obj;
    }
    MiddleNode(int x) {
        this.data = x;
        this.next = null;
        this.prev = null;
    }
}
public class ProgramOne {
    public static void main (String[] args) {
        /*
        MyInt node = new Node(1);
        MyInt middle = new MiddleNode(2);
        Node node = new Node(1);
        node.addNode(middle);
        */
        Node node = new Node(1);
        MiddleNode middle = new MiddleNode(2);
        node.next = (MyInt)middle;
        
        //node.next.addNode(new Node(3));
        while(node.next != null ) {
            System.out.println(node.data);
            node = (Node) node.next;
        }
    }
}
