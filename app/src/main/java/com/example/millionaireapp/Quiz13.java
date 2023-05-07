package com.example.millionaireapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Quiz13 extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz13);
        btn1 =findViewById(R.id.buttonA);
        btn2 =findViewById(R.id.buttonB);
        btn3 =findViewById(R.id.buttonC);
        btn4 =findViewById(R.id.buttonD);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Quiz13.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Quiz13.this,Result.class);
                i.putExtra("question","13");
                i.putExtra("won","$1,00,000");
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Quiz13.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Quiz13.this,Result.class);
                i.putExtra("question","13");
                i.putExtra("won","$1,00,000");
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Quiz13.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Quiz13.this,Result.class);
                i.putExtra("question","13");
                i.putExtra("won","$1,00,000");
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Quiz13.this, "Correct Answer! you won 5,00,000$", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Quiz13.this,Quiz14.class);
                startActivity(i);
            }
        });
    }
}