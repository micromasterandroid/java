package com.example.bhlr.clickcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonReset = (Button) findViewById(R.id.button_reset);
        Button buttonCount = (Button) findViewById(R.id.button);
        buttonReset.setOnClickListener(view1 -> {
            count = 0;
            display(count);
        });
        buttonCount.setOnClickListener(this::submitCount);
    }

    public void submitCount(View view) {
        count = count + 1;
        display(count);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.textView2);
        quantityTextView.setText("" + number);
    }
}