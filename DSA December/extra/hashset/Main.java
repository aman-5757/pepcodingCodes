/*
add, remove, size, get, update, find
*/


import java.util.HashSet;


public class Main
{
	public static void main(String[] args) {
        //Hashset createion
        HashSet<Integer> hs = new HashSet<>();


        //add
        hs.add(80);
        hs.add(20);
        hs.add(30);
        hs.add(60);
        hs.add(60);
        hs.add(70);
        hs.add(70);
        hs.add(40);


		// System.out.println(hs);

        //REMOVE
        hs.remove(30);


        //size
        int size = hs.size();


        //get or find
        boolean is10 = hs.contains(10);        //false
        boolean is20 = hs.contains(20);        //true

		System.out.println(is10);
		System.out.println(is20);
	}
}
