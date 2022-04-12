package ru.otus;

import com.google.common.collect.Lists;

import java.util.List;

public class HelloOtus {
    public static void main(String... args) {
        List<Integer> example = Lists.newArrayList(10, 20, 3, 15);
        System.out.println(example.stream().max(Integer::compareTo).orElse(null));
    }
}
