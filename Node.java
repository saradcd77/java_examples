import java.util.Arrays;

public class Node {

    public static void main(String [] args) {
        LinkedList list = new LinkedList();
        System.out.println(list.size());
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        int [] array = list.toArray();
       System.out.println(Arrays.toString(array));
       list.reverse();
        System.out.println(list.getnthfromLast(1));
       System.out.println(Arrays.toString(Arrays.toString(array)));
    }
