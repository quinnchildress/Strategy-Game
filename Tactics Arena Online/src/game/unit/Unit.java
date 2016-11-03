package game.unit;

import game.Team;
import game.board.Board;
import game.board.Coordinate;
import game.board.Path;
import game.util.Direction;

public abstract class Unit {
	protected final Team owner;

	protected final Board board;

	protected Coordinate coor;
	protected Direction directionFacing;

	public Unit(Team owner, Board board, Direction directionFacing, Coordinate coor) {
		this.owner = owner;
		this.board = board;
		this.coor = coor;
		this.directionFacing = directionFacing;
	}

	public Team getOwner() {
		return owner;
	}

	public Board getBoard() {
		return board;
	}

	public Coordinate getCoor() {
		return coor;
	}

	public void setCoor(Coordinate coor) {
		this.coor = coor;
	}

	public abstract int getMoveRange();

	public Path getPathTo(Coordinate moveToCoor) {
		if (!(canMove() && isInRangeOfWalking(moveToCoor)))
			return null;
		return null;
	}

	public final boolean isInRangeOfWalking(Coordinate moveToCoor) {
		int walkingdistance = Math.abs(moveToCoor.x() - coor.x()) + Math.abs(moveToCoor.y() - coor.y());
		return walkingdistance <= getMoveRange();
	}

	// TODO make sure all units should consider overriding these methods
	public boolean canMove() {
		return true;
	}

	// side stepping is when it can move out of way to let friendly piece pass
	public boolean canSideStep() {
		return true;
	}

}
