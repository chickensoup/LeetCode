public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
		// Start typing your Java solution below
        // DO NOT write main() function
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	
    	Stack<TreeNode> first = new Stack<TreeNode>();
    	Stack<TreeNode> second = new Stack<TreeNode>();
    	
    	Queue<TreeNode> ss = new LinkedList<TreeNode>();
    	LinkedList<TreeNode> cc = new LinkedList<TreeNode>();
    	
    	
    	if (root == null)
    		return result;
    	
    	first.push(root);
    	while (first.size() != 0)
    	{
    		TreeNode value;
    		ArrayList<Integer> list = new ArrayList<Integer>();
    		while ( first.size() != 0)
    		{
    			value = first.pop();
    			list.add(value.val);
    			if (value.left != null)
    				second.push(value.left);
    			if (value.right != null)
    				second.push(value.right);
    		}

    		result.add(list);
    		result.add(list);
    		first = new Stack<TreeNode>();
    		second.clear();
    	}
    	return result;
        
    }