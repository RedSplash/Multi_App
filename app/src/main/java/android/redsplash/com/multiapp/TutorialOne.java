package android.redsplash.com.multiapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;



public class TutorialOne extends Activity {

    BreakOut v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        v = new BreakOut(this);
        setContentView(v);
    }
}
