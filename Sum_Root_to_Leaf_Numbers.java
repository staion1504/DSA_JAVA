public class Sum_Root_to_Leaf_Numbers {



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
        int sum=0;
        int ans=0;
        public int sumNumbers(TreeNode root) {

            if(root==null) return 0;
            sum=sum*10+root.val;
            if(root.left==null&&root.right==null){
                System.out.println(sum);
                ans+=sum;
            }
            else{
                sumNumbers(root.left);
                sumNumbers(root.right);
            }
            sum-=root.val;
            sum/=10;

            return ans;




        }
    }




}
