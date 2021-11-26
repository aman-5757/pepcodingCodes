import java.util.ArrayList;
public class demo2{
    public static void main(String [] args){
        //create
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 1; i<=10; i++){
            al.add(i+10);
        }

        System.out.println(al.size());


        // System.out.println(al);
        // System.out.println(al.get(5));        //  arr[5]

        // al.set(5, 160);                         //idx, new VAlue
        //  System.out.println(al.get(5)); 


    }
}