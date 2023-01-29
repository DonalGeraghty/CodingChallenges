package com.company.kata;

import java.util.ArrayList;
import java.util.List;

public class ListFiltering {

//    In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
//
//    Example
//        Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
//        Kata.filterList(List.of(1, 2, "a", "b", 0, 15)) => List.of(1,2,0,15)
//        Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)) => List.of(1, 2, 231)

    public static List<Object> filterList(final List<Object> list) {
        List<Object> integers = new ArrayList<>();
        for (Object obj: list) {
            if (obj instanceof Integer){
                integers.add(obj);
            }
        }
        return integers;
    }
}
