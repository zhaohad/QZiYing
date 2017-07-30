package ziying.demo.com.element;

public class BlockT4 extends Tetris {
	private static final BlockT4 instance = new BlockT4();  

	private BlockT4() {

		init();
	}

	public static BlockT4 getInstance() {  

		return instance;
	}
	
	@Override
	public void init() {
		int[][] initBlock = {{0, 1, 0, 0},
				             {1, 1, 0, 0},
				             {0, 1, 0, 0},
				             {0, 0, 0, 0}};

		TOP = 0;
		BUTTON = 2;
		LEFT = 0;
		RIGHT = 1;

		this.block = initBlock;
		this.transBlock = BlockT1.getInstance();
	}
	
}
