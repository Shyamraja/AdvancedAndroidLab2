package com.example.android.uiprogrammatically1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
public class MainActivity extends AppCompatActivity {

    int buttonPressed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final Button gameButton = new Button(this);



        gameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              buttonPressed = buttonPressed + 1;
              gameButton.setText("you have pressed the button" + buttonPressed + "times");
            }
        });

        gameButton.setText("Hello, I'm the button");
        setContentView(gameButton);
    }
}
