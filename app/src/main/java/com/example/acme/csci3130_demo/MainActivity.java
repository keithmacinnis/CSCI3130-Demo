package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        //Grab input
        EditText editText = findViewById(R.id.editText);
        String message = editText.getText().toString();
        //Throw input onto the label
        TextView destinationText = findViewById(R.id.destinationText);
        destinationText.setText(message);
    }
}


//