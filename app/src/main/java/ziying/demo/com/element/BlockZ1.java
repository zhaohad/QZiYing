package ziying.demo.com.element;

public class BlockZ1 extends Tetris {
    private static final BlockZ1 instance = new BlockZ1();

	private BlockZ1() {

        init();
    }

    public static BlockZ1 getInstance() {

        return instance;
    }

    @Override
    public void init() {
        int[][] initBlock = {{0, 1, 0, 0},
                             {1, 1, 0, 0},
                             {1, 0, 0, 0},
                             {0, 0, 0, 0}};

        TOP = 0;
        BUTTON = 2;
        LEFT = 0;
        RIGHT = 1;

        this.block = initBlock;
        this.transBlock = BlockZ2.getInstance();
    }

}


