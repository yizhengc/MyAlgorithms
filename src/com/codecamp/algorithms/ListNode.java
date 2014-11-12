package com.codecamp.algorithms;

/**
 * Created by yicai on 11/11/2014.
 */
public class ListNode {
    public int Value;
    public ListNode Prev;
    public ListNode Next;

    public ListNode(int val)
    {
        Value = val;
        Prev = Next = null;
    }
}
