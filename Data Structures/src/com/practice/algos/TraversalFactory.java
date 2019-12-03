package com.practice.algos;

public class TraversalFactory{
	public static Traversal getTraversal(TraversalAbstractFactory factory){
		return factory.runTraversal();
	};
}
