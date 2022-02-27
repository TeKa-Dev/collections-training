package lessons;

import java.util.*;

public class Generic<T> {
    public static void main(String[] args) {
        String[] strs = {"twe", "wqe", "ghj"};
        ArrayList<Object> list = new ArrayList<>();
        list.add("qwe");
        list.add("asd");
        list.add("fgh");

        showList(list);


        String str = String.valueOf(list.get(1));
    }
    static void showList(List<?> list) {
        System.out.println(list);
    }
    static <T> void arrInCollect(T[] arr, List<T> list) {
        list.addAll(Arrays.asList(arr));
    }
    static <T> T get(Object o) {
        return (T) o;
    }
//    static <T extends Number> T asd() {
//        T t = new T(13);
//        return t;
//    }
}
