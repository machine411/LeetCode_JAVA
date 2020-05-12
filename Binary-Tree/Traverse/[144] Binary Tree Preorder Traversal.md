# Description

Given a binary tree, return the preorder traversal of its nodes' values.

Example:
```

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,2,3]
```
## Solution

```
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> results = new ArrayList<>();
    if (root == null) return results;
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.empty()) {
        TreeNode node = stack.pop();
        results.add(node.val);
        
        if (node.right != null) stack.push(node.right);
        if (node.left != null) stack.push(node.left);
    }
    return results;
}
}
```

