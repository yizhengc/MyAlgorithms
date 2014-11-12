package com.codecamp.algorithms;

import javax.sound.midi.SysexMessage;
import java.util.HashMap;

/**
 * Created by yicai on 11/11/2014.
 */
public class LRUCache {

    private int cacheSize = 0;
    private int cacheLimit = 0;
    private ListNode<Integer> head = null;
    private ListNode<Integer> tail = null;

    private HashMap<String, ListNode<Integer>> index = null;

    public LRUCache(int size)
    {
        cacheLimit = size;
        index = new HashMap<String, ListNode<Integer>>(cacheLimit);;
    }

    public boolean containsKey(String key)
    {
        return index != null && index.containsKey(key);
    }

    public int getValue(String key) throws Exception
    {
        if (index.containsKey(key))
        {
            ListNode<Integer> target = index.get(key);

            if (target != head)
            {
                target.Prev.Next = target.Next;
                target.Next = head;
                head = target;
            }

            return target.Value;
        }
        else
            throw new Exception();
    }

    public void add(String key, int val)
    {
        if (index.containsKey(key))
            return;

        if (cacheSize == cacheLimit) {
            /// Remove old cache
            if (tail != null)
            {
                tail.Prev.Next = null;
                index.remove(tail);
                tail = tail.Prev;
                cacheSize--;
            }
        }

            ListNode<Integer> target = new ListNode<Integer>(val);
            if (head == null)
            {
                head = tail = target;
            }
            else
            {
                target.Next = head;
                head.Prev = target;
                head = target;
            }

            index.put(key, head);
            cacheSize++;

    }

    public void clear()
    {
        cacheSize = 0;
        head = tail = null;
        index.clear();
    }

    public int getSize()
    {
        return cacheSize;
    }

    public void printContent()
    {
        for(ListNode<Integer> tmp = head; tmp != null; tmp = tmp.Next)
        {
            System.out.print(tmp.Value);
            System.out.print(" ");
        }
    }
}
