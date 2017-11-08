package me.projects.android.eyetwister;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import me.projects.android.eyetwister.customviews.MainView;

public class MainActivity extends AppCompatActivity {

    private MainView mainView;
    private final int ENGLISH_GREEN = 0xff003826;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainView = new MainView(this);
        mainView.setBackgroundColor(ENGLISH_GREEN);
        setContentView(mainView);
    }
}
