package com.cursoandroid.ph.headsortails;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class ResultGameActivity extends AppCompatActivity {
    private Button buttonBack;
    private ImageView imageViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_game);
        imageViewResult = findViewById(R.id.imageViewResult);
        buttonBack = findViewById(R.id.buttonBack);
        //Recover data
        Bundle data = getIntent().getExtras();
        int number = data.getInt("number");
        if (number == 0) {
            imageViewResult.setImageResource(R.drawable.moeda_cara);
        } else {
            imageViewResult.setImageResource(R.drawable.moeda_coroa);
        }
        buttonBack.setOnClickListener(v -> finish());
    }
}