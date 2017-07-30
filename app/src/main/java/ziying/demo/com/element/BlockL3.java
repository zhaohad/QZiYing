package ziying.demo.com.element;

public class BlockL3 extends Tetris {
	private static final BlockL3 instance = new BlockL3();  

	private BlockL3() {

		init();
	}

	public static BlockL3 getInstance() {  

		return instance;
	}
	
	@Override
	public void init() {
		int[][] initBlock = {{1, 1, 0, 0},
				             {0, 1, 0, 0},
				             {0, 1, 0, 0},
				             {0, 0, 0, 0}};

		TOP = 0;
		BUTTON = 2;
		LEFT = 0;
		RIGHT = 1;

		this.block = initBlock;
		this.transBlock = BlockL4.getInstance();
	}

}
