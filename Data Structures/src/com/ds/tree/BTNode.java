package com.ds.tree;

public class BTNode {
	private int data;
	private BTNode left;
	private BTNode right;

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * @return the left
	 */
	public BTNode getLeft() {
		return left;
	}

	/**
	 * @param left
	 *            the left to set
	 */
	public void setLeft(BTNode left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public BTNode getRight() {
		return right;
	}

	/**
	 * @param right
	 *            the right to set
	 */
	public void setRight(BTNode right) {
		this.right = right;
	}

}
