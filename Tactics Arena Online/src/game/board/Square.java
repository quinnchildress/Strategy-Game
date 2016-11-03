package game.board;

import game.unit.Unit;

public class Square {

	private final Coordinate coor;

	private Unit unit;

	public Square(Unit unit, Coordinate coor) {
		this.coor = coor;
		this.unit = unit;
	}

	public Square(Coordinate coor) {
		this(null, coor);
	}

	public boolean isEmpty() {
		return (unit == null);
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
		unit.setCoor(coor);
	}

	public Coordinate getCoordinate() {
		return coor;
	}

}
