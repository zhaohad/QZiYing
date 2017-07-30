package ziying.demo.com.action;

import ziying.demo.com.element.BackGround;
import ziying.demo.com.element.CurrentBlock;

public class GoLeft extends Action {

    private static boolean canGoLeft() {
        --currentBlock.X;
        boolean result = isValid();
        ++currentBlock.X;
        return result;
    }

    private static void doGoLeft() {
        --currentBlock.X;
    }

    @Override
    public void doAction(BackGround backGround, CurrentBlock currentBlock) {
        if(canGoLeft()) {
            doGoLeft();
        }
    }
}
