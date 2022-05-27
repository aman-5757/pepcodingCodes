import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;

public class Main{
    // HashMap Demo
    public static void main(String [] args){
        // create
        HashMap<Integer, Integer> hm = new HashMap<>();
        //put --- add
        hm.put(1, 5);
        hm.put(3, 2);
        hm.put(2, 4);
        hm.put(7, 14);
        hm.put(3, 7);

        //get --- get(key)
        // int value = hm.get(7);
        // int value = hm.get(9); -- error


        // if(hm.containsKey(7) == true){
        //     System.out.println(hm.get(7));
        // }


        // System.out.println(value);

        //size --- size()
        // int sz = hm.size();
        // System.out.println(sz);


        //-----------------------------------------------------------
        //containsKey(key) -- T/F
        // boolean isPresent = hm.containsKey(9);
        // System.out.println(isPresent);


        //keySet()
        Set<Integer> al = hm.keySet();
        System.out.println(al);


        //remove(key);
        // System.out.println(hm);

        // hm.remove(3);



        System.out.println(hm);


    }
}