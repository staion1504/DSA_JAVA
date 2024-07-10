import java.util.*;
//Given the root of a binary tree, determine if it is a valid binary search tree (BST).
//
//        A valid BST is defined as follows:
//
//        The left
//        subtree
//        of a node contains only nodes with keys less than the node's key.
//        The right subtree of a node contains only nodes with keys greater than the node's key.
//        Both the left and right subtrees must also be binary search trees.
public class Validate_Binary_Search_Tree {

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




        public void helper(TreeNode root,List<Integer>x){
            if(root==null) return;

            helper(root.left,x);
            x.add(root.val);
            helper(root.right,x);

        }
        public boolean isValidBST(TreeNode root) {
            List<Integer>a=new ArrayList<>();

            helper(root,a);

            int n=a.size();
            for(int i=0;i<n-1;i++){
                if(a.get(i)>=a.get(i+1)){
                    return false;
                }
            }

            return true;

        }






}
