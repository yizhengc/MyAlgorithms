package com.codecamp.algorithms;

/**
 * Created by yicai on 11/11/2014.
 */
public class ListNode<T> {
    public T Value;
    public ListNode Prev;
    public ListNode Next;

    public ListNode(T val)
    {
        Value = val;
        Prev = Next = null;
    }
}
