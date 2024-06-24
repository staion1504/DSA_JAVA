public class Path_Sum {

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

    class Solution {
        public boolean hasPathSum1(TreeNode par,TreeNode root, int targetSum){

            if(root==null){
                if(par.left==null&&par.right==null&&targetSum==0) return true;
                return false;
            }

            boolean x=hasPathSum1(root,root.left,targetSum-root.val);
            boolean y=hasPathSum1(root,root.right,targetSum-root.val);

            return x||y;

        }
        public boolean hasPathSum(TreeNode root, int targetSum) {


            if(root==null){
                return false;

            }

            return hasPathSum1(root,root,targetSum);
        }
    }
}
