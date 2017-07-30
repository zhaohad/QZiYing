package ziying.demo.com.element;

public class BlockT1 extends Tetris {
	private static final BlockT1 instance = new BlockT1();  

	private BlockT1() {

		init();
	}

	public static BlockT1 getInstance() {  

		return instance;
	}
	
	@Override
	public void init() {
		int[][] initBlock = {{0, 0, 0, 0},
				             {1, 1, 1, 0},
				             {0, 1, 0, 0},
				             {0, 0, 0, 0}};

		TOP = 1;
		BUTTON = 2;
		LEFT = 0;
		RIGHT = 2;

		this.block = initBlock;
		this.transBlock = BlockT2.getInstance();
	}
	
}
