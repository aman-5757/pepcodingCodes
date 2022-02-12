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

    
    public void addAt(int idx, int val){
       if(idx == 0){
        addFirst(val);
      }
      else if(idx == size){
        addLast(val);
      }
      else if(idx < 0 || idx > size){
        System.out.println("Invalid arguments");
      }
      else{
        Node node = new Node();
        node.data = val;

        Node temp = head;
        for(int i = 0; i < idx-1; i++){
          temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
      }
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

    public int getFirst(){
      if(size == 0){
       System.out.println("List is empty");
       return -1; 
      }
      else{
        return head.data;
      }
    }

    public int getLast(){
      if(size == 0){
        System.out.println("List is empty");
        return -1; 
      }
      else{
        return tail.data;
      }
    }

    public int getAt(int idx){
      if(idx == 0){
        return getFirst();
      }
      else if(idx == size - 1){
        return getLast();
      }
      else if(idx < 0 || idx >= size){
        System.out.println("Invalid arguments");
        return -1;
      }
      else{
        Node temp = head;
        for(int i = 0; i < idx; i++){
          temp = temp.next;
        }
        return temp.data;
      }
    }

    private Node getNodeAt(int idx){      //helper function
      if (size == 0) {
        return null;
      } 
      else if (idx < 0 || idx >= size) {
        return null;
      } 
      else {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
          temp = temp.next;
        }
        return temp;
      }
    }

    public void removeLast(){
      if(size == 0)
        return;
      else if(size == 1){
        head = null;
        tail = null;
        size--;
      }
      else{
        Node sln = getNodeAt(size-2);
        sln.next = null;
        tail = sln;
        size--;
      }
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