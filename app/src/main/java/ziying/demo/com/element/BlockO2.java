package ziying.demo.com.element;

/**
 * Created by zhaohad on 2017/7/27.
 */

public class BlockO2 extends Tetris {
    private static final BlockO2 instance = new BlockO2();

    private BlockO2() {

        init();
    }

    public static BlockO2 getInstance() {

        return instance;
    }

    @Override
    public void init() {
        int[][] initBlock = {{1, 1, 0, 0},
                             {1, 1, 0, 0},
                             {0, 0, 0, 0},
                             {0, 0, 0, 0}};

        TOP = 0;
        BUTTON = 1;
        LEFT = 0;
        RIGHT = 1;

        this.block = initBlock;
        this.transBlock = BlockO3.getInstance();
    }

}
