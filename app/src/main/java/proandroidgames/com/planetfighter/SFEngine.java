package proandroidgames.com.planetfighter;

import android.view.View;
/**
 * Created by zxq on 2017/3/24 0024.
 */

public class SFEngine {
    /*Constans that will be used in the game*/
    public static final int GAME_THREAD_DELAY=4000;
    public static final int MENU_BUTTON_ALPHA=0;
    public static final boolean HAPTIC_BUTTON_FEEDBACK=true;
    /*Kill game and exit*/
    public boolean onExit(View v){
        try {
            return true;
        }catch (Exception e){
            return false;
        }

    }
}
