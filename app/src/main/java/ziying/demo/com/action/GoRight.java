package ziying.demo.com.action;

import ziying.demo.com.element.BackGround;
import ziying.demo.com.element.CurrentBlock;

public class GoRight extends Action {

    private static boolean canGoRight() {
        ++currentBlock.X;
        boolean result = isValid();
        --currentBlock.X;
        return result;
    }

    private static void doGoRight() {
        ++currentBlock.X;
    }

    @Override
    public void doAction(BackGround backGround, CurrentBlock currentBlock) {
        if(canGoRight()) {
            doGoRight();
        }
    }
}
