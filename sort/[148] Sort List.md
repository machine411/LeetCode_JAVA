# Descirption
Sort a linked list in O(n log n) time using constant space complexity.
Example 1:
```
Input: 4->2->1->3
Output: 1->2->3->4
```
Example 2:
```
Input: -1->5->3->4->0
Output: -1->0->3->4->5
```

## Solution:
The key point is this question ask sort time complexity is O(nlogn),so we just could choose quikc sort,merge sort,heap sort.

Due to the linked list could not random access ,so we could not use heap sort.

while we using quick sort,some times the space complexity would become O(N)

On the other hand,if we use merge sort,due to merge two sorted linked list need not extra space,
so the space complexity always is O(logN)

so the best way is merge sort
##    Merge Sort

Merge Sort is an efficient ,general-peupose,comparision-based sorting algorithm,which was invented by john von neumann..
![example](https://github.com/machine411/LeetCode_JAVA/blob/master/images/linkedlist/600px-Merge_sort_algorithm_diagram.svg.png)


The algorithm have 2 step process:
- Divide:we divide the input into 2 halves until just 1 

- Conquer:we sort and merge the divided array to get the sorted array.


It's an typical application of Divide and Conquer which means divide a problem to 2 or more same or similar sub problem until the sub problem could be solved easily.
The solution of problem becomes the sum of the solution of sub problems.

### Code
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
    public ListNode sortList(ListNode head) {
    
        if(head == null || head.next == null)
            return head;
            
         //divide it  half   
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode list2 = slow.next;
        slow.next =null;
        return merge(sortList(head),sortList(list2));
    }
    
    ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        while( l1!=null && l2 !=null ){
            if(l1.val <l2.val){
                node.next =l1;
                l1 = l1.next;
            }else{
                node.next =l2;
                l2=l2.next;
            }
            node = node.next;
        }
        if(l1 != null)
            node.next = l1;
        if(l2 != null)
            node.next = l2;
        
        return dummy.next;
            
        }
    
}
```
