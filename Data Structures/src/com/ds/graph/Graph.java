package com.ds.graph;

import java.util.LinkedList;

class AdjecentListGraph {
	private int vetices;
	private LinkedList<Integer> adjecentList[];
	
	public int getVetices() {
		return vetices;
	}


	public void setVetices(int vetices) {
		this.vetices = vetices;
	}

	public LinkedList<Integer>[] getAdjecentList() {
		return adjecentList;
	}

	public void setAdjecentList(LinkedList<Integer>[] adjecentList) {
		this.adjecentList = adjecentList;
	}

	@SuppressWarnings("unchecked")
	public AdjecentListGraph(int vertices){
		this.vetices=vertices;
		adjecentList = new LinkedList[vertices];
		for (int i = 0; i < vertices; i++) {
			adjecentList[i] = new LinkedList<>();
		}
	}
	
	public static void addEdge(AdjecentListGraph graph, int source, int destination){
		graph.getAdjecentList()[source].add(destination);
		graph.getAdjecentList()[destination].add(source);
	}
	
	public static void printGraph(AdjecentListGraph graph){
		for (int i=0; i<graph.getVetices();i++) {
			System.out.println("vertex : "+i);
			System.out.print("head : ");
				for (Integer integer : graph.getAdjecentList()[i]) {
					System.out.print(" -> "+integer); 
				}
				System.out.println("\n");
			}
		}
	}

public class Graph{
	public static void main(String[] args) {
		int vertices = 5;
		AdjecentListGraph graph = new AdjecentListGraph(vertices);
		AdjecentListGraph.addEdge(graph, 0, 1); 
		AdjecentListGraph.addEdge(graph, 0, 4); 
		AdjecentListGraph.addEdge(graph, 1, 2); 
		AdjecentListGraph.addEdge(graph, 1, 3); 
		AdjecentListGraph.addEdge(graph, 1, 4); 
		AdjecentListGraph.addEdge(graph, 2, 3); 
		AdjecentListGraph.addEdge(graph, 3, 4);
		AdjecentListGraph.printGraph(graph);
	}
}
