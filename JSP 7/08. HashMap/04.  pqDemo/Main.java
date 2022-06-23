import java.util.PriorityQueue;

public class Main{
    public static void main(String [] args){

        //Create
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            return b-a;
        });

        //add
        pq.add(50);
        pq.add(60);
        pq.add(30);
        pq.add(10);
        pq.add(40);

        //peek
        // int min = pq.peek();
        // System.out.println(min);

        //remove
        System.out.println(pq.size());
        int min = pq.remove();
        System.out.println(min);
        System.out.println(pq.remove());
        System.out.println(pq.size());


    }
}