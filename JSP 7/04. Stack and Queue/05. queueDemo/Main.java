import java.util.LinkedList;
import java.util.Queue;

public class Main{
    public static void main(String[]args){
        //create
        Queue<Integer> qu = new LinkedList<>();

        // ArrayDequeue<Integer> adq = new ArrayDequeue<>();

        //add
        qu.add(10);
        qu.add(20);
        qu.add(30);
        qu.add(40);
        qu.add(50);

        //size
        System.out.println(qu.size());

        //remove
        qu.remove();
        

        //get--peek
        int ele = qu.peek();
        System.out.println(ele);
        System.out.println(qu.size());
    }
}