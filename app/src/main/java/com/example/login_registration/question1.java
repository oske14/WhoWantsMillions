package com.example.login_registration;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class question1 extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4;

    TextView score, question;

    private Questions mQuestions = new Questions();

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionsLength = mQuestions.mQuestions.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question1);

        r = new Random();

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        score.setText("You Earned: $ " + mScore);

        updateQuestion(r.nextInt(mQuestionsLength));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.getText() == mAnswer){
                    mScore++;
                    Toast.makeText(getApplicationContext(), "Correct Answer",Toast.LENGTH_LONG).show();
                    score.setText("You Earned: $ " + mScore + "000");
                    updateQuestion(r.nextInt(mQuestionsLength));
                }else {
                    Toast.makeText(getApplicationContext(), "Incorrect Answer",Toast.LENGTH_LONG).show();
                }

            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer2.getText() == mAnswer){
                    mScore++;
                    Toast.makeText(getApplicationContext(), "Correct Answer",Toast.LENGTH_LONG).show();
                    score.setText("You Earned: $ " + mScore + "000");
                    updateQuestion(r.nextInt(mQuestionsLength));
                }else {
                    Toast.makeText(getApplicationContext(), "Incorrect Answer",Toast.LENGTH_LONG).show();
                    gameOver();
                }
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer3.getText() == mAnswer){
                    mScore++;
                    Toast.makeText(getApplicationContext(), "Correct Answer",Toast.LENGTH_LONG).show();
                    score.setText("You Earned: $ " + mScore + "000");
                    updateQuestion(r.nextInt(mQuestionsLength));
                }else {
                    Toast.makeText(getApplicationContext(), "Incorrect Answer",Toast.LENGTH_LONG).show();
                    gameOver();
                }

            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer4.getText() == mAnswer){
                    mScore++;
                    Toast.makeText(getApplicationContext(), "Correct Answer",Toast.LENGTH_LONG).show();
                    score.setText("You Earned: $ " + mScore + "000");
                    updateQuestion(r.nextInt(mQuestionsLength));
                } else {
                    Toast.makeText(getApplicationContext(), "Incorrect Answer",Toast.LENGTH_LONG).show();
                    gameOver();
                }

            }
        });
    }
    private void updateQuestion(int num){
        question.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));

        mAnswer = mQuestions.getCorrectAnswer(num);
    }

    private void gameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(question1.this);
        alertDialogBuilder
                .setMessage("Game Over, You Earned $ " + mScore + "000 .")
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(), question1.class));
                            }
                        })
        .setNegativeButton("EXIT",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }
}
