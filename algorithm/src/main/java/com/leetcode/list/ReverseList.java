package com.leetcode.list;

import java.util.List;

public class ReverseList {
    // 头结点插入
    public ListNode reverseList(ListNode head){
        ListNode resultList = new ListNode(-1);
        ListNode p = head;
        while(p != null){
            ListNode tempList = p.next;// 剩余节点
            p.next = resultList.next;// 当前节点插入resultList
            resultList.next = p;
            p = tempList;// 继续下一个节点
        }
        return resultList.next;
    }

    // 递归
    public ListNode reverseList2(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverseList2(head.next);// 5->4
        head.next.next = head; // 3->4 变成 3->4->3
        head.next = null; // 4->3
        return newHead;// 5->4->3
    }

    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ReverseList reverseList = new ReverseList();
        reverseList.reverseList2(node1);

    }
}
