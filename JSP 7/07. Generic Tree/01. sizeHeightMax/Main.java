import java.io.*;
import java.util.*;

public class Main {
    
    
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }
//size function =======================================
  public static int size(Node node){
    int size = 0;
    for(Node child : node.children){
        size += size(child);
    }
    // ++ for me
    size++;
    return size;
    
  }

  //height function =======================================
    public static int height(Node node){
    int maxHeight = -1;
    for(Node child : node.children){
        maxHeight = Math.max(maxHeight, height(child));
    }
    //final Height for me
    maxHeight++;
    return maxHeight;
    
    }





  //max function =======================================
 public static int max(Node node){
    int maxVal = -(int)1e9;     //Integer.MIN_VALUE
    for(Node child : node.children){
        maxVal = Math.max(maxVal, max(child));
    }
    //compare for me
    maxVal = Math.max(maxVal, node.data);
    return maxVal;
    
    }



  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    int sz = size(root);
    System.out.println(sz);
    // display(root);
  }

}