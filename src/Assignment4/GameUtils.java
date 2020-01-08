package Assignment4;

public class GameUtils {
	//Enda instansen av GameUtils 
	private static final GameUtils instance = new GameUtils() ; 
	
	//Privat konstruktor
	private GameUtils() {
		
	}
	
	public static GameUtils getInstance() {
		return instance ; 
	}
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
	
	public class GameTile{
		
	}
}