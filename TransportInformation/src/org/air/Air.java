package org.air;

public class Air {
	public void aeroPlane() {
		System.out.println("Will show Airoplane details");
	}

	public void heliCopter() {
		System.out.println("Will show Helicopter details");
	}

	public static void main(String[] args) {
		Air air = new Air();
		air.aeroPlane();
		air.heliCopter();
	}
}