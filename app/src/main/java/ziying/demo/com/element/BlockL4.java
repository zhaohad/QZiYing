package ziying.demo.com.element;

public class BlockL4 extends Tetris {
	private static final BlockL4 instance = new BlockL4();  

	private BlockL4() {

		init();
	}

	public static BlockL4 getInstance() {  

		return instance;
	}
	
	@Override
	public void init() {
		int[][] initBlock = {{0, 0, 0, 0},
				             {1, 1, 1, 0},
				             {1, 0, 0, 0},
				             {0, 0, 0, 0}};

		TOP = 1;
		BUTTON = 2;
		LEFT = 0;
		RIGHT = 2;

		this.block = initBlock;
		this.transBlock = BlockL1.getInstance();
	}
	
}
