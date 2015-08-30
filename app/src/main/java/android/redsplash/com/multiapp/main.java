package android.redsplash.com.multiapp;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.io.IOException;


public class main extends Activity {

    //MediaPlayer logoMusic;

    @Override
    protected void onCreate(Bundle theBundle) {
        super.onCreate(theBundle);
        setContentView(R.layout.splash);


       // logoMusic = MediaPlayer.create(main.this, R.raw.startup);
        //logoMusic.start();
        Thread logoTimer = new Thread() {
            public void run() {
                try {
                    Intent menuIntent = new Intent("com.redsplash.miltiapp.MENU");
                    sleep(1000);
                    startActivity(menuIntent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    finish();

                }
            }

        };
        logoTimer.start();
    }

    protected void onPause() {
        super.onPause();
       // logoMusic.release();
    }

}

