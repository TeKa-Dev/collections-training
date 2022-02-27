package lessons;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsArrays {
    public static void main(String[] args) {

//        int[] nums = {5, 82, 34, 96, 12, 50, 42, 17, 3};
//        System.out.println(Arrays.toString(nums));
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.binarySearch(nums, 34));

//        String[] sts = {"eye", "god", "bit", "fox", "cat", "dog", "ant"};
//        System.out.println(Arrays.toString(sts));
//        Arrays.sort(sts);
//        System.out.println(Arrays.toString(sts));
//        System.out.println(Arrays.binarySearch(sts, "man"));

        List<String> list = Arrays.asList("man", "cat", "dog", "fox");
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list, "fox"));

    }
}