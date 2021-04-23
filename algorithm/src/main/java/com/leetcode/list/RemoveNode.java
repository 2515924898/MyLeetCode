package com.leetcode.list;

public class RemoveNode {
    // 移除某个值 递归
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            if(head.val == val){
                return null;
            }else{
                return head;
            }
        }

        ListNode newHead = removeElements(head.next,val);
        if(head.val == val){
            head = newHead;
        }else{
            head.next = newHead;
        }
        return head;
    }
}
