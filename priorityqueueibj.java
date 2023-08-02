import java.util.*;

public class priorityqueueibj {
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

    public static void main(String args[]) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("Addi", 1));
        pq.add((new Student("Ashi", 10)));
        pq.add((new Student("King", 50)));
        pq.add((new Student("Yamoshi", 25)));
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name);
            pq.remove();
        }
    }
}