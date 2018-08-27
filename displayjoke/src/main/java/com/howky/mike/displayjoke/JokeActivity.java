package com.howky.mike.displayjoke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String INTENT_JOKE = "intent_joke";

    public String mJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        Intent receivedIntent = getIntent();
        if (receivedIntent.hasExtra(INTENT_JOKE)) {
            mJoke = receivedIntent.getStringExtra(INTENT_JOKE);
        }

        TextView jokeTv = findViewById(R.id.joke_activity_tv);
        jokeTv.setText(mJoke);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
