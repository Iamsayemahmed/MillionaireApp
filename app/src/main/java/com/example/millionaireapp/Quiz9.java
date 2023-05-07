package com.example.millionaireapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Quiz9 extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz9);
        btn1 =findViewById(R.id.buttonA);
        btn2 =findViewById(R.id.buttonB);
        btn3 =findViewById(R.id.buttonC);
        btn4 =findViewById(R.id.buttonD);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Quiz9.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Quiz9.this,Result.class);
                i.putExtra("question","9");
                i.putExtra("won","$5000");
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Quiz9.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Quiz9.this,Result.class);
                i.putExtra("question","9");
                i.putExtra("won","$5000");
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Quiz9.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Quiz9.this,Result.class);
                i.putExtra("question","9");
                i.putExtra("won","$5000");
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Quiz9.this, "Correct Answer! you won 10000$", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Quiz9.this,Quiz10.class);
                startActivity(i);
            }
        });
    }
}