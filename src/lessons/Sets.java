package lessons;
import java.util.*;
public class Sets {
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();
        set.add("dog");
        set.add("man");
        set.add("cat");
        set.add("eye");
        set.add("fox");
        set.add("ant");
        set.add("god");

        Iterator<String> si = set.iterator();
            si.next();
            System.out.println(si.next());
            System.out.println(set);

        while (si.hasNext()) {
            si.next();
            si.remove();
        }

//        String[] strs = set.toArray(new String[0]);
//        System.out.println(set.remove("azz"));
//        System.out.println(String.join(" ", strs));
//        set.forEach(System.out::println);
//        System.out.println(set.size());
    }
}