package com.second;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<String> strs = Arrays.asList("abc", "zxc", "fgh");
//        nums.forEach((Integer el) -> System.out.println(el));
//        nums.forEach(System.out::println);
        showList(nums);
        showList(strs);
        String str = Integer.toString(23);
        String st = String.valueOf(23);
        Comparator<Integer> sor = (a, b) -> a.compareTo(b);
    }

    static void showList(List<?> list) {
        list.forEach(System.out::println);
    }

    static void showDirs(String path) {
        File src = new File(path);
        File[] files = src.listFiles(p -> p.isDirectory());

        for (File file : files
        ) {
            System.out.println(file.getName());
        }
    }
//                         лямда выражение короткая написание от реализации класса
//                                class MyFilter implements FileFilter {
//                                    @Override
//                                    public boolean accept(File p) {
//                                        return p.isDirectory();
//                                    }
//                                }

    static void sortFromLarge(ArrayList<Integer> nums) {
        nums.sort((a, b) -> -a.compareTo(b));
        for (int e : nums
        ) {
            System.out.println(e);
        }
    }

}
class lam {
    public static void main(String[] args) {
        FI fi = () -> 5;

        voo(fi);
    }
    static void voo(FI f) {
        System.out.println(f.foo());
    }

}
@FunctionalInterface
interface FI {
    int foo();
}