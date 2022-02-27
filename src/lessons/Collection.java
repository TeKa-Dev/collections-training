package lessons;

import java.util.*;

public class Collection {
    public static void main(String[] args) {

        ArrayList<Set<String>> al = new ArrayList<>();
        LinkedList<List<Integer>> ll = new LinkedList<>();
        Set s;
        Map m;
        System.out.println(al.getClass());
        System.out.println(al.hashCode());
        System.out.println(ll.hashCode());
        System.out.println(al.equals(ll));
    }
}
