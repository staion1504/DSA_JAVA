//Given the root of a binary search tree,
//and an integer k, return the kth smallest value (1-indexed) of all
//the values of the nodes in the tree.



public class Kth_Smallest_Element_in_a_BST {

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


        int ans=-1;
        int c=0;
        public int kthSmallest(TreeNode root, int k) {

            if(root==null) return ans;



            kthSmallest(root.left,k);
            c++;
            if(c==k) ans=root.val;
            kthSmallest(root.right,k);

            return ans;
        }

}
