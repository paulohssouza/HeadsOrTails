package com.cursoandroid.ph.headsortails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button buttonPlay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonPlay = findViewById(R.id.buttonPlay);

        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentResult = new Intent(getApplicationContext(), ResultGameActivity.class);

                //Generate random number
                int number = new Random().nextInt(2);
                //Pass data
                intentResult.putExtra("number", number);
                startActivity(intentResult);
            }
        });
    }
}