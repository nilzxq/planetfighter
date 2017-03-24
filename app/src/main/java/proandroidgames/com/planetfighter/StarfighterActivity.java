package proandroidgames.com.planetfighter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class StarfighterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*display the splash screen image from a layout*/
        setContentView(R.layout.splashscreen);
        /*start up the splash screen and main menu in a time deplayed thread*/
        new Handler().postDelayed(new Thread(){
            public void run(){
                Intent mainMenu=new Intent(StarfighterActivity.this,Sfmainmenu.class);
                StarfighterActivity.this.startActivity(mainMenu);
                StarfighterActivity.this.finish();
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        },SFEngine.GAME_THREAD_DELAY);
        /*start a new game thread*/

       /* new Thread(){
            @Override
            public void run(){

            }
        };*/
    }
}
