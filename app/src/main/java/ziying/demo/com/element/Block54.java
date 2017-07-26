package ziying.demo.com.element;

/**
 * Created by zhaohad on 2017/7/27.
 */

public class Block54 extends Tetris {
    private static final Block54 instance = new Block54();

    private Block54() {

        init();
    }

    public static Block54 getInstance() {

        return instance;
    }

    @Override
    public void init() {
        int[][] initBlock = {{0, 1, 1, 0},
                             {1, 1, 0, 0},
                             {0, 0, 0, 0},
                             {0, 0, 0, 0}};

        this.block = initBlock;
        this.transBlock = Block51.getInstance();
    }

}