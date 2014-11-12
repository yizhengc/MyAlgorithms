package com.codecamp.algorithms;

import static org.junit.Assert.*;

public class LRUCacheTest {

    LRUCache cache = new LRUCache(10);

    @org.junit.Test
    public void testContainsKey() throws Exception {

        cache.clear();

        for (int i = 0; i < 12; i++)
        {
            cache.add(String.valueOf(i), i);
        }

        assert(cache.containsKey("12") == true);
        assert(cache.containsKey("0") == false);
    }

    @org.junit.Test
    public void testGetValue() throws Exception {

    }

    @org.junit.Test
    public void testAdd() throws Exception {
        cache.clear();

        cache.add("0", 0);

        assert(cache.containsKey("0") == true);
        assert(cache.getSize() == 1);

        cache.add("0", 0);
        assert(cache.getSize() == 1);

        for (int i = 1; i < 11; i++)
        {
            cache.add(String.valueOf(i), i);
        }

        assert(cache.containsKey("0") == false);
    }
}