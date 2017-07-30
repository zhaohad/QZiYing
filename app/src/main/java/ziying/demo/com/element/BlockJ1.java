package ziying.demo.com.element;

public class BlockJ1 extends Tetris {
	private static final BlockJ1 instance = new BlockJ1();  

	private BlockJ1() {

		init();
	}

	public static BlockJ1 getInstance() {  

		return instance;
	}
	
	@Override
	public void init() {
		int[][] initBlock = {{0, 1, 0, 0},
				             {0, 1, 0, 0},
				             {1, 1, 0, 0},
				             {0, 0, 0, 0}};

		TOP = 0;
		BUTTON = 2;
		LEFT = 0;
		RIGHT = 1;

		this.block = initBlock;
		this.transBlock = BlockJ2.getInstance();
	}
	
}
