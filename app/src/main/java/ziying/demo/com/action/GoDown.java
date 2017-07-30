package ziying.demo.com.action;


import ziying.demo.com.element.BackGround;
import ziying.demo.com.element.CurrentBlock;

public class GoDown extends Action {

    private static boolean canGoDown() {
        ++currentBlock.Y;
        boolean result = isValid();
        --currentBlock.Y;
        return result;
    }

    private static void doGoDown() {
        ++currentBlock.Y;
    }

    @Override
    public void doAction(BackGround backGround, CurrentBlock currentBlock) {
        if(canGoDown()) {
            doGoDown();
        }else {
            mergeAndErase();
        }
    }
}
