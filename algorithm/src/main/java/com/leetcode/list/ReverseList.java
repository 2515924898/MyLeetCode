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
}
