package com.androidcourse.yosef.clickscounter;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonReset = (Button) findViewById(R.id.button_reset);
        buttonReset.setOnClickListener(view1 -> {
            count = 0;
            display(0);

        });
    }

    private void display(int number){
        TextView quantityTextView = (TextView) findViewById(R.id.textView);
        quantityTextView.setText(""+number);
    }

    public void submitCount(View view){
        count = count + 1;
        display(count);
    }
}
