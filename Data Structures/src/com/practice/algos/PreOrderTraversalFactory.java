package com.practice.algos;

import java.util.List;

public class PreOrderTraversalFactory implements TraversalAbstractFactory {

	private TreeNode root;
	private List<Integer> list;

	public PreOrderTraversalFactory(TreeNode root, List<Integer> list) {
		this.list = list;
		this.root = root;
	}

	@Override
	public Traversal runTraversal() {
		return new PreOrderTraversal(root, list);
	}

}
