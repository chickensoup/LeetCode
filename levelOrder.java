public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	
    	Queue<TreeNode> first = new LinkedList<TreeNode>();
    	Queue<TreeNode> second = new LinkedList<TreeNode>();
    	
    	if (root == null)
    		return result;
    	
    	first.offer(root);
    	while (first.size() != 0)
    	{
    		TreeNode value;
    		ArrayList<Integer> list = new ArrayList<Integer>();
    		while ( first.size() != 0)
    		{
    			value = first.poll();
    			list.add(value.val);
    			if (value.left != null)
    				second.offer(value.left);
    			if (value.right != null)
    				second.offer(value.right);
    		}
    		result.add(list);
    		first = new LinkedList<TreeNode>(second);
    		second.clear();
    	}
    	return result;
    }