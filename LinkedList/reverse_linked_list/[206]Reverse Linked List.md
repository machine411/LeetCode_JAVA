# Description

Reverse a singly linked list.

Example:

```
  Input: 1->2->3->4->5->NULL
  Output: 5->4->3->2->1->NULL
```
## Solution:

we could use two way to reverse it.  It also connect the iterative and recursion method.
In a nutshell,
iterative is the repetition of a process 
each repetition of the process is a single iteration
recursion is the thing that defined in terms of itself or its type
It call itself in an infinite number.while it needs a base case and it reduces the other case towards the base case.
### Iterative
 In traversing the list,We just need change the current nodes pointers to point to its previous element.
 We need to store its previous element beforehand.and other pointer to store the next node before changing the reference.
 ![iterative](https://github.com/machine411/LeetCode_JAVA/blob/master/images/linkedlist/IMG_0949.JPG)
 ```
  /**
   * Definition for singly-linked list.
   * public class ListNode {
   *     int val;
   *     ListNode next;
   *     ListNode() {}
   *     ListNode(int val) { this.val = val; }
   *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   * }
   */
  class Solution {
      public ListNode reverseList(ListNode head) {
      ListNode prev = null;
      ListNode curr = head;
      while (curr !=null){
        ListNode nextTemp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextTemp;
      }
      return prev;
  }
```
