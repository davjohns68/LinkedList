/*
 * Tests for LinkedList<E> class
 * Created by David Johnson, November 12, 2017
 * for CS211 course, Bellevue College
 */
package linkedlist;

/**
 *
 * @author davjohns
 */
public class Tests {
    public static void main(String[] a) {
        LinkedList<String> A = new LinkedList<>();
        LinkedList<Integer> B = new LinkedList<>();
        LinkedList<Integer> C = new LinkedList<>();
        A.add("smooth"); A.add("nothing"); A.add("Bellevue"); A.add("a"); A.add("nothing");
        B.add(1); B.add(19); B.add(4); B.add(17); 
        System.out.println("A's minimum: " + A.min());
        System.out.println("B's minimum: " + B.min());
        System.out.println("B's duplicates: " + B.countDuplicates());
        System.out.println("C's duplicates: " + C.countDuplicates());
        B.stutter();
        System.out.println(B.toString());  //[1, 1, 19, 19, 4, 4, 17, 17] 
        System.out.println(B.backwards()); //[17, 17, 4, 4, 19, 19, 1, 1]
        B.removeAll(19);
        System.out.println(B);
        System.out.println(B.backwards());
        A.removeAll("nothing");
        System.out.println(A);
        System.out.println(A.backwards());
        C.removeAll(4);
        System.out.println(C);
    }
}
