package org.example.SortowanieDanych;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortowanieDanych {

    public static void main(String[] args) {
        List<Integer> List = new ArrayList<>();

        List.add(9);
        List.add(8);
        List.add(1);
        List.add(3);

        Integer[] list = new Integer[0];
        for(Integer i : list) {
            System.out.println(i);

        }
       // Collections.sort(List);
        Collections.reverse(List);
        System.out.println("");
        for(Integer i: list)
            System.out.println(i);
    }
}
