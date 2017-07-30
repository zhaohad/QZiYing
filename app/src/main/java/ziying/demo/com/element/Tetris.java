package ziying.demo.com.element;

public abstract class Tetris {
	public int[][] block = null;
	public Tetris transBlock = null;
	public int TOP = 0;
	public int BUTTON = 0;
	public int LEFT = 0;
	public int RIGHT = 0;

	public abstract void init ();

	public Tetris doTransform(){
		return transBlock;
	}
	
}
