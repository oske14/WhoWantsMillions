package com.example.login_registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button starts;
    private Button win;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        starts = findViewById(R.id.start);
        starts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openquestion1();

                win = findViewById(R.id.finished);
                win.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openwin();
                    }
                });
            }
        });
    }


    private void openquestion1() {
        Intent intent = new Intent(this, question1.class);
        startActivity(intent);
    }
    public void openwin() {
        Intent intent = new Intent(this, finish.class);
        startActivity(intent);
    }
}


