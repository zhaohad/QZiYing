package ziying.demo.com.element;

public class BlockT3 extends Tetris {
	private static final BlockT3 instance = new BlockT3();  

	private BlockT3() {

		init();
	}

	public static BlockT3 getInstance() {  

		return instance;
	}
	
	@Override
	public void init() {
		int[][] initBlock = {{0, 1, 0, 0},
				             {1, 1, 1, 0},
				             {0, 0, 0, 0},
				             {0, 0, 0, 0}};
		
		this.block = initBlock;
		this.transBlock = BlockT4.getInstance();
	}
	
}
