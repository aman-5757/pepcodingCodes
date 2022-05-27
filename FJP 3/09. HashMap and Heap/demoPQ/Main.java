import java.util.*;

public class Main{
    public static void main(String [] args){
        int [] arr =  {1,21, 57, 92, 13, 43, 22, 21, 6};

        //create
        // PriorityQueue<Integer> pq = new PriorityQueue<>();          //default behaviour -- min PQ
        // for(int ele : arr)
        //     pq.add(ele);

        // while(pq.size() != 0){
        //     System.out.println(pq.peek());
        //     pq.remove();
        // }




        //max Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());          //default behaviour -- min PQ
        for(int ele : arr)
            pq.add(ele);

        while(pq.size() != 0){
            System.out.println(pq.peek());
            pq.remove();
        }

    }
}
