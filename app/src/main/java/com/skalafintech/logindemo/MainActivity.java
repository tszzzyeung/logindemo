package com.skalafintech.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {
    boolean logon = false; //identify the login status
    boolean chooseLocation = false;
    private TextView mainWelcomeSlogan;
    private TextView main_name;
    private EditText edName;
    private TextView mainGender;
    private RadioButton rbMale;
    private RadioButton rbFemale;
    private RadioGroup rbgGender;
    private TextView mainAge;
    private EditText edAge;
    private Button bNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(!chooseLocation){
            Intent location = new Intent(this,ChooseLocationActivity.class);
            startActivity(location);
        }
        /*if(!logon){
            Intent login = new Intent(this, LoginActivity.class);  //new intent to next page
            startActivity(login);
        }*/
        findView();
        bNext.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //to question activity
                //create dummy question first , questions should be loaded from database accordingly
                Intent questions = new Intent(getApplicationContext(), QuestionsActivity.class);
                startActivity(questions);
            }
        });

    }

    private void findView() {
        mainWelcomeSlogan = (TextView) findViewById(R.id.text_welcome);
        main_name = findViewById((R.id.text_Name));
        edName = findViewById((R.id.ed_Name));
        mainGender = findViewById((R.id.text_Gender));
        rbgGender = findViewById((R.id.rbg_gender));
        rbMale = findViewById((R.id.rb_Male));
        rbFemale = findViewById((R.id.rb_Female));
        mainAge = findViewById(R.id.text_Age);
        edAge = findViewById(R.id.ed_Age);
        bNext = findViewById((R.id.button_Next));
    }
}
