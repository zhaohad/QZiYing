package ziying.demo.com.element;

/**
 * Created by zhaohad on 2017/7/27.
 */

public class BlockO4 extends Tetris {
    private static final BlockO4 instance = new BlockO4();

    private BlockO4() {

        init();
    }

    public static BlockO4 getInstance() {

        return instance;
    }

    @Override
    public void init() {
        int[][] initBlock = {
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};

        this.block = initBlock;
        this.transBlock = BlockO1.getInstance();
    }

}
