// Part of SourceAFIS: https://sourceafis.machinezoo.com
package com.machinezoo.sourceafis;

class FingerprintMinutia {
	final Cell position;
	final double direction;
	final MinutiaType type;
	FingerprintMinutia(Cell position, double direction, MinutiaType type) {
		this.position = position;
		this.direction = direction;
		this.type = type;
	}
	@Override public String toString() {
		return String.format("%s @ %s angle %f", type.toString(), position.toString(), direction);
	}
}
