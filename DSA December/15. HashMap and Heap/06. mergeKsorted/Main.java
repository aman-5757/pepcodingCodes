import java.io.*;
import java.util.*;

public class Main {
    
    public static class pair implements Comparable<pair>{
        int val;
        int listNo;
        int idx;
        pair(){}
        pair(int val, int listNo, int idx){
            this.val = val;
            this.listNo = listNo;
            this.idx = idx;
        }
        public int compareTo(pair other){
            return this.val - other.val;
        }
    }
    
   public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
      ArrayList<Integer> ans = new ArrayList<>();
      
    //   PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->{
    //         return a.val - b.val;
    //     });
    
    PriorityQueue<pair> pq = new PriorityQueue<>();
    
    for(int i = 0; i<lists.size(); i++){
        ArrayList<Integer> curr = lists.get(i);
        pair temp = new pair(curr.get(0), i, 0);
        pq.add(temp);
    }
    
    while(pq.size() != 0){
        pair rem = pq.remove(); //pair removed
        ans.add(rem.val);
        int nwIdx = rem.idx + 1;
        int nwListNo = rem.listNo;
        
        
        if(nwIdx < lists.get(nwListNo).size()){
            int nwVal = lists.get(nwListNo).get(nwIdx);
            pair temp = new pair(nwVal, nwListNo, nwIdx);
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