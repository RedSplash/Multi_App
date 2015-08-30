package android.redsplash.com.multiapp;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button sounds
       // final MediaPlayer buttonSound = MediaPlayer.create(menu.this,R.raw.button_click);

        // setting up the button references
        Button tut1 =(Button)findViewById(R.id.tutorial1);
        Button tut2 =(Button)findViewById(R.id.tutorial2);

        tut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // buttonSound.start();
                startActivity(new Intent("com.redsplash.miltiapp.Tut1"));
            }
        });

        tut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // buttonSound.start();
                startActivity(new Intent("com.redsplash.miltiapp.Tut1"));
            }
        });
    }
    @Override
    protected void onPause() {
        super.onPause();
    }

}
