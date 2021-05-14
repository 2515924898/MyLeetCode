package com.leetcode.list;

public class RotateRight {
    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = head;
        int count = 0;
        // 向前走k步
        while(pre != null){
            pre = pre.next;
            count++;
            if(k==count)break;
        }
        // k大于链表长度
        if(pre == null || pre.next== null){
            return head;
        }
        // 从k处断开链表
        ListNode node = pre.next;
        ListNode res = node;
        pre.next = null;
        while(node != null && node.next != null){
            node = node.next;
        }
        node.next = head;
        return res;
    }
    public static void main(String[] args){
     ListNode node1 = new ListNode(0);
     ListNode node2 = new ListNode(1);
     ListNode node3 = new ListNode(2);
     node1.next = node2;
     node2.next = node3;
     ListNode node = rotateRight(node1,1);
    }
}
