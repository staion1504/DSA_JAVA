import java.util.*;

//Given the root of a Binary Search Tree (BST),
//return the minimum absolute difference between
//the values of any two different nodes in the tree.

public class Minimum_Absolute_Difference_in_BST {


//      Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
         }
      }


        public void helper(TreeNode root,List<Integer>a){
            if(root==null) return;

            helper(root.left,a);
            a.add(root.val);
            helper(root.right,a);
        }
        public int getMinimumDifference(TreeNode root) {


            List<Integer>a=new ArrayList<>();

            helper(root,a);
            int ans=Integer.MAX_VALUE;
            for(int i=1;i<a.size();i++){
                ans=Math.min(Math.abs(a.get(i)-a.get(i-1)),ans);
            }

            return ans;
        }


}
