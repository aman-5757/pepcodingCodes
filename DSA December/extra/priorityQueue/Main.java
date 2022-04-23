import java.util.PriorityQueue;
import java.util.*;


public class Main{
    public static class pair{
        int val1;
        int val2;
        pair(){

        }
        pair(int val1, int val2){
            this.val1 = val1;
            this.val2 = val2;
        }
    }


    public static void main(String [] args){
        //create
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            return b-a;
        }); 
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); 

        // //add
        pq.add(10);
        pq.add(50);
        pq.add(30);
        pq.add(20);
        pq.add(60);
        pq.add(8);

        // //peek
         int top = pq.remove();


        System.out.println(top);

        // // int size = pq.size();
        
        // // System.out.println(size);

        // while(pq.size() != 0){
        //      System.out.println( pq.remove());
        // }


        //================new concept with lambda=================

        // int [][] arr = {{2,3}, 
        //                 {4,9}, 
        //                 {6,1}, 
        //                 {7,3}, 
        //                 {1,0}};

        // PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->{
        //     return  a.val2-b.val2;
        // }); 

        // pq.add(new pair(2,3));
        // pq.add(new pair(4,9));
        // pq.add(new pair(6,1));
        // pq.add(new pair(7,3));
        // pq.add(new pair(1,0));
        // pq.add(new pair(-1,10));


        // while(pq.size() != 0){
        //     pair rem = pq.remove();
        //     System.out.print(rem.val1 + " ");
        //     System.out.println(rem.val2);
        // }
        
 





    }
}