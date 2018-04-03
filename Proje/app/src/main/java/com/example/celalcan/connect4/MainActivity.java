package com.example.celalcan.connect4;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;
import android.text.InputType;
import android.util.Log;
import android.widget.Toast;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {
    EditText time;
    EditText boardsize;
    int checktime;
    int checksize;
    int status;

    public void showToast() {
        if (checksize < 5 || checksize > 40) {
            Toast.makeText(this, "Please, Enter a size between 5-40.", Toast.LENGTH_LONG).show();
        }
        else if (checktime < 5 || checktime > 120) {
            Toast.makeText(this, "Please, Enter a time between 5-120.Enter 0 For Infinite Time.", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout cl = (ConstraintLayout) findViewById(R.id.layout);
        cl.setBackgroundColor(Color.CYAN);
        boardsize = (EditText) findViewById(R.id.boardsize);
        boardsize.setInputType(InputType.TYPE_CLASS_NUMBER);
        time = (EditText) findViewById(R.id.time);
        time.setInputType(InputType.TYPE_CLASS_NUMBER);
        Button single = findViewById(R.id.single);
        Button multi = findViewById(R.id.multi);
        multi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(!(time.getText().toString().equals("") || boardsize.getText().toString().equals(""))) {
                    checktime = Integer.parseInt(time.getText().toString());
                    checksize = Integer.parseInt(boardsize.getText().toString());
                    status = 1;
                    if(checktime == 0){
                        status=1;
                    }
                    else if (checktime < 5 || checktime > 120){
                        showToast();
                        status = 0;
                    }
                    if (checksize < 5 || checksize > 40) {
                        showToast();
                        status = 0;
                    }
                    if (status == 1) {
                        Intent i = new Intent(MainActivity.this, Board.class);
                        i.putExtra("Boardsize: ", boardsize.getText().toString());
                        i.putExtra("Time: ", time.getText().toString());
                        i.putExtra("Mode: ", "multi");
                        startActivity(i);
                    }
                }
                else{
                    showToast();
                }
            }
        });
        single.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(!(time.getText().toString().equals("") || boardsize.getText().toString().equals(""))) {
                    checktime = Integer.parseInt(time.getText().toString());
                    checksize = Integer.parseInt(boardsize.getText().toString());
                    status = 1;
                    if(checktime == 0){
                        status=1;
                    }
                    else if (checktime < 5 || checktime > 120){
                            showToast();
                            status = 0;
                    }
                    if (checksize < 5 || checksize > 40) {
                        showToast();
                        status = 0;
                    }
                    if (status == 1) {
                        Intent i = new Intent(MainActivity.this, Board.class);
                        i.putExtra("Boardsize: ", boardsize.getText().toString());
                        i.putExtra("Time: ", time.getText().toString());
                        i.putExtra("Mode: ", "single");
                        startActivity(i);
                    }
                }
                else{
                    showToast();
                }
            }
        });
    }
}
