package ziying.demo.com.test;

/**
 * Created by zhaohad on 2017/7/30.
 */

public class TestTools {
    public static boolean testEqual(int[][] target, int[][] data){
        if(target == null || data == null) {
            return false;
        }
        if(target.length != data.length) {
            return false;
        }

        for(int y = 0; y < target.length; ++y) {
            if(target[y].length != data[y].length) {
                return false;
            }
            for(int x = 0; x < target[y].length; ++x) {
                if(target[y][x] != data[y][x]){
                    return false;
                }
            }
        }
        return true;
    }
}
