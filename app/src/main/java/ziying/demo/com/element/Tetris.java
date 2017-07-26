package ziying.demo.com.element;

public abstract class Tetris {
	public int[][] block = null;
	public Tetris transBlock = null;
	
	public abstract void init ();

	public Tetris doTransform(){
		return transBlock;
	}
	
}
