# Description
Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.

Note: Do not modify the linked list.

 

Example 1:
```
Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.
```
[3,2,0,4,2,0,4,2,0,4,...]

Example 2:
```
Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node.
```
[1,2,1,2,1,2,1,2,....]

Example 3:
```
Input: head = [1], pos = -1
Output: no cycle
Explanation: There is no cycle in the linked list.
```

[1]


## Solution:
There still 2 method to solve it.

As [the linked list cycle](https://github.com/machine411/LeetCode_JAVA/blob/master/LinkedList/cycle/%5B141%5D%20Linked%20List%20Cycle.md)
### Method 1 :Hash Set

The HashSet Method is similar as that one:
we just need to return the node when it's cycle,and else return null instead of return true and false;

```

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
      HashSet<ListNode> HeadSeen = new HashSet();
        while(head!=null){
            if(HeadSeen.contains(head))
            {
                return head;
            }else{
                HeadSeen.add(head);
            }
            head = head.next;
        }
        return null;
    }
}
```
Time Complexity: O(N)
Space Complexity:O(N)

### Two Pointers
similar way as [the linked list cycle](https://github.com/machine411/LeetCode_JAVA/blob/master/LinkedList/cycle/%5B141%5D%20Linked%20List%20Cycle.md),but define a new node speed as slow to find the first space to loop.
```
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow =head;
        ListNode fast =head;
  
        while(fast!=null && fast.next !=null){
        slow = slow.next;
        fast = fast.next.next;
            
        if(slow == fast)
        {
         ListNode first = head;
          while(first != slow ) {
              slow = slow.next;
              first = first.next;
          }
            return slow;
        }
        }
        return null; 
    }
}

```
