import java.util.*;

class Node {
    int data;
    Node next;
  
    Node(int data) {
        this.data = data;
        this.next = null;
    }
  }
  
  class sll_operations {
    // Function to insert a node at the beginning of the linked list.
    Node insertAtBegining(Node head, int x) {
        // Create a new node with given data
        Node newNode = new Node(x);
        // Point the next of new node to the current head
        newNode.next = head;
        // Update the head to the new node
        head = newNode;
        return head;
    }
  
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // Create a new node with given data
        Node newNode = new Node(x);
        // If the linked list is empty, return the new node as head
        if (head == null) {
            return newNode;
        }
        // Traverse to the end of the linked list
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        // Point the next of the last node to the new node
        curr.next = newNode;
        return head;
    }
  
    // Function to print the linked list.
    void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
  
    public static void main(String[] args) {
        sll_operations solution = new sll_operations();
        Node head = null;
  
        // Insert nodes at the beginning
        head = solution.insertAtBegining(head, 3);
        head = solution.insertAtBegining(head, 2);
        head = solution.insertAtBegining(head, 1);
  
        // Print the linked list
        System.out.println("Linked list after inserting nodes at the beginning:");
        solution.printList(head);
  
        // Insert nodes at the end
        head = solution.insertAtEnd(head, 4);
        head = solution.insertAtEnd(head, 5);
        head = solution.insertAtEnd(head, 6);
  
        // Print the linked list
        System.out.println("Linked list after inserting nodes at the end:");
        solution.printList(head);
    }
  }
  