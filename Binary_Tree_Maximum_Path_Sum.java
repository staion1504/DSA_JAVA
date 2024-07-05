public class Binary_Tree_Maximum_Path_Sum {

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


        int max=Integer.MIN_VALUE;
        public int helper(TreeNode root){

            if(root==null){
                return 0;
            }

            int l= helper(root.left);
            int r= helper(root.right);

            if(l<0) l=0;
            if(r<0) r=0;

            int m=root.val+l;
            int n=root.val+r;
            int o=l+r+root.val;

            max=Math.max(m,max);
            max=Math.max(n,max);
            max=Math.max(o,max);

            return Math.max(m,n);

        }
        public int maxPathSum(TreeNode root) {

            if(root==null){
                return 0;
            }

            helper(root);
            return max;
        }

}
