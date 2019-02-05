package game;

import java.util.List;

import board.Board;

public class Game {
	Board board;
	public Game() throws Exception {
		board = new Board();
		board.loadBoardFromData();
	}
	
}
