/*import java.util.*;
public class PriorityQueue12{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        pq.add(30); pq.add(10); pq.add(20);
        System.out.println(pq.peek());
    }

}*/
/*import java.util.*;
public class PriorityQueue12{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        pq.add(30); pq.add(10); pq.add(20);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }

}*/

/*import java.util.*;
class Student{
    String name;
    int marks;
    Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
}
public class PriorityQueue12{
    public static void main(String[] args) {
         PriorityQueue<Student> pq= new PriorityQueue<>((a,b)->b.marks-a.marks);
          pq.add(new Student("Riya",70)); 
          pq.add(new Student("Aman",90));
          pq.add(new Student("neha",80));
          while(!pq.isEmpty()){
            Student s=pq.poll();
            System.out.println(s.name + " "+ s.marks);
          }
        
    }
}*/

import java.util.*;
public class PriorityQueue12{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0;i<3;i++){
            pq.add(i);
             pq.add(1);

        }
        System.out.println(pq);
    }}