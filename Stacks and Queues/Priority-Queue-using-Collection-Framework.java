import java.util.*;

class QueueB{
 public static void main(String[] args) {
  PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
  pq.add(3);
  pq.add(4);
  pq.add(1);
  pq.add(7);

  while(!pq.isEmpty()){
    System.out.println("topmost ---> " + pq.peek());
    pq.remove();
  }
 }
}


// Output
- without Comparator.reverseOrder()
  1
  3
  4
  7

- with Comparator.reverseOrder()  (this helps to reverse the order)
  7
  4
  3
  1
