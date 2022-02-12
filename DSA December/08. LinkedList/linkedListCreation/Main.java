import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node next;

    Node(){

    }

  }

  public static class LinkedList {

    //data member
    Node head;
    Node tail;
    int size;

    //member function
    void addLast(int val) {
      Node temp = new Node();
      temp.data = val;

      if(size == 0 ){
        head = temp;
        tail = temp;
      }
      else{
        tail.next = temp;
        tail = temp;
      }
      size++;
    }

    public void addFirst(int val) {
      Node temp = new Node();
      temp.data = val;

      if(size == 0){
        head  = temp;
        tail = temp;
      }
      else{
        temp.next = head;
        head = temp;
      }
      size++;
    }

    public int size(){
      return size;
    }

    public void display(){

      Node curr = head;
      while(curr != null){
        System.out.print(curr.data + " ");
        curr = curr.next;
      }
      System.out.println();
    }


    public void removeFirst(){
      if(size == 0){
        System.out.println("List is empty");
        return;
      }
      else if(size == 1){
        head = null;
        tail = null;

      }
      else{
        head = head.next;
      }
      size--;
    }



  }

  public static void testList(LinkedList list) {
    for (Node temp = list.head; temp != null; temp = temp.next) {
      System.out.println(temp.data);
    }
    System.out.println(list.size);

    if (list.size > 0) {
      System.out.println(list.tail.data);
    } 
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LinkedList list = new LinkedList();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("addLast")){
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addLast(val);
      } 
      str = br.readLine();
    }

    testList(list);
  }
}