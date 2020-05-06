# Description:
Given a linked list, remove the n-th node from the end of list and return its head.

Example:
```
Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
```
Note:

Given n will always be valid.


## Solution:

We use the concept of two pointers at here.
Two pointers means that when we traverse linked list ,not just by one pointers but two pointers in the same or opposite way.
we could get the outcome we wanted by control the direcion or/and step speed
two pointers the first and the second.we let the first node move n step the n let second node start to move with same step.
when the first node arrive the null,the second node's next node is the node we should deleted.

![leetcode_picture](https://github.com/machine411/LeetCode_JAVA/blob/master/images/linkedlist/19_Remove_nth_node_from_end_of_listB.png)

 - this picture from leetcode

```public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode first = dummy;
    ListNode second = dummy;
    // Advances first pointer so that the gap between first and second is n nodes apart
    for (int i = 1; i <= n + 1; i++) {
        first = first.next;
    }
    // Move first to the end, maintaining the gap
    while (first != null) {
        first = first.next;
        second = second.next;
    }
    second.next = second.next.next;
    return dummy.next;
}
```
