package ziying.demo.com.element;

/**
 * <p>1 0 0 0
 * <p>1 0 0 0 
 * <p>1 0 0 0
 * <p>1 0 0 0
 */

public class BlockI1 extends Tetris {
	private static final BlockI1 instance = new BlockI1();  

	private BlockI1() {

		init();
	}

	public static BlockI1 getInstance() {  

		return instance;
	}
	
	@Override
	public void init() {
		int[][] initBlock = {{1, 0, 0, 0},
				             {1, 0, 0, 0},
				             {1, 0, 0, 0},
				             {1, 0, 0, 0}};

		TOP = 0;
		BUTTON = 3;
		LEFT = 0;
		RIGHT = 0;

		this.block = initBlock;
		this.transBlock = BlockI2.getInstance();
	}

}
