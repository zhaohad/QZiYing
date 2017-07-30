package ziying.demo.com.element;

public class BlockJ4 extends Tetris {
	private static final BlockJ4 instance = new BlockJ4();  

	private BlockJ4() {

		init();
	}

	public static BlockJ4 getInstance() {  

		return instance;
	}
	
	@Override
	public void init() {
		int[][] initBlock = {{0, 0, 0, 0},
				             {1, 1, 1, 0},
				             {0, 0, 1, 0},
				             {0, 0, 0, 0}};

		TOP = 1;
		BUTTON = 2;
		LEFT = 0;
		RIGHT = 2;

		this.block = initBlock;
		this.transBlock = BlockJ1.getInstance();
	}
	
}
