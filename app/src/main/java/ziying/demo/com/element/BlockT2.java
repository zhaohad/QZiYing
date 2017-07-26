package ziying.demo.com.element;

public class BlockT2 extends Tetris {
	private static final BlockT2 instance = new BlockT2();  

	private BlockT2() {

		init();
	}

	public static BlockT2 getInstance() {  

		return instance;
	}
	
	@Override
	public void init() {
		int[][] initBlock = {{0, 1, 0, 0},
				             {0, 1, 1, 0},
				             {0, 1, 0, 0},
				             {0, 0, 0, 0}};
		
		this.block = initBlock;
		this.transBlock = BlockT3.getInstance();
	}
	
}
