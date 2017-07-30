package ziying.demo.com.element;

/**
 * <p>1 1 1 1
 * <p>0 0 0 0 
 * <p>0 0 0 0
 * <p>0 0 0 0
 */

public class BlockI4 extends Tetris {
	private static final BlockI4 instance = new BlockI4();  

	private BlockI4() {
		init();
	}

	public static BlockI4 getInstance() {  

		return instance;
	}
	
	@Override
	public void init() {
		int[][] initBlock = {{1, 1, 1, 1},
							 {0, 0, 0, 0},
							 {0, 0, 0, 0},
							 {0, 0, 0, 0}};

		TOP = 0;
		BUTTON = 0;
		LEFT = 0;
		RIGHT = 3;

		this.block = initBlock;
		this.transBlock = BlockI1.getInstance();
	}

}
