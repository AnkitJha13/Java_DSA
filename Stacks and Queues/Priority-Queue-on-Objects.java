import java.util.*;

public class QueueB {

  static class Student implements Comparable<Student> {

    String name;
    int rank;

    public Student(String name, int rank) {
      this.name = name;
      this.rank = rank;
    }

    @Override
    public int compareTo(Student s2) {
      return this.rank - s2.rank;
    }

  }

  public static void main(String[] args) {
    PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
    pq.add(new Student("athena", 1));
    pq.add(new Student("levinho", 4));
    pq.add(new Student("mortal", 2));
    pq.add(new Student("scout", 7));

    while (!pq.isEmpty()) {
      System.out.println(pq.peek().name + " " + pq.peek().rank);
      pq.remove();
    }
  }
}


// Output
- without comparator
  athena 1
  mortal 2
  levinho 4
  scout 7

- with comparator (just reverse the order)
  scout 7
  levinho 4
  mortal 2
  athena 1
