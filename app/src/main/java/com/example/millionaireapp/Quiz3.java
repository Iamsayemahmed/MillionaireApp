package com.example.millionaireapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Quiz3 extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        btn1 =findViewById(R.id.buttonA);
        btn2 =findViewById(R.id.buttonB);
        btn3 =findViewById(R.id.buttonC);
        btn4 =findViewById(R.id.buttonD);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Quiz3.this, "Correct Answer! you won 300$", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Quiz3.this,Quiz4.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Quiz3.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Quiz3.this,Result.class);
                i.putExtra("question","3");
                i.putExtra("won","200");
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Quiz3.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Quiz3.this,Result.class);
                i.putExtra("question","2");
                i.putExtra("won","100");
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Quiz3.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Quiz3.this,Result.class);
                i.putExtra("question","1");
                i.putExtra("won","0");
                startActivity(i);
            }
        });
    }
}