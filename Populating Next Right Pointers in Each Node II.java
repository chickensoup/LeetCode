/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (root == null)
        	return;

        root.next = null;
        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        if (root.left != null)
        	queue.offer(root.left);
        if (root.right != null)
        	queue.offer(root.right);

        while (!queue.isEmpty())
        {
        	TreeLinkNode p = queue.poll();
        	Queue<TreeLinkNode> tqueue = new LinkedList<TreeLinkNode>();
        	if (p.left != null)
        		tqueue.offer(p.left);
        	if (p.right != null)
        		tqueue.offer(p.right);
        	while (!queue.isEmpty())
        	{
        		TreeLinkNode q = queue.poll();
        		p.next = q;
        		p = q;
        		if (p.left != null)
        		tqueue.offer(p.left);
        		if (p.right != null)
        		tqueue.offer(p.right);
        	}
        	p.next = null;

        	while (!tqueue.isEmpty())
        		queue.offer(tqueue.poll());
        }        
    }
}