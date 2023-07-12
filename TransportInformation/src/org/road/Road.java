package org.road;

public class Road {
	public void bike() {
		System.out.println("Will show Bike details");
	}

	public void cycle() {
		System.out.println("Will show Cycle details");
	}

	public void car() {
		System.out.println("Will show Car details");
	}

	public void bus() {
		System.out.println("Will show Bus details");
	}

	public static void main(String[] args) {
		Road road = new Road();
		road.bike();
		road.bus();
		road.car();
		road.cycle();
	}
}