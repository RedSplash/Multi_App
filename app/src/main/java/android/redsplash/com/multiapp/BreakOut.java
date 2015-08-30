package android.redsplash.com.multiapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;



public class BreakOut extends View {

    private Rect rec;
    private int Xs = 10;
    private int Ys = 10;
    private int SqrSide = 100;
    private Paint paint;
//    public Canvas canvas;


    public BreakOut(Context context) {
        super(context);
        rec = new Rect();
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        rec.set(SqrSide,SqrSide,SqrSide,SqrSide);
        rec.offset(Xs,Ys);
        paint.setColor(Color.BLUE);
        canvas.drawRect(rec, paint);
        update();
        try {
            Thread.sleep(300);

        }catch (InterruptedException e){}
        invalidate();
    }

private void update(){
        Xs += 5;
        Ys += 5;

        if (Xs < getWidth()){
            Xs += 5;

        }else {
            Xs -= 5;
        }
        if(Ys < getHeight()){
            Ys += 5;
        }else{
            Ys -= 5;
        }
    }


}
