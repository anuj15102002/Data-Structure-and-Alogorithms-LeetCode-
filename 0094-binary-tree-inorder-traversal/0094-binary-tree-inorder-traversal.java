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


//  RECURSIVE APPROACH USING RECURSION

// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> list = new ArrayList<>();
//         inorder(root, list);
//         return list;
//     }
//     public void inorder(TreeNode node, List<Integer> list)
//     {
//         if(node==null)return;
//         inorder(node.left, list);
//         list.add(node.val);
//         inorder(node.right, list);
//     }
// }



// ITERATIVE APPROACH USING STACK

class Solution {
    public List<Integer> inorderTraversal(TreeNode root)
    {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode node = root;
        while(true)
        {
            if(node != null)
            {   
                s.push(node);
                node = node.left;
            }
            else
            {
                if(s.isEmpty())break;
                node = s.pop();
                list.add(node.val);
                node = node.right;
            }
        }
        return list;
    }
}