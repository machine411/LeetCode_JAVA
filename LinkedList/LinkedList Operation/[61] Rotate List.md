# Descirption
Given a linked list, rotate the list to the right by k places, where k is non-negative.

Example 1:

```
Input: 1->2->3->4->5->NULL, k = 2
Output: 4->5->1->2->3->NULL
```
```
Explanation:
rotate 1 steps to the right: 5->1->2->3->4->NULL
rotate 2 steps to the right: 4->5->1->2->3->NULL
```
Example 2:
```
Input: 0->1->2->NULL, k = 4
Output: 2->0->1->NULL
```

```
Explanation:
rotate 1 steps to the right: 2->0->1->NULL
rotate 2 steps to the right: 1->2->0->NULL
rotate 3 steps to the right: 0->1->2->NULL
rotate 4 steps to the right: 2->0->1->NULL
```
## Solution
  3 step to solve it
  step 1 :get the total length
  step 2 : Move to the (l-n%l)th node
  step 3 : ratate the list
 
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
  public ListNode rotateRight(ListNode head, int n) {
    if (head==null||head.next==null) return head;
    ListNode dummy=new ListNode(0);
    dummy.next=head;
    ListNode right=dummy,left=dummy;

    int i=0;
    while(right.next!=null){
    	right=right.next;
      i++;
    }
    for (int j=i-n%i;j>0;j--) 
    	left=left.next;
    
    right.next=dummy.next;
    dummy.next=left.next;
    left.next=null;
    
    return dummy.next;
}
}
```
