package ziying.demo.com.element;

public class BlockJ3 extends Tetris {
	private static final BlockJ3 instance = new BlockJ3();  

	private BlockJ3() {

		init();
	}

	public static BlockJ3 getInstance() {  

		return instance;
	}
	
	@Override
	public void init() {
		int[][] initBlock = {{0, 1, 0, 0},
				             {1, 1, 0, 0},
				             {0, 1, 0, 0},
				             {0, 0, 0, 0}};
		
		this.block = initBlock;
		this.transBlock = BlockJ4.getInstance();
	}
	
}
