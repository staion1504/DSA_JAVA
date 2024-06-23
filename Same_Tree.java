public class Same_Tree {


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


        public boolean isSameTree(TreeNode p, TreeNode q) {

            if(p==null&&q==null){
                return true;
            }
            else if(p!=null&&q!=null){
                if(p.val==q.val){
                    boolean a=isSameTree(p.left,q.left);
                    boolean b=isSameTree(p.right,q.right);

                    return a&b;}
                else return false;
            }
            else{
                return false;
            }





        }


}
