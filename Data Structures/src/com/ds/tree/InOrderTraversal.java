package com.ds.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {

	public static List<Integer> inOrederTraversalRecursive(BTNode root, List<Integer> list) {
		if (null != root) {
			inOrederTraversalRecursive(root.getLeft(), list);
			list.add(root.getData());
			inOrederTraversalRecursive(root.getRight(), list);
		}
		return list;
	}

	public static List<Integer> inOrderTraversalIterative(BTNode root) {
		List<Integer> list = new ArrayList<>();
		if (null == root) {
			return list;
		}
		Stack<BTNode> stack = new Stack<>();
		BTNode current = root;
		boolean done = false;
		while (!done) {
			if (current != null) {
				stack.push(current);
				current = current.getLeft();
			} else {
				if (stack.isEmpty()) {
					done = true;
				}else{
					current = stack.pop();
					list.add(current.getData());
					current = current.getRight();
				}
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		BTNode root = new BTNode();
		root.setData(10);
		root.setLeft(new BTNode());
		root.setRight(new BTNode());
		root.getLeft().setData(20);
		root.getRight().setData(30);
		root.getLeft().setLeft(new BTNode());
		root.getLeft().setRight(new BTNode());
		root.getLeft().getLeft().setData(40);
		root.getLeft().getRight().setData(50);
		List<Integer> result = new ArrayList<>();
		List<Integer> treeList = inOrederTraversalRecursive(root, result);
		for (Integer integer : treeList) {
			System.out.print(integer+" ");
		}
		treeList = inOrderTraversalIterative(root);
		System.out.println();
		for (Integer integer : treeList) {
			System.out.print(integer+" ");
		}
	}

	// WHILE NOT DONE{
	//	 IF (CURRENT IS NOT NULL)
	// 		PUSH CURRENT IN STACK AND SET CURRENT TO LEFT
	// 	 ELSE
	// 		IF (STACK IS EMPTY)
	// 			DONE
	// 		ELSE
	// 			SET CURRENT TO STACK.POP() AND PRINT CURRENT DATA
	// 			SET CURRENT TO RIGHT
	//	}
}
