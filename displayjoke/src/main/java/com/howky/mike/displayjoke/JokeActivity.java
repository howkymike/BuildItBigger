package com.howky.mike.displayjoke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String INTENT_JOKE = "intent_joke";

    private String mJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent receivedIntent = getIntent();
        mJoke = receivedIntent.getStringExtra(INTENT_JOKE);

        TextView jokeTv = findViewById(R.id.joke_activity_tv);
        jokeTv.setText(mJoke);
    }
}
