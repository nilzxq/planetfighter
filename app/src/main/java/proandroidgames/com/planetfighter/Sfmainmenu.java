package proandroidgames.com.planetfighter;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageButton;


/**
 * Created by zxq on 2017/3/23 0023.
 */

public class Sfmainmenu extends Activity{

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starfighter);
        /*set menu button options*/
        ImageButton start=(ImageButton)findViewById(R.id.btnStart);
        ImageButton exit=(ImageButton)findViewById(R.id.btnExit);
        start.getBackground().setAlpha(SFEngine.MENU_BUTTON_ALPHA);
        start.setHapticFeedbackEnabled(SFEngine.HAPTIC_BUTTON_FEEDBACK);
        exit.getBackground().setAlpha(SFEngine.MENU_BUTTON_ALPHA);
        exit.setHapticFeedbackEnabled(SFEngine.HAPTIC_BUTTON_FEEDBACK);
    }

}
