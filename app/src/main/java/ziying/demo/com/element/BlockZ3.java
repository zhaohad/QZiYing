package ziying.demo.com.element;

/**
 * Created by zhaohad on 2017/7/26.
 */

public class BlockZ3 extends Tetris {
    private static final BlockZ3 instance = new BlockZ3();

    private BlockZ3() {
        init();
    }

    public static BlockZ3 getInstance() {
        return instance;
    }

    @Override
    public void init() {
        int[][] initBlock = {{0, 1, 0, 0},
                             {1, 1, 0, 0},
                             {1, 0, 0, 0},
                             {0, 0, 0, 0}};

        this.block = initBlock;
        this.transBlock = BlockZ4.getInstance();
    }

}