package com.practice.algos;

import java.util.List;

public class InOrderTraversalFactory implements TraversalAbstractFactory {
	private TreeNode root;
	private List<Integer> list;

	public InOrderTraversalFactory(TreeNode root, List<Integer> list) {
		this.list = list;
		this.root = root;
	}

	@Override
	public Traversal runTraversal() {
		return new InOrderTraversal(root, list);
	}

}
