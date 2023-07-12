package org.water;

public class Water {
	public void boat() {
		System.out.println("Will show Boat details");
	}

	public void ship() {
		System.out.println("Will show Ship details");
	}

	public static void main(String[] args) {
		Water water = new Water();
		water.boat();
		water.ship();
	}
}
