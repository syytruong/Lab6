package com.example.syt.lab6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    public int min = 0;
    public int max = 12;
    public int userNumber;
    TextView january, february, march, april, may, june, july, august, september, october, november, december;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        january = (TextView)findViewById(R.id.january);
        february = (TextView)findViewById(R.id.february);
        march = (TextView)findViewById(R.id.march);
        april = (TextView)findViewById(R.id.april);
        may = (TextView)findViewById(R.id.may);
        june = (TextView)findViewById(R.id.june);
        july = (TextView)findViewById(R.id.july);
        august = (TextView)findViewById(R.id.august);
        september = (TextView)findViewById(R.id.september);
        october = (TextView)findViewById(R.id.october);
        november = (TextView)findViewById(R.id.november);
        december = (TextView)findViewById(R.id.december);

        View.OnClickListener listener = new View.OnClickListener() {
            public void onClick (View v){
                switch (v.getId()){
                    case R.id.january:
                        userNumber = 0;
                        generateNumber(userNumber);
                        return;
                    case R.id.february:
                        userNumber = 1;
                        generateNumber(userNumber);
                        return;
                    case R.id.march:
                        userNumber = 2;
                        generateNumber(userNumber);
                        return;
                    case R.id.april:
                        userNumber = 3;
                        generateNumber(userNumber);
                        return;
                    case R.id.may:
                        userNumber = 4;
                        generateNumber(userNumber);
                        return;
                    case R.id.june:
                        userNumber = 5;
                        generateNumber(userNumber);
                        return;
                    case R.id.july:
                        userNumber = 6;
                        generateNumber(userNumber);
                        return;
                    case R.id.august:
                        userNumber = 7;
                        generateNumber(userNumber);
                        return;
                    case R.id.september:
                        userNumber = 8;
                        generateNumber(userNumber);
                        return;
                    case R.id.october:
                        userNumber = 9;
                        generateNumber(userNumber);
                        return;
                    case R.id.november:
                        userNumber = 10;
                        generateNumber(userNumber);
                        return;
                    case R.id.december:
                        userNumber = 11;
                        generateNumber(userNumber);
                        return;
                }
            }
        };
        january.setOnClickListener(listener);
        february.setOnClickListener(listener);
        march.setOnClickListener(listener);
        april.setOnClickListener(listener);
        may.setOnClickListener(listener);
        june.setOnClickListener(listener);
        july.setOnClickListener(listener);
        august.setOnClickListener(listener);
        september.setOnClickListener(listener);
        october.setOnClickListener(listener);
        november.setOnClickListener(listener);
        december.setOnClickListener(listener);

    }

    public void generateNumber (int number){

        String winner = "You win!";
        String tie = "Tie!!";
        String loser = "Loser!!!";

        Random random = new Random();
        int compNumber = random.nextInt(12);
        TextView result = (TextView)findViewById(R.id.result);
        if (compNumber > number){
            result.setText(loser);
        }
        else if(compNumber == number){
            result.setText(tie);
        }
        else if(compNumber < number){
            result.setText(winner);
        }
    }
    /*View.OnClickListener listener = new View.OnClickListener() {
        public void onClick (View v){
            switch (v.getId()){
                case R.id.january:
                    userNumber = 0;
                    generateNumber(userNumber);
                    return;
                case R.id.february:
                    userNumber = 0;
                    generateNumber(userNumber);
                    return;
                case R.id.march:
                    userNumber = 0;
                    generateNumber(userNumber);
                    return;
                case R.id.april:
                    userNumber = 0;
                    generateNumber(userNumber);
                    return;
                case R.id.may:
                    userNumber = 0;
                    generateNumber(userNumber);
                    return;
                case R.id.june:
                    userNumber = 0;
                    generateNumber(userNumber);
                    return;
                case R.id.july:
                    userNumber = 0;
                    generateNumber(userNumber);
                    return;
                case R.id.august:
                    userNumber = 0;
                    generateNumber(userNumber);
                    return;
                case R.id.september:
                    userNumber = 0;
                    generateNumber(userNumber);
                    return;
                case R.id.october:
                    userNumber = 0;
                    generateNumber(userNumber);
                    return;
                case R.id.november:
                    userNumber = 0;
                    generateNumber(userNumber);
                    return;
                case R.id.december:
                    userNumber = 0;
                    generateNumber(userNumber);
                    return;
            }
        }
    };*/



}
