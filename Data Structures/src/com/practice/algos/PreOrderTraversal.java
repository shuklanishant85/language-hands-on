package com.practice.algos;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal extends Traversal {

	private TreeNode root;
	
	public PreOrderTraversal(TreeNode root, List<Integer> list) {
		super(list);
		this.root = root;
	}

	@Override
	public List<Integer> traverseRecursively(TreeNode root, List<Integer> list) {
		if (list == null) {
			list = new ArrayList<>();
		}
		if (null != root) {
			traverseRecursively(root.getLeft(), list);
			traverseRecursively(root.getRight(), list);
			list.add(root.getData());
		}
		return null;
	}

	@Override
	public List<Integer> traverseIteratively() {
		orderList = new ArrayList<>();
		if (null == root) {
			return orderList;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while(!stack .isEmpty()){
			TreeNode current = stack.pop();
			orderList.add(current.getData());
			if (current.getRight()!=null) {
				stack.push(current.getRight());
			}
			if (current.getLeft()!=null) {
				stack.push(current.getLeft());
			}
		}
		return orderList;
	}

	
	/*
	   	WHILE (STACK IS NOT EMPTY)
	   		SET CURRENT TO STACK POP
	   		PUSH RIGHT IN STACK
	   		PUSH LEFT IN STACK
	 */
}
