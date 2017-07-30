package ziying.demo.com.element;

public class CurrentBlock {
    private static final CurrentBlock instance = new CurrentBlock();
    public static int X = 4;
    public static int Y = 0;
    public static Tetris CUR_BLOCK = null;

    private CurrentBlock() {
        init();
    }

    public static CurrentBlock getInstance() {

        return instance;
    }

    public static void init() {
        X = 4;
        Y = 0;
        CUR_BLOCK = null;
    }

    public static void initBlock(Tetris block) {
        CUR_BLOCK = block;
        X = 4;
        Y = 0;
    }

}