import java.io.*;
import java.util.*;
//k = 2 (TV)
public class Main {

  public static class HashMap<K, V> {
    private class HMNode {
      K key;
      V value;

      HMNode(K key, V value) {
        this.key = key;
        this.value = value;
      }
    }

    private int size; // n-- number of nodes
    private LinkedList<HMNode>[] buckets; // N = buckets.length

    public HashMap() {
      initbuckets(4);
      size = 0;
    }

    private void initbuckets(int N) {       //N -- size of bucket or bucket count
      buckets = new LinkedList[N];
      for (int bi = 0; bi < buckets.length; bi++) {
        buckets[bi] = new LinkedList<>();
      }
    }

    private int findBucketIdx(K key){
      int hc = key.hashCode();      //-infi to +infi
      int bi = Math.abs(hc) % buckets.length;

      return bi;
    }

    public int findDataIdxInBucket(K Keyy, int bi) {
            LinkedList<HMNode> temp = buckets[bi];
            if (temp.size() == 0)
                return -1;
            for (int i = 0; i < temp.size(); i++) {
                if (temp.get(i).key.equals(Keyy))
                    return i;
            }
            return -1;
        }

    private void rehashing()throws Exception{
      LinkedList<HMNode>[] prevBuckets = buckets;
      initbuckets(prevBuckets.length * 2);
      size = 0;
      
      for(int i = 0; i<prevBuckets.length;i++){
          LinkedList<HMNode> curr = prevBuckets[i];
          for(int j = 0; j<curr.size(); j++){
              HMNode currEle = curr.get(j);
              put(currEle.key, currEle.value);
          }
      }
      
      
    }

    public void put(K key, V value) throws Exception {
      int bi = findBucketIdx(key);        //bucketIdx
      int di = findDataIdxInBucket(key, bi);  //dataIdx

      if(di == -1){
        //insert
        LinkedList<HMNode> tmp = buckets[bi];
        HMNode node = new HMNode(key,value);
        tmp.add(node);    //addLast
        size++;
      }
      else{
        //update
        LinkedList<HMNode> tmp = buckets[bi];
        HMNode node = tmp.get(di);
        node.value = value;
      }


      double lambda = (size*1.0)/ buckets.length;
      if(lambda > 2){
        rehashing();
      }

    }

    public V get(K key) throws Exception {
      int bi = findBucketIdx(key);        //bucketIdx
      int di = findDataIdxInBucket(key, bi);  //dataIdx

      if(di == -1){
          // nahi mila
          return null;
      }
      else{
          // index par data mil gaya
          LinkedList<HMNode> currList = buckets[bi];
          HMNode currEle = currList.get(di);
          return currEle.value;
      }
    }

    public boolean containsKey(K key) {
      int bi = findBucketIdx(key);        //bucketIdx   --O(1)
      int di = findDataIdxInBucket(key, bi);  //dataIdx  --O(lamdba)

      if(di == -1){
          // nahi mila
          return false;
      }
      else{
          // index par data mil gaya
          
          return true;
      }
    }

    public V remove(K key) throws Exception {
      int bi = findBucketIdx(key);        //bucketIdx
      int di = findDataIdxInBucket(key, bi);  //dataIdx

      if(di == -1){
        //key nahi hai
        return null;
      }
      else{
        //key present hai
        LinkedList<HMNode> currList = buckets[bi];
        HMNode currEle = currList.get(di);
        V value = currEle.value;
        currList.remove(di);
        size--;
        return value;
      }

    }

    public ArrayList<K> keyset() throws Exception {
      ArrayList<K> allKeys = new ArrayList<>();
      for(LinkedList<HMNode> list : buckets){
          for(HMNode curr : list){
              allKeys.add(curr.key);
          }
      }
      return allKeys;
    }

    public int size() { //how many nodes -- n?
      return this.size;
    }

   public void display() {
      System.out.println("Display Begins");
      for (int bi = 0; bi < buckets.length; bi++) {
        System.out.print("Bucket" + bi + " ");
        for (HMNode node : buckets[bi]) {
          System.out.print( node.key + "@" + node.value + " ");
        }
        System.out.println(".");
      }
      System.out.println("Display Ends");
  }
}

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<String, Integer> map = new HashMap();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("put")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        Integer val = Integer.parseInt(parts[2]);
        map.put(key, val);
      } else if (str.startsWith("get")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        System.out.println(map.get(key));
      } else if (str.startsWith("containsKey")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        System.out.println(map.containsKey(key));
      } else if (str.startsWith("remove")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        System.out.println(map.remove(key));
      } else if (str.startsWith("size")) {
        System.out.println(map.size());
      } else if (str.startsWith("keyset")) {
        System.out.println(map.keyset());
      } else if (str.startsWith("display")) {
        map.display();
      }
      str = br.readLine();
    }
  }
}