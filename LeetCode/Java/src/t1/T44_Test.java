package t1;

import java.util.LinkedList;
import java.util.Queue;

import t1.T44_Solution;
import t1.TreeNode;

public class T44_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(null);
		queue.add(null);
		T44_Solution t = new T44_Solution();
		TreeNode n = null;
		t.levelOrder(n);

	}

}