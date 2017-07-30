package ziying.demo.com.element;

public class BlockZ2 extends Tetris {
    private static final BlockZ2 instance = new BlockZ2();

    private BlockZ2() {

        init();
    }

    public static BlockZ2 getInstance() {

        return instance;
    }

    @Override
    public void init() {
        int[][] initBlock = {{1, 1, 0, 0},
                             {0, 1, 1, 0},
                             {0, 0, 0, 0},
                             {0, 0, 0, 0}};

        TOP = 0;
        BUTTON = 1;
        LEFT = 0;
        RIGHT = 2;

        this.block = initBlock;
        this.transBlock = BlockZ3.getInstance();
    }

}