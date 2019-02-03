package game;

import java.util.List;

import board.Board;

public class Game {
	Board board;
	public Game() {
		board = new Board();
		board.loadBoardFromData();
	}
}
