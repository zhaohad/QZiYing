package ziying.demo.com.element;

public class BackGround {
    private static final BackGround instance = new BackGround();
    public static int[][] BackGroundBlocks;
    public static final int LENTH = 18;
    public static final int WIDTH = 10;

    private BackGround() {

        init();
    }

    public static BackGround getInstance() {

        return instance;
    }

    public void init() {
        BackGroundBlocks = new int[LENTH][WIDTH];
        for(int i = 0; i < LENTH; ++i) {
            for(int j = 0; j < WIDTH; ++j) {
                BackGroundBlocks[i][j] = 0;
            }
        }

    }

}