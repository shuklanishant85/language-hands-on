package com.practice.algos;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal extends Traversal {
	
	private TreeNode root;
	
	public InOrderTraversal(TreeNode root,List<Integer> list) {
		super(list);
		this.root = root;
	}

	@Override
	public List<Integer> traverseRecursively(TreeNode root, List<Integer> list) {
		if (list == null) {
			list = new ArrayList<>();
		}
		if (null != root) {
			traverseRecursively(root.getLeft(),list);
			list.add(root.getData());
			traverseRecursively(root.getRight(),list);
		}
		return list;
	}

	@Override
	public List<Integer> traverseIteratively() {
		orderList = new ArrayList<>();
		if (null == root) {
			return orderList;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode current = root;
		boolean done = false;
		while (!done) {
			if (current != null) {
				stack.push(current);
				current = current.getLeft();
			} else {
				if (stack.isEmpty()) {
					done = true;
				} else {
					current = stack.pop();
					orderList.add(current.getData());
					current = current.getRight();
				}
			}
		}
		return orderList;
	}

	/*
	 * WHILE NOT DONE{ 
	 * 		IF (CURRENT NOT NULL) { 
	 * 			PUSH CURRENT IN STACK SET CURRENT TO LEFT 
	 * 		} ELSE { 
	 * 			IF (STACK IS EMPTY)
	 * 				 DONE 
	 * 			ELSE
	 * 				 SET CURRENT TO STACK POP
	 * 				 PRINT CURRENT 
	 * 				 SET CURRENT TO RIGHT 
	 * 		}
	 * }
	 * 
	 */
}
