package com.codecamp.algorithms;

/**
 * Created by yicai on 11/11/2014.
 */
public class TreeOperator {
    public static TreeNode CreateTreeFromPreOrder(int[] array)
    {
        return rCreateTreeNode(array, 0, array.length - 1);
    }

    private static TreeNode rCreateTreeNode(int[] array, int left, int right)
    {
        if (left > right)
            return null;

        TreeNode root = new TreeNode(array[left]);

        int i = 0;
        for(i = left; i < right; i++) {
            if (array[i] > array[left])
                break;
        }

        root.Left = rCreateTreeNode(array, left, i - 1);
        root.Right = rCreateTreeNode(array, i + 1, right);

        return root;
    }
}
