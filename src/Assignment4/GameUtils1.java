package Assignment4;

import Assignment4.GameUtils.GameTile;

public enum GameUtils1 {
	INSTANCE; // En enda medlem; INSTANCE

	public static GameTile[][] newBoard(final int width, final int height, final GameTile baseTile) {
		GameTile[][] board = new GameTile[width][height];
		fillBoard(board, baseTile);
		return board;
	}

	public static void fillBoard(final GameTile[][] board, final GameTile baseTile) {
		for (GameTile[] row : board) {
			for (int j = 0; j < row.length; j++) {
				row[j] = baseTile;
			}
		}
	}
}