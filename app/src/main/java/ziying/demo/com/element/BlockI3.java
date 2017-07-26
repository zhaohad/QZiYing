package ziying.demo.com.element;

/**
 * <p>1 0 0 0
 * <p>1 0 0 0 
 * <p>1 0 0 0
 * <p>1 0 0 0
 */

public class BlockI3 extends Tetris {
	private static final BlockI3 instance = new BlockI3();  

	private BlockI3() {

		init();
	}

	public static BlockI3 getInstance() {  

		return instance;
	}
	
	@Override
	public void init() {
		int[][] initBlock = {{1, 0, 0, 0},
				             {1, 0, 0, 0},
				             {1, 0, 0, 0},
				             {1, 0, 0, 0}};
		
		this.block = initBlock;
		this.transBlock = BlockI4.getInstance();
	}

}
