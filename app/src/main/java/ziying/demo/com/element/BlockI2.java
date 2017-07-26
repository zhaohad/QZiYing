package ziying.demo.com.element;

/**
 * <p>1 1 1 1
 * <p>0 0 0 0 
 * <p>0 0 0 0
 * <p>0 0 0 0
 */

public class BlockI2 extends Tetris {
	private static final BlockI2 instance = new BlockI2();  

	private BlockI2(){

		init();
	}
	
	public static BlockI2 getInstance() {  

		return instance;
	}

	@Override
	public void init() {
		int[][] initBlock = {{1, 1, 1, 1},
				             {0, 0, 0, 0},
				             {0, 0, 0, 0},
				             {0, 0, 0, 0}};
		
		this.block = initBlock;
		this.transBlock = BlockI3.getInstance();
	}

}
