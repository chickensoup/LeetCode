//Balanced Binary Tree
     public boolean isBalanced(TreeNode root) {
         // Start typing your Java solution below
         // DO NOT write main() function
    	 return balanceTree(root, new treeClass(0));
    	 
     }
     class treeClass{
    	 int depth;
    	 public treeClass(int depth)
    	 {
    		 this.depth = depth;
    	 }
     }
     
     boolean balanceTree(TreeNode root, treeClass cc)
     {
    	 if (root == null)
    	 {
    		 cc.depth = 0;
    		 return true;
    	 }
    	 
    	 treeClass leftNode = new treeClass(0), rightNode = new treeClass(0);
    	 boolean leftBan = balanceTree(root.left, leftNode);
    	 boolean rightBan = balanceTree(root.right, rightNode);
    	 
    	 cc.depth = (leftNode.depth > rightNode.depth) ? leftNode.depth +1: rightNode.depth+1;
    	 return leftBan && rightBan && (Math.abs(rightNode.depth-leftNode.depth) <= 1);
    	 
     }