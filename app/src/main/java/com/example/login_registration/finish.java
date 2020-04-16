package com.example.login_registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class finish extends AppCompatActivity {
    private Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finish);

        play = findViewById(R.id.play1more);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
    }
        });
    }
        private void openMainActivity() {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
