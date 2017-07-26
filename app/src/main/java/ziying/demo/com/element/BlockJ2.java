package ziying.demo.com.element;

public class BlockJ2 extends Tetris {
	private static final BlockJ2 instance = new BlockJ2();  

	private BlockJ2() {
		init();
	}

	public static BlockJ2 getInstance() {

		return instance;
	}
	
	@Override
	public void init() {
		int[][] initBlock = {{0, 1, 0, 0},
				             {1, 1, 0, 0},
				             {0, 1, 0, 0},
				             {0, 0, 0, 0}};
		
		this.block = initBlock;
		this.transBlock = BlockJ3.getInstance();
	}
	
}
