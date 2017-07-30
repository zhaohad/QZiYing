package ziying.demo.com.action;

import android.util.Log;

import ziying.demo.com.element.BackGround;
import ziying.demo.com.element.CurrentBlock;

public abstract class Action {
    public static BackGround backGround = BackGround.getInstance();
    public static CurrentBlock currentBlock = CurrentBlock.getInstance();

    public  abstract void doAction(BackGround backGround, CurrentBlock currentBlock);

    public static boolean isValid() {
        return !(isRightOut() || isLeftOut() || isButtonOut() || isClash());

    }

    private static boolean isClash(){
        if(CurrentBlock.CUR_BLOCK == null) {
            return false;
        }

        for(int x = CurrentBlock.CUR_BLOCK.LEFT; x <= CurrentBlock.CUR_BLOCK.RIGHT; ++x) {
            for(int y = CurrentBlock.CUR_BLOCK.TOP; y <= CurrentBlock.CUR_BLOCK.BUTTON; ++y) {
                int backGroundPointValue = backGround.BackGroundBlocks[CurrentBlock.Y+y][CurrentBlock.X+x];
                int currentBlockPointValue = CurrentBlock.CUR_BLOCK.block[y][x];

                if(backGroundPointValue + currentBlockPointValue > 1){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isLeftOut() {
        return CurrentBlock.CUR_BLOCK != null && CurrentBlock.X + CurrentBlock.CUR_BLOCK.LEFT < 0;

    }

    private static boolean isRightOut() {
        return CurrentBlock.CUR_BLOCK != null && CurrentBlock.X + CurrentBlock.CUR_BLOCK.RIGHT >= BackGround.WIDTH;

    }

    private static boolean isButtonOut() {
        return CurrentBlock.CUR_BLOCK != null && CurrentBlock.Y + CurrentBlock.CUR_BLOCK.BUTTON >= BackGround.LENTH;
    }

    public static void mergeAndErase() {
        if(CurrentBlock.CUR_BLOCK == null || !isValid()) {
            return;
        }
        doMerge();
        doErase();
    }

    public static void doMerge() {

        for(int x = CurrentBlock.CUR_BLOCK.LEFT; x <= CurrentBlock.CUR_BLOCK.RIGHT; ++x) {
            for(int y = CurrentBlock.CUR_BLOCK.TOP; y <= CurrentBlock.CUR_BLOCK.BUTTON; ++y) {
                backGround.BackGroundBlocks[CurrentBlock.Y+y][CurrentBlock.X+x] = CurrentBlock.CUR_BLOCK.block[y][x];
            }
        }
    }

    public static void doErase() {
        int endLine = 0;
        int lineNum = 0;

        for(int y = BackGround.LENTH - 1; y >= 0; --y) {
            boolean canErase = true;
            for(int x = 0; x < BackGround.WIDTH; ++x) {
                if(backGround.BackGroundBlocks[y][x] == 0) {
                    canErase = false;
                }
            }
            if(canErase) {
                endLine = Math.max(endLine, y);
                ++lineNum;
            }
        }

        for(int y = endLine; y >= lineNum; --y) {
            for (int x = 0; x < BackGround.WIDTH; ++x) {
                backGround.BackGroundBlocks[y][x] = backGround.BackGroundBlocks[y - lineNum][x];
            }
        }

        for(int y = 0; y < lineNum; ++y) {
            for (int x = 0; x < BackGround.WIDTH; ++x) {
                backGround.BackGroundBlocks[y][x] = 0;
            }
        }
    }

}
