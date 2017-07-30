package ziying.demo.com.element;

/**
 * Created by zhaohad on 2017/7/27.
 */

public class Block53 extends Tetris {
    private static final Block53 instance = new Block53();

    private Block53() {

        init();
    }

    public static Block53 getInstance() {

        return instance;
    }

    @Override
    public void init() {
        int[][] initBlock = {{1, 0, 0, 0},
                             {1, 1, 0, 0},
                             {0, 1, 0, 0},
                             {0, 0, 0, 0}};

        TOP = 0;
        BUTTON = 2;
        LEFT = 0;
        RIGHT = 1;

        this.block = initBlock;
        this.transBlock = Block54.getInstance();
    }

}