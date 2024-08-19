import java.util.*;

class Node {
  int data;
  Node next;

  // Constructor with data
  Node(int data) {
      this.data = data;
      this.next = null;
  }
}

public class linked_list {
  // Function to print the linked list
  public static void printLL(Node head) {
      while (head != null) {
          System.out.print(head.data + " ");
          head = head.next;
      }
      System.out.println();
  }

  // Function to insert a new node at the head of the linked list
  public static Node insertHead(Node head, int val) {
      Node temp = new Node(val);
      temp.next = head;
      return temp;
  }

  public static void main(String[] args) {
      // Creating a linked list with initial elements
      Node head = new Node(12);
      head.next = new Node(8);
      head.next.next = new Node(5);
      head.next.next.next = new Node(7);

      // Inserting a new node at the head of the linked list
      head = insertHead(head, 100);

      // Printing the linked list
      System.err.println();
      printLL(head);
  }
}
