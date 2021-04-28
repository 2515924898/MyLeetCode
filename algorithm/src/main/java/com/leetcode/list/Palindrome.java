package com.leetcode.list;

public class Palindrome {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = resver(slow.next);
        ListNode p1 = head;
        ListNode p2 = newHead;
        while(p2 != null){
            if(p1.val != p2.val){
                 return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    private ListNode resver(ListNode list){
        if(list==null || list.next == null){
            return list;
        }
        ListNode result = new ListNode(-1);
        ListNode cur = list;
        while (cur != null){
            ListNode temp = cur.next;
            cur.next = result.next;
            result.next = cur;
            cur = temp;
        }
        return result.next;
    }

    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        Palindrome palindrome = new Palindrome();
        boolean res = palindrome.isPalindrome(node1);
        System.out.println(res);
    }
}
