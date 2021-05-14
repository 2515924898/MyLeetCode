package com.leetcode.list;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(-1);
        ListNode res = node;
        while (l1 != null && l2 != null){
           if(l1.val>l2.val){
               res.next = l2;
               l2 = l2.next;
           }else {
               res.next = l1;
               l1 = l1.next;
           }
           res = res.next;
        }
        if(l1 != null){
            res.next = l1;
        }
        if(l2 != null){
            res.next = l2;
        }
        return res;
    }
}
