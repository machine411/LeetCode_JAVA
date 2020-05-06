# Description:
Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

Return the linked list sorted as well.

Example 1:
```
Input: 1->2->3->3->4->4->5
Output: 1->2->5
```
Example 2:
```
Input: 1->1->1->2->3
Output: 2->3
```
## Solution:
There are also two points method to solve this problem.
similar question as the remove duplicates form sorted list but there need to delete all duplicates.
we need to define a new node and point the original linked list.
we define a first node and current node.while the first node point the new node.current node point the next one,if same value ,continue point the next one until meet the new value. the first node will point the next different value.if current node's first value is not equal the first node. the first node point the second value.

![try](https://github.com/machine411/LeetCode_JAVA/blob/master/images/linkedlist/leetcode-12.jpg)
```
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode fast = head;
        ListNode slow = dummy;
        slow.next = fast;
        while(fast !=null){
            while(fast.next !=null &&fast.val == fast.next.val){
                fast = fast.next;
            }
            if(slow.next !=fast)
            {slow.next=fast.next;
            fast = slow.next;
            }else{
                slow = slow.next;
                fast = fast.next;
            }
        }
        return dummy.next;
    }
}
```
