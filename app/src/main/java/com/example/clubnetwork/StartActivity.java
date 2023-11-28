package com.example.clubnetwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class StartActivity extends AppCompatActivity {

    private ImageView icon_image;
    private Button login;
    private Button register;
    private LinearLayout linear_layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        icon_image = findViewById(R.id.icon_image);
        login = findViewById(R.id.login);
        register = findViewById(R.id.register);
        linear_layout = findViewById(R.id.linear_layout);

        TranslateAnimation animation = new TranslateAnimation(0, 0, 0, -1000);
        animation.setDuration(1000);
        animation.setFillAfter(false);
        animation.setAnimationListener(new MyAnimationListener());

        icon_image.setAnimation(animation);
    }
        private class MyAnimationListener implements Animation.AnimationListener {

       @Override
       public void onAnimationStart(Animation animation) {

       }

       @Override
       public void onAnimationEnd(Animation animation) {
            icon_image.clearAnimation();
            icon_image.setVisibility(View.INVISIBLE);
            linear_layout.animate().alpha(1f).setDuration(1000);
       }

       @Override
       public void onAnimationRepeat(Animation animation) {

       }
   }
}