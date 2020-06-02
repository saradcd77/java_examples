
import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
      private int value;
      private Node next;

      public Node(int value){
          this.value = value;
      }
    }
    private Node first;
    private Node last;
    private int size;

    public void addLast(int item){
        Node node = new Node(item);

        if (first == null){
            first = last = node;
        }
        else{
            last.next = node;
            last = node;
        }
        size++;
    }
    public void addFirst(int item){
        Node node = new Node(item);

        if (isEmpty()){
            first = last = node;
        }
        else{
            node.next = first;
            first = node;
        }
        size++;
    }
    private boolean isEmpty(){
        return first == null;
    }
    public int indexOf(int item){
        int index = 0;
        Node current = first;
        while(current != null){
            if (current.value == item) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }
    public boolean contains(int item){
        return indexOf(item) != -1;
    }
    public void removeFirst(){
        if (isEmpty()) throw new NoSuchElementException();

        else if (first == last){
            first = last = null;
        }
        else{
            Node second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }
    public void removeLast(){
        if (isEmpty())
            throw new NoSuchElementException();
        else if (first == last){
            first = last = null;
            return;
        }
        Node previous = getPrevious(last);
        last = previous;
        last.next = null;
        size--;
    }
    private Node getPrevious(Node node){
        Node current = first;
        while (current != null){
            if(current.next == node){
                return current;
            }
            current = current.next;
        }
        return null;
    }
    public int [] toArray(){
        int [] array = new int[size];
        Node current = first;
        int index = 0;
        while (current != null){
            array[index] = current.value;
            index++;
            current = current.next;
        }
        return array;
    }
    public int getnthfromLast(int n){
        Node a = first;
        Node b = first;
        if(isEmpty()) throw new IllegalStateException();

        for(int i=0; i<n-1; i++){
            b = b.next;
            if (b== null) throw new IllegalArgumentException();
            }
        while(b != last){
            a = a.next;
            b = b.next;
        }
        return a.value;
    }
    public void reverse(){

        }


    public int size(){
        return size;
    }
}
