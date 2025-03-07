import java.util.*;
class Node 
{
    int data;
    Node prev;
    Node next;

    public Node(int data) 
  {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class DoublyLinkedList 
{
    Node head;
    Node tail;

    public DoublyLinkedList() 
  {
        this.head = null;
        this.tail = null;
    }

    public void insertAtHead(int data) 
  {
        Node newNode = new Node(data);

        if (head == null) 
        {
            head = newNode;
            tail = newNode;
        } 
        else 
        {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtTail(int data) 
  {
        Node newNode = new Node(data);
        if (tail == null) 
        {
            head = newNode;
            tail = newNode;
        } 
        else 
        {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void printForward()
  {
        Node current = head;
        System.out.print("Forward Traversal: ");
        while (current != null) 
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void printBackward() 
  {
        Node current = tail;
        System.out.print("Backward Traversal: ");
        while (current != null) 
        {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}

public class DoublyLinkedListImplementation 
{
    public static void main(String[] args) 
  {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtHead(1);
        dll.insertAtHead(2);
        dll.insertAtTail(3);
        dll.insertAtTail(4);
        dll.insertAtHead(5);

        dll.printForward();
        dll.printBackward();
    }
}
