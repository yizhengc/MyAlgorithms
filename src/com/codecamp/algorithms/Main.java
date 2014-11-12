package com.codecamp.algorithms;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LRUCache cache = new LRUCache(10);

        for (int i = 0; i < 12; i++)
        {
            cache.add(String.valueOf(i), i);
        }

        System.out.print(cache.containsKey("0"));
    }
}
