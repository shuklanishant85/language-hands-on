package com.ds.recursion;

public class TowerOfHanoi {

	public static void moveDisk(int diskCount, String source, String destination, String auxiliary) {
		
		if (diskCount==0) {
			return;
		}
		
		// move (n-1) disks from source to auxiliary
		moveDisk(diskCount - 1, source, auxiliary, destination);

		// move nth disk from source to destination
		System.out.println("move " + diskCount + "th disk from " + source + " to " + destination);
		
		// move (n-1) disks from auxiliary to destination
		moveDisk(diskCount - 1, auxiliary, destination, source);
	}
	
	
	public static void main(String[] args) {
		moveDisk(3, "Source", "destination", "auxiliary");
	}

}
