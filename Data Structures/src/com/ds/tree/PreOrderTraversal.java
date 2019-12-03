
package com.ds.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {

	public static List<Integer> preOrderTraversalRecursive(BTNode root, List<Integer> result) {
		if (null != root) {
			result.add(root.getData());
			preOrderTraversalRecursive(root.getLeft(), result);
			preOrderTraversalRecursive(root.getRight(), result);
		}
		return result;
	}

	public static List<Integer> preOrderTraversalIterative(BTNode root) {
		List<Integer> result = new ArrayList<>();
		Stack<BTNode> stack = new Stack<>();
		if (null == root) {
			return result;
		}
		stack.push(root);
		while (!stack.isEmpty()) {
			BTNode current = stack.pop();
			result.add(current.getData());
			if (null != current.getRight()) {
				stack.push(current.getRight());
			}
			if (null != current.getLeft()) {
				stack.push(current.getLeft());
			}
		}
		return result;
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
		List<Integer> treeList = preOrderTraversalRecursive(root, result);
		for (Integer integer : treeList) {
			System.out.print(integer+" ");
		}
		treeList = preOrderTraversalIterative(root);
		System.out.println();
		for (Integer integer : treeList) {
			System.out.print(integer+" ");
		}
	}
}
