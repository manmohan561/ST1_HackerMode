package com.example.st1_hackermode;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void move (View view) {

        LinearLayout linearLayout= findViewById(R.id.llAm);
        float bottom= -(float)(linearLayout.getBottom()*2)/3.0f;

        if (view.getTranslationY()==0) {

            ObjectAnimator objectAnimator= ObjectAnimator.ofFloat(view,"translationY", 0, bottom);
            objectAnimator.setInterpolator(new AccelerateInterpolator());
            objectAnimator.setDuration(500);
            objectAnimator.setTarget(view);
            objectAnimator.start();
        }

        else if (view.getTranslationY()==bottom) {

            ObjectAnimator objectAnimator= ObjectAnimator.ofFloat(view,"translationY", bottom, 0);
            objectAnimator.setInterpolator(new AccelerateInterpolator());
            objectAnimator.setDuration(500);
            objectAnimator.setTarget(view);
            objectAnimator.start();
        }
    }
}
