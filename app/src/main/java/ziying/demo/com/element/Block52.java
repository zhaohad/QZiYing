package ziying.demo.com.element;

/**
 * Created by zhaohad on 2017/7/27.
 */

public class Block52 extends Tetris {
    private static final Block52 instance = new Block52();

    private Block52() {

        init();
    }

    public static Block52 getInstance() {

        return instance;
    }

    @Override
    public void init() {
        int[][] initBlock = {{0, 1, 1, 0},
                             {1, 1, 0, 0},
                             {0, 0, 0, 0},
                             {0, 0, 0, 0}};

        TOP = 0;
        BUTTON = 1;
        LEFT = 0;
        RIGHT = 2;

        this.block = initBlock;
        this.transBlock = Block53.getInstance();
    }

}