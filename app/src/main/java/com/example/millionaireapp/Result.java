package com.example.millionaireapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView question,Won;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        question=findViewById(R.id.txtTotalQuestionsR);
        Won=findViewById(R.id.txtQuesR);
        btn=findViewById(R.id.bt_play_again);

        Intent intent = getIntent();
        String Question=intent.getStringExtra("question");
        String wonAmount=intent.getStringExtra("won");

        question.setText("Total Questions are: "+Question);
        Won.setText("Won: "+wonAmount);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Result.this,MainActivity.class);
                startActivity(i);
            }
        });


    }
}