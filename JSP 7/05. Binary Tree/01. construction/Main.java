import java.util.*;

public class Main{

    public static class Node{
        int data;
        Node left;
        Node right;

        Node(){}
        Node(int data){
            this.data = data;
        }
        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }

    }

    public static class pair{
        Node node;
        int state;
        pair(){}
        pair(Node node, int state){
            this.node = node;
            this.state = state;
        }
    }


    public static void main(String [] args){
        Integer [] arr = {50,25,12, null, null, 37, 30, null, null, null, 75,62, null, 70, null, null, 87, null, null};
        int idx = 0;

        Stack<pair> st = new Stack<>();

        Node root = new Node(arr[idx]);
        idx++;

        pair init = new pair(root, 1);

        st.push(init);


        while(st.size() != 0){
            pair top = st.peek();

            if(top.state == 1){
                top.state++;
                if(arr[idx] != null){
                    Node leftChild = new Node(arr[idx]);
                    top.node.left = leftChild;

                    st.push(new pair(leftChild, 1));
                }
                idx++;

            }
            else if(top.state == 2){
                top.state++;
                if(arr[idx] != null){
                    Node rightChild = new Node(arr[idx]);
                    top.node.right = rightChild;

                    st.push(new pair(rightChild, 1));
                }
                idx++;
            }
            else{
                st.pop();
            }
        }

        

    }
}