package com.rajalakshmi.gpjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SampleCanvas sc = new SampleCanvas(this);
        setContentView(sc);

    }

    private class SampleCanvas extends View {

        public SampleCanvas(Context context) {
            super(context);
        }

        @Override
        protected  void onDraw(Canvas canvas){
            Paint paint = new Paint();
            paint.setColor(Color.YELLOW);
            canvas.drawPaint(paint);
            paint.setColor(getResources().getColor(R.color.Orange));
            paint.setTextSize(50f);
            canvas.drawText("Graphical Primitives",300,80,paint);
            paint.setColor(Color.RED);
            paint.setTextSize(50f);
            canvas.drawText("Circle",160,200,paint);
            canvas.drawCircle(250,500,200,paint);
            paint.setColor(getResources().getColor(R.color.Rose));
            canvas.drawText("Rectangle",600,200,paint);
            canvas.drawRect(600,300,900,900,paint);
            paint.setColor(getResources().getColor(R.color.DeepBlue));
            canvas.drawText("Oval",160,1000,paint);
            canvas.drawOval(100,1050,500,1600,paint);
        }
    }
}