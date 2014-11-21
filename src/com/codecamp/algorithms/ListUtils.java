package com.codecamp.algorithms;

/**
 * Created by yicai on 11/20/2014.
 */
public class ListUtils {
    // Assume input is single link list which only has Next
    public static ListNode ReverseList(ListNode head)
    {
        if (head == null)
            return null;

        ListNode cur = head;
        ListNode prev = null;

        if (cur.Next != null)
        {
            ListNode temp = cur.Next;
            cur.Next = prev;
            prev = cur;
            cur = temp;
        }

        return cur;
    }

    public static ListNode CreateListNode(int[] input)
    {
        if (input.length == 0)
            return null;

        ListNode head = new ListNode(input[0]);
        ListNode prev = head;

        for(int i = 1; i < input.length; i++)
        {
            prev.Next = new ListNode(input[i]);
            prev = prev.Next;
        }

        prev = null;

        return head;
    }

    public static ListNode DedupLoop(ListNode loopHead)
    {
        if (loopHead != null && loopHead.Next == loopHead)
        {
            ListNode start = loopHead;

            ListNode cur = start.Next;

            while (cur != loopHead && cur != null) {
                if (cur.Value != start.Value) {
                    start.Next = cur;
                    start = cur;
                }
            }
        }

        return loopHead;
    }

    public void printList(ListNode head)
    {
        ListNode cur = head;
        while(cur != null)
        {
            System.out.print(cur.Value);

            if (cur.Next == head)
                break;
            else
                cur = cur.Next;
        }
    }
}
