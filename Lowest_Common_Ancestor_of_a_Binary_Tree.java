public class Lowest_Common_Ancestor_of_a_Binary_Tree {

//     Definition for a binary tree node.
     public class TreeNode {
         int val;
         TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    class Solution {
        TreeNode lca=null;
        public boolean helper(TreeNode root,TreeNode p,TreeNode q){

            if(root==null) return false;


            boolean x= helper(root.left,p,q);
            boolean y= helper(root.right,p,q);
            if((x&&y)||((root==p||root==q)&&(x||y))){
                lca=root;
                return false;
            }

            if(root==p||root==q){
                return true;
            }

            return x||y;
        }

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {


            if(root==null)
                return null;

            helper(root,p,q);

            return lca;







        }
    }
}
