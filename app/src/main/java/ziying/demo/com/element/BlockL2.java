package ziying.demo.com.element;

public class BlockL2 extends Tetris {
	private static final BlockL2 instance = new BlockL2();  

	private BlockL2() {

		init();
	}

	public static BlockL2 getInstance() {  

		return instance;
	}
	
	@Override
	public void init() {
		int[][] initBlock = {{0, 0, 1, 0},
				             {1, 1, 1, 0},
				             {0, 0, 0, 0},
				             {0, 0, 0, 0}};

		TOP = 0;
		BUTTON = 1;
		LEFT = 0;
		RIGHT = 2;

		this.block = initBlock;
		this.transBlock = BlockL3.getInstance();
	}
	
}
