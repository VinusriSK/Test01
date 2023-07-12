package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
	public void transportForm() {
		System.out.println("Vehicle Details");
	}

	public static void main(String[] args) {
		Transport transport = new Transport();
		transport.transportForm();
		Road road = new Road();
		road.bike();
		road.bus();
		road.car();
		road.cycle();
		Air air = new Air();
		air.aeroPlane();
		air.heliCopter();
		Water water = new Water();
		water.boat();
		water.ship();
	}
}
