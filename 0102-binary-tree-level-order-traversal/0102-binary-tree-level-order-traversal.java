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
    public List<List<Integer>> levelOrder(TreeNode root) {
      Queue<TreeNode> queue = new LinkedList<>();
      List<List<Integer>> list = new ArrayList<>();
      if(root==null)return list;
      queue.offer(root);
      while(!queue.isEmpty())
      {
        int size = queue.size();
        List<Integer> subList = new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            TreeNode node = queue.poll();
            if(node.left!=null)queue.offer(node.left);
            if(node.right!=null)queue.offer(node.right);
            subList.add(node.val);
        }
        list.add(subList);
      }
      return list;
    }
}