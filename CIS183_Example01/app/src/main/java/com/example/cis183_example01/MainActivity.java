package com.example.cis183_example01;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

//all vars will be global

public class MainActivity extends AppCompatActivity {

    TextView lbl_j_HW;
    EditText etxt_j_TB;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //code here
        //assign xml vars to java vars
        lbl_j_HW = findViewById(R.id.lbl_v_HW);
        etxt_j_TB = findViewById(R.id.etxt_v_TB);
        setGreetingMessage();
        String nameFromTextBox = getNameFromTextBox();
        Log.d("The name is ",  nameFromTextBox);
    }

    public void setGreetingMessage()
    {
        lbl_j_HW.setText("Welcome to app");
    }

    public String getNameFromTextBox()
    {
        return etxt_j_TB.getText().toString();
    }
}