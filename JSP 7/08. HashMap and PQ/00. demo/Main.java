import java.util.HashMap;

public class Main{
    public static void main(String [] args){
        //Create : Country <--> Population
        HashMap<String, Integer> hm = new HashMap<>();

        //add : put(K,V)

        hm.put("India", 4200);
        hm.put("China", 14200);
        hm.put("USA", 84200);
        hm.put("Bangladesh", 44200);
        // hm.put("Pak", 8200);

        boolean isPresent = hm.containsKey("Pak");

        System.out.println(isPresent);
        hm.put("USA", 2);


        /*
        Special Case incr. value of India by 1
        */

        hm.put("India", hm.get("India")+1);

        //Size()
        int size = hm.size();
        // System.out.println(size);

        //print HM
        System.out.println(hm);

        //remove(K)
        // hm.remove("India");
        // System.out.println(hm);


        // //get(K)
        // int usa_ppl = hm.get("USA");
        // System.out.println(usa_ppl);


        // //keySet()
        // for(String s : hm.keySet())
        //     System.out.println(s);








    }
}