package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView image_eightBall;
    Button askButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image_eightBall = findViewById(R.id.image_eightball);
        askButton = findViewById(R.id.askButton);

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Ask Button","Ask Button is Clicked");
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(4);
                int imageResourceId = changeImages[number];
                image_eightBall.setImageResource(imageResourceId);
            }
        });

    }

    final int[] changeImages = new int[]{
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5,

    };
}
