package com.amir.buttg.uoggpacgpacalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final ImageView image = (ImageView) findViewById(R.id.imageView);
        final Animation an = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        final Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.abc_fade_out);
        image.startAnimation(an);

//        if (!isNetworkAvailable()) {
//            Toast.makeText(getBaseContext(),"Network is Not Available",Toast.LENGTH_SHORT).show();
//        }

        an.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                image.startAnimation(animation2);
                Intent intent = new Intent(getBaseContext(), Main3Activity.class);
                startActivity(intent);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
    }
}
