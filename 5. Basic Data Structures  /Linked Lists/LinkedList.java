import java.util.*;
public class LinkedList(){
   
    private class Node(){
      int data=0;
      Node next=null;
      public Node(int data){
        this.data=data;
      }
    }
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;

    }

    private void addFirstNode(Node node) {
        if (this.size == 0) {
            this.head = this.tail = node;
        }

        else {
            node.next = this.head;
            this.head = node;
        }

        this.size++;
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        addFirstNode(node);

    }

    private void addLastNode(Node node) {
        if (this.size == 0) {
            this.tail = this.head = 0;
        } else {
            this.tail.next = node;
            this.tail = node;

        }
        this.size++;

    }

    public void addLast(int data) {
        Node node = new Node(data);
        addLastNode(node);
    }

    private void addNodeAt(Node node, int idx) {
        if (idx == 0) {
            addFirstNode(node);
        } else if (idx == this.size) {
            addLastNode(node);
        } else {
            Node prev = getNodeAt(idx - 1);
            node.next = prev.next;
            prev.next = node;
            this.size++;
        }

    }

    public void addAt(int data, int idx) {
        if (idx < 0 || idx > this.size) {
            return;
        }
        Node node = new Node(data);
        addNodeAt(node, idx);
    }

    private node removeFirstNode() {
        Node rn = head;
        if (this.size == 1) {
            this.head = this.tail = null;
        } else {

            this.head = this.head.next;
            rn.next = null;
        }
        this.size--;
        return rn;
    }

    public int removeFirst() {
        if (this.size == 0) {
            return -1;
        }
        Node rn = removeFirstNode();
        return rn.data;
    }

    private node removeLastNode() {
        Node rn = this.tail;
        if (this.size == 1) {
            this.head = this.tail = null;
        } else {
            Node secondLastNode = getNodeAt(this.size - 2);
            secondLastNode.next = null;
            this.tail = secondLastNode;
        }

        this.size--;
        return rn;

    }

    public int removeLast() {
        if (this.size == 0) {
            return -1;
        }
        Node rn = removeLastNode();
        return rn.data;
    }

    private node removeNodeAt(int idx) {
        if (idx == 0) {
            return removeFirstNode();
        } else if (idx == this.size - 1) {
            return removeLastNode();
        } else {
            Node rnp = getNodeAt(idx - 1);
            Node rn = rnp.next;
            rnp.next = rnp.next.next;
            rn.next = null;
            return rn;
        }

    }

    public int removeAt(int idx) {
        if (idx < 0 || idx >= this.size) {
            return -1;
        }
        Node rn = removeNodeAt(idx);
        return rn.data;

    }

    private int getNodeAt(int idx) {
        Node temp = this.head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp;
    }

}
