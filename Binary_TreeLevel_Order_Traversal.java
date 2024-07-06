import java.util.*;
public class Binary_TreeLevel_Order_Traversal {

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


        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>>ans=new ArrayList<>();
            Queue<TreeNode>q=new LinkedList<>();

            if(root==null) return ans;

            q.add(root);

            while(!q.isEmpty()){
                int c=q.size();
                ans.add(new ArrayList<>());
                while(c!=0){
                    TreeNode temp=q.remove();
                    c--;
                    ans.get(ans.size()-1).add(temp.val);
                    if(temp.left!=null) q.add(temp.left);
                    if(temp.right!=null) q.add(temp.right);
                }

            }


            return ans;
        }

}
