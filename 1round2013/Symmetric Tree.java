//Symmetric Tree
     public boolean isSymmetric(TreeNode root) {
         // Start typing your Java solution below
         // DO NOT write main() function
    	 if (root == null)
    		 return true;
    	 
    	 return symmetricCheck(root.left, root.right);
    	 
         
     }
     
     private boolean symmetricCheck(TreeNode left, TreeNode right)
     {
    	 if (left == null && right == null)
    		 return true;
    	 
    	 if (left == null || right == null)
    		 return false;
    	 
    	 return (left.val == right.val) && symmetricCheck(left.right, right.left) && symmetricCheck(left.left, right.right);
     }