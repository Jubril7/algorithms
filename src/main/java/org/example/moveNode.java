package org.example;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public ListNode modifyLinkedList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        // After the loop, reconnect the odd and even parts
        odd.next = evenHead;

        return head;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        for (int i = 1; i <= 8; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }

        System.out.println("Original Linked List:");
        printLinkedList(head.next);

        Solution solution = new Solution();
        ListNode modifiedHead = solution.modifyLinkedList(head.next);

        System.out.println("\nModified Linked List:");
        printLinkedList(modifiedHead);
    }
}