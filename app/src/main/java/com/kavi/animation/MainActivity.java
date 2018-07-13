package com.kavi.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View v){

        ImageView shin = (ImageView) findViewById(R.id.shin);

        //shin.animate().rotation(180f).setDuration(1000);
        shin.animate().translationXBy(1000f).setDuration(1000);
        //shin.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
        //ImageView chan = (ImageView) findViewById(R.id.chan);

        //chan.animate().alpha(1f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          ImageView shin = (ImageView) findViewById(R.id.shin);

          shin.setTranslationX(-1000f);
        shin.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);


    }
}
