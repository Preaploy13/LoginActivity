package com.example.user.loginactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Intent intent = getIntent();
        String Text = intent.getStringExtra("Text");
        TextView TextView1 = (TextView) findViewById(R.id.textView_WELCOME);
        TextView1.setText("WELCOME");
        }
}
