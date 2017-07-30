package ziying.demo.com.action;

import ziying.demo.com.element.BackGround;
import ziying.demo.com.element.CurrentBlock;
import ziying.demo.com.element.Tetris;

public class Transform extends Action {

    private static boolean canTransform() {
        Tetris tmp = CurrentBlock.CUR_BLOCK;
        CurrentBlock.CUR_BLOCK = CurrentBlock.CUR_BLOCK.transBlock;
        boolean result = isValid();
        CurrentBlock.CUR_BLOCK = tmp;
        return result;
    }

    private static void doTransform() {
        CurrentBlock.CUR_BLOCK = CurrentBlock.CUR_BLOCK.transBlock;
    }

    @Override
    public void doAction(BackGround backGround, CurrentBlock currentBlock) {
        if(canTransform()) {
            doTransform();
        }
    }
}
