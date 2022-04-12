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
    public static class pair{
        Node node;
        int state;
        pair(Node node, int state){
            this.node = node;
            this.state = state;
        }
    } 
    
    
    
  public static void IterativePreandPostOrder(Node node) {
    Stack<pair> st = new Stack<>();
    st.push(new pair(node, -1));
    
    String pre = "";
    String post = "";
    
    while(st.size() != 0){
        pair peekPair = st.peek();
        
        if(peekPair.state == -1){
            pre += peekPair.node.data + " ";
            peekPair.state++;
        }
        else if(peekPair.state == peekPair.node.children.size()){
            post += peekPair.node.data + " ";
            st.pop();
        }
        else{
            Node newChild = peekPair.node.children.get(peekPair.state);
            st.push(new pair(newChild, -1));
            peekPair.state++;
            
        }
    }
    
    System.out.println(pre);
    System.out.println(post);
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
    IterativePreandPostOrder(root);
  }

}