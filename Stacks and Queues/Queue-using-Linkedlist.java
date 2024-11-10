import java.util.*;

public class QueueB {

  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }

  }

  static class Queue {
    static Node head = null;
    static Node tail = null;

    public static boolean isEmpty() {
      return head == null && tail == null;
    }

    public static void add(int data) {

      Node newNode = new Node(data);

      if (head == null) {
        head = tail = newNode;
        return;
      }

      tail.next = newNode;
      tail = newNode;

    }

    public static int remove() {
      if (isEmpty()) {
        System.out.println("empty hai");
        return -1;
      }

      int front = head.data;

      // single element
      if (tail == head) {
        tail = head = null;
      } else {
        head = head.next;
      }

      return front;

    }

    public static int peek() {
      if (isEmpty()) {
        System.out.println("empty hai");
        return -1;
      }

      return head.data;
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);

    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }
  }
}


// Output
- 1
- 2
- 3


- Using LinkedList for queues is advantageous because it provides efficient 𝑂(1) enqueue and dequeue operations, supports dynamic sizing, and simplifies queue management.
- LinkedList in Java implements both the List and Queue interfaces.
