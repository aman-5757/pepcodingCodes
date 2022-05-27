import java.io.*;
import java.util.*;

public class Main {

   public static class triplet implements Comparable<triplet>{       //interface    
      int li;        // which list
      int idx;       // which element in a list
      int val;       // value??
      
      triplet(){

      }
      triplet(int li, int idx, int val){
         this.li = li;
         this.idx = idx;
         this.val = val;
      }


      public int compareTo(triplet o){
         return this.val - o.val;
      }

   }

   // li_idx_val


   public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
      ArrayList<Integer> ans = new ArrayList<>();

      PriorityQueue<triplet> pq = new PriorityQueue<>();

      for(int i = 0; i<lists.size(); i++){
         triplet temp = new triplet(i, 0, lists.get(i).get(0));
         pq.add(temp);
      }

      while(pq.size() > 0){
         triplet top = pq.remove();
         ans.add(top.val);

         int newLi = top.li;
         int newIdx = top.idx + 1;

         if(newIdx < lists.get(top.li).size()){
            int newVal = lists.get(newLi).get(newIdx);

            triplet temp = new triplet(newLi, newIdx, newVal);
            pq.add(temp);
         }

      }
      
      return ans;
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int k = Integer.parseInt(br.readLine());
      ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
      for(int i = 0; i < k; i++){
         ArrayList<Integer> list = new ArrayList<>();

         int n = Integer.parseInt(br.readLine());
         String[] elements = br.readLine().split(" ");
         for(int j = 0; j < n; j++){
            list.add(Integer.parseInt(elements[j]));
         }

         lists.add(list);
      }

      ArrayList<Integer> mlist = mergeKSortedLists(lists);
      for(int val: mlist){
         System.out.print(val + " ");
      }
      System.out.println();
   }

}