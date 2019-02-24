package com.example.android.quizapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;


public class MainActivity<score> extends AppCompatActivity {

    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }



    public void onCheckBoxClicked(View view) {

        CheckBox utahCheckBox=(CheckBox) findViewById( R.id.checkbox_utah );
        boolean chooseUtah=utahCheckBox.isChecked();

        CheckBox atlantaCheckBox= (CheckBox) findViewById( R.id.checkbox_atlanta );
        boolean chooseAtlanta=atlantaCheckBox.isChecked();

        CheckBox miamiCheckBox= (CheckBox) findViewById( R.id.checkbox_miami );
        boolean chooseMiami=miamiCheckBox.isChecked();


        if (!utahCheckBox.isChecked() && atlantaCheckBox.isChecked() && miamiCheckBox.isChecked()) {
            score+=1;
        }

    }

    public void onRadioButtonClicked(View view) {

        RadioButton georgeWashington=(RadioButton) findViewById( R.id.george_washington );
        boolean chooseGeorgeWashinton=georgeWashington.isChecked();

        if (georgeWashington.isChecked()) {
            score++;
        }

        RadioButton stars50=(RadioButton) findViewById( R.id.stars_50 );
        boolean chooseStars50=stars50.isChecked();

        if (stars50.isChecked()) {
            score++;
        }

        RadioButton southDakota=(RadioButton) findViewById( R.id.south_dakota );
        boolean chooseSouthDakota=southDakota.isChecked();

        if (southDakota.isChecked()) {
            score++;
        }

        RadioButton alaska=(RadioButton) findViewById( R.id.alaska );
        boolean chooseAlaska=alaska.isChecked();

        if (alaska.isChecked()) {
            score++;
        }

        RadioButton missouri=(RadioButton) findViewById( R.id.missouri );
        boolean chooseMissouri=missouri.isChecked();

        if (missouri.isChecked()) {
            score++;
        }

        RadioButton independenceDay=(RadioButton) findViewById( R.id.independence_day );
        boolean chooseIndependenceDay=independenceDay.isChecked();

        if (independenceDay.isChecked()) {
            score++;
        }

        RadioButton martinLutherKingJr=(RadioButton) findViewById( R.id.martin_luther_king_jr );
        boolean chooseMartinLutherKingJr=martinLutherKingJr.isChecked();

        if (martinLutherKingJr.isChecked()) {
            score++;
        }

        RadioButton washingtonDc=(RadioButton) findViewById( R.id.washington_dc );
        boolean chooseWashingtonDc=washingtonDc.isChecked();

        if (washingtonDc.isChecked()) {
            score++;
        }
    }


    public void compareAnswer(View view){
        EditText president=(EditText) findViewById(R.id.question_five);
        String compare=president.getText().toString();
        if ("Obama".equals(compare)){
            score++;
        }

    }

    public void onClick(View view) {
        String message="";
        if (score<=6) {
            message="Your score is "+String.valueOf(score)+"\nYou need to study more about America";

        }

        else if (score>=7 && score<=9) {
            message="Your score is "+String.valueOf(score)+"\nKeep Up, you might become POTUS one day";

        }

        else {
            message="Your score is "+String.valueOf(score)+"\nGood Job, Perfect Score ";

        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        score = 0;
    }
}








