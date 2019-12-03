package com.practice.algos;

import java.util.ArrayList;
import java.util.List;

public class TreePractice {
	public static void main(String[] args) {
		TreeNode root = new TreeNode();
		root.setData(10);
		root.setLeft(new TreeNode());
		root.setRight(new TreeNode());
		root.getLeft().setData(20);
		root.getRight().setData(30);
		root.getLeft().setLeft(new TreeNode());
		root.getLeft().setRight(new TreeNode());
		root.getLeft().getLeft().setData(40);
		root.getLeft().getRight().setData(50);
		List<Integer> list = new ArrayList<>();
		Traversal traversal = TraversalFactory.getTraversal(new InOrderTraversalFactory(root,list));
		traversal.traverseIteratively();
		System.out.println(traversal.toString());
	}
}

