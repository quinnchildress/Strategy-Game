package game.unit;

import game.Team;
import game.board.Board;
import game.board.Coordinate;
import game.util.Direction;

public class Knight extends Unit {

	public static final int MOVERANGE = 3;

	public Knight(Team owner, Board board, Direction directionFacing, Coordinate coor) {
		super(owner,board, directionFacing, coor);
	}

	@Override
	public int getMoveRange() {
		return MOVERANGE;
	}

}
