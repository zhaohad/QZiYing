package ziying.demo.com.element;

public class BlockL1 extends Tetris {
	private static final BlockL1 instance = new BlockL1();  

	private BlockL1() {

		init();
	}

	public static BlockL1 getInstance() {  

		return instance;
	}
	
	@Override
	public void init() {
		int[][] initBlock = {{0, 1, 0, 0},
				             {0, 1, 0, 0},
				             {0, 1, 1, 0},
				             {0, 0, 0, 0}};

		TOP = 0;
		BUTTON = 2;
		LEFT = 1;
		RIGHT = 2;

		this.block = initBlock;
		this.transBlock = BlockL2.getInstance();
	}
	
}
