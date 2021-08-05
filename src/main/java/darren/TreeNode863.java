package darren;

import java.util.*;

public class TreeNode863 {

    public static void main(String[] args) {

    }


    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<Integer,TreeNode> parentMap=new HashMap<Integer, TreeNode>();
        Set<Integer> result=new HashSet<Integer>();
        findParent(parentMap,root);
        findTarget(target,null,0,k,result,parentMap);
        return new ArrayList<Integer>(result);
    }

    public void findParent(Map<Integer,TreeNode> parentMap, TreeNode root){
        if(root.left!=null){
            parentMap.put(root.left.val,root);
            findParent(parentMap,root.left);
        }
        if(root.right!=null){
            parentMap.put(root.right.val,root);
            findParent(parentMap,root.right);
        }
    }

    private void findTarget(TreeNode target,TreeNode curr, Integer depth, Integer k, Set<Integer> result, Map<Integer,TreeNode> parentMap){
        if(target==null){
            return;
        }
        if(depth.equals(k)){
            result.add(target.val);
            return;
        }
        if(target.left!=null&&target.left!=curr){
            findTarget(target.left,target,depth+1,k,result,parentMap);
        }

        if(target.right!=null&&target.right!=curr){
            findTarget(target.right,target,depth+1,k,result,parentMap);
        }

        TreeNode treeNode = parentMap.get(target.val);

        if(treeNode!=null&&treeNode!=curr){
            findTarget(treeNode,target,depth+1,k,result,parentMap);
        }
    }

       class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
     }
}
