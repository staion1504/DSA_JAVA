import java.util.*;

//Given the root of a binary tree, return the zigzag level
// order traversal of its nodes'
//values. (i.e., from left to right,
// then right to left for the next level and alternate between).

public class Binary_Tree_Zigzag_Level_Order_Traversal {


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



        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>>ans=new ArrayList<>();
            Queue<TreeNode>q=new LinkedList<>();
            if(root==null) return ans;

            q.add(root);

            boolean flag=true;
            Stack<TreeNode>s=new Stack<>();

            while(!q.isEmpty()){

                int c=q.size();
                ans.add(new ArrayList<>());
                while(c!=0){
                    c--;
                    TreeNode temp=q.remove();
                    ans.get(ans.size()-1).add(temp.val);
                    if(flag){
                        if(temp.left!=null) s.add(temp.left);
                        if(temp.right!=null) s.add(temp.right);
                    }
                    else{
                        if(temp.right!=null) s.add(temp.right);
                        if(temp.left!=null) s.add(temp.left);

                    }
                }


                while(!s.isEmpty()){
                    q.add(s.pop());
                }


                flag=!flag;

            }


            return ans;

        }



}
