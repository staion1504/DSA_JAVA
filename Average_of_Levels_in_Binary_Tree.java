import java.util.*;
public class Average_of_Levels_in_Binary_Tree {


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


        public List<Double> averageOfLevels(TreeNode root) {
            List<Double>ans=new ArrayList<>();

            Queue<TreeNode>q=new LinkedList<>();

            if(root==null) return ans;
            q.add(root);

            while(!q.isEmpty()){
                int c=q.size();
                double x=(double)c;
                long sum=0;
                while(c!=0){
                    c--;
                    TreeNode temp=q.remove();
                    sum+=(long)temp.val;
                    if(temp.left!=null){
                        q.add(temp.left);
                    }
                    if(temp.right!=null) q.add(temp.right);
                }
                ans.add(sum/x);
            }

            return ans;

        }

}
