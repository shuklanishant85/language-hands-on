package com.practice.algos;

import java.util.List;

public abstract class Traversal {
	public List<Integer> orderList;
	
	public Traversal(List<Integer> orderList) {
		this.orderList = orderList;
	}

	public abstract List<Integer> traverseRecursively(TreeNode root, List<Integer> list);

	public abstract List<Integer> traverseIteratively();

	@Override
	public String toString() {
		StringBuilder list = new StringBuilder();
		list.append("[");
		for (Integer nodeData : orderList) {
			list.append(nodeData + " ");
		}
		list.append("]");
		return list.toString();
	}
}
