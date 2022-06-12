import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }

  public static int height(Node node) {
    if (node == null) {
      return -1;
    }

    int lh = height(node.left);
    int rh = height(node.right);

    int th = Math.max(lh, rh) + 1;
    return th;
  }

  public static int diameter1(Node node) {
      if(node == null)
        return 0;
      
    int leftDia = diameter1(node.left);
    int rightDia = diameter1(node.right);
    
    //accross
    int leftHeight = height(node.left);
    int rightHeight = height(node.right);
    
    int acrossDia = leftHeight + rightHeight + 2;
    
    return Math.max(leftDia, Math.max(rightDia, acrossDia));
  }



    // Method 2 -------------------------------
    public static class pair{
        int h;
        int d;
        pair(){}
        pair(int h, int d){
            this.h = h;
            this.d = d;
        }
    }


    //h, d
    public static pair diameter02(Node node){
        if(node == null){
            return new pair(-1, 0);
        }

        pair lp = diameter02(node.left);
        pair rp = diameter02(node.right);

        pair myPair = new pair();

        myPair.h = Math.max(lp.h, rp.h) + 1;
        int accross = lp.h + rp.h + 2;
        myPair.d =  Math.max(accross, Math.max(lp.d, rp.d));

        //myPair values done
        return myPair;
    }




  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);

    int diameter = 0;
    // diameter = diameter1(root);
    pair ans  = diameter02(root);
    System.out.println(ans.d);
  }

}