import java.util.*;
public class Binary_Tree_Right_Side_View {


//     Definition for a binary tree node.
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



    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode>q=new LinkedList<>();
        TreeNode temp=root;
        q.add(root);

        while(!q.isEmpty()){
            int c=q.size();

            while(c!=0){
                c--;
                temp=q.remove();
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            ans.add(temp.val);
        }

        return ans;

    }





}
