package com.zatsando.shownamenow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button myButton;
private TextView showText;
private EditText enterName;
private Button clearButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.button);
        enterName = findViewById(R.id.editText);
        clearButton = findViewById(R.id.clearButton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = enterName.getText().toString();
                showText.setText("Hello "+name+"!");
            }
        });

        showText = findViewById(R.id.textView);

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showText.setText("");
                enterName.setText("");
            }
        });
    }
}