package org.transport1;

import org.air1.Air;
import org.road1.Road;
import org.water1.Water;

public class Transport {
	public void TransportForm() {
		System.out.println("Vehicle details");
	}
public static void main(String[] args) {
	Transport ts=new Transport();
	Road rd=new Road();
	Air ai=new Air();
	Water wa=new Water();
	ts.TransportForm();
	rd.bike();
	rd.cycle();
	rd.bus();
	rd.car();
	ai.aeroPlane();
	ai.heliCopter();
	wa.boat();
	wa.ship();
	
}
}
