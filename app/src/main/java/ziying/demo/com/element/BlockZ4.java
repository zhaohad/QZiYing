package ziying.demo.com.element;

/**
 * Created by zhaohad on 2017/7/27.
 */

public class BlockZ4 extends Tetris {
    private static final BlockZ4 instance = new BlockZ4();

    private BlockZ4() {

        init();
    }

    public static BlockZ4 getInstance() {

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
        this.transBlock = BlockZ1.getInstance();
    }

}