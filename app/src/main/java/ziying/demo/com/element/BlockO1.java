package ziying.demo.com.element;

/**
 * Created by zhaohad on 2017/7/27.
 */

public class BlockO1 extends Tetris {
    private static final BlockO1 instance = new BlockO1();

    private BlockO1() {
        init();
    }

    public static BlockO1 getInstance() {
        return instance;
    }

    @Override
    public void init() {
        int[][] initBlock = {{1, 1, 0, 0},
                             {1, 1, 0, 0},
                             {0, 0, 0, 0},
                             {0, 0, 0, 0}};

        this.block = initBlock;
        this.transBlock = BlockO2.getInstance();
    }

}
