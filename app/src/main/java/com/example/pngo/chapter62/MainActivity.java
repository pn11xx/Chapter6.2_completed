package com.example.pngo.chapter62;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sumButton = (Button) findViewById(R.id.sumButton);

        final TextView display = (TextView) findViewById(R.id.textView);

        final EditText xInput = (EditText) findViewById(R.id.xInput);
        final EditText yInput = (EditText) findViewById(R.id.yInput);

        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double[] x = {Double.parseDouble(xInput.getText().toString()), Double.parseDouble(yInput.getText().toString())};
                DecimalFormat format = new DecimalFormat("####.00");
                display.setText("Sum of x and y: " + format.format(Sum.findSum(x)));

            }
        });
    }

}
