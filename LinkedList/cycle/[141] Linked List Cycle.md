# Descirption:

Given a linked list, determine if it has a cycle in it.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.

 

Example 1:
```
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the second node.

```
[3 2 0 -4 2 0 -4 2 0 -4...]

Example 2:
```
Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the first node.
```
[1,2,1,2.....]

Example 3:
```
Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.
```
[1]

## Solution:
There are two way to solve it.
First One is Hash Table
In java, Hash Table ,Hash Set, and Hash Map have similar functions
For, Hash Set,usually,it defined as:
Set<the kind you want> the_var_name = new HashSet<>();
Hash map:
HashMap<Key,Value> the_var_name = new HashMap<Key,Value>();
 ### Method1:HashSet:
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
    public boolean hasCycle(ListNode head) {
    Set<ListNode> nodesSeen = new HashSet<>();
        while(head !=null){
            if(nodesSeen.contains(head)){
                return true;
            }else{
                nodesSeen.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
```
Time complexity is :O(n)
Space complexity is :O(n)

### Method2: Two Pointers:

two pointers,shown as before, is the method to get the wanted outcome by control the 2 pointers' dirction or/and speed

There is using 2 pointers ,one is slow node started from head, one is fast node started from head.next.They have different speed. slow one time walk one step while fast one time walk two step.travers linked list,if they become same. return true.
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
    public boolean hasCycle(ListNode head) {
    if(head == null || head.next ==null){
        return false;
    }
        ListNode slow =head;
        ListNode fast = head.next;
    while(slow !=fast){
        if(fast == null || fast.next ==null){
            return false;
        }
        slow = slow.next;
        fast = fast.next.next;
    }
    return true;
    }
}

```
Time Complexity is O(N)
Space Complexity is O(1)(because we just use two nodes)
 
