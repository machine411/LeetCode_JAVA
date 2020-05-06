# Description
 
  ```
  Remove all elements from a linked list of integers that have value val.
   
   Example:
  
    Input:  1->2->6->3->4->5->6, val = 6
    Output: 1->2->3->4->5
  ```

## Solution idea:

  - The basic operation of deletion of linked list
   
    To delete the node,we just need to make the previous node's next to point this node's next node.
 ![showit](https://github.com/machine411/LeetCode_JAVA/blob/master/images/linkedlist/IMG_0948.JPG)
    
## the key point:
  the special point we need to consider is:
  if we not consider about the situation that Two consecutive adjacent nodes need to be deleted.
  we just easily write the code as :
  ```
  class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head !=null && head.val == val){
            head = head.next;
        }
        ListNode Curr = head;
        while(Curr != null && Curr.next !=null){
            if(Curr.next.val == val){
                Curr.next = Curr.next.next;
            }else{
                Curr = Curr.next;
            }
        }
        return head;
    }
}
```
it was failed when situation is [1,1]

we just need a node dummy to make sure if the first node we need to delete and the next node we also need to delete.

## Solution
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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        while(head.next != null){
            if(head.next.val == val){
                head.next = head.next.next;
            }else{
                head = head.next;
            }
        }
        return dummy.next;
    }
}
   ```



  
    
   
    
