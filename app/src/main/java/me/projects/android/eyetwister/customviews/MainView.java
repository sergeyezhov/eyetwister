package me.projects.android.eyetwister.customviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class MainView extends View {

    private Paint paint = new Paint();

    private void init() {
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(2);
        setKeepScreenOn(true);
    }

    public MainView(Context context) {
        super(context);
        init();
    }

    public MainView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MainView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(350,350, 5, paint);
        canvas.drawCircle(350,650, 5, paint);
    }
}
