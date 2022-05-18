//6206021611125 น.ส.ธรรณศร เมตตา

package com.thannasorn.exercise4_2s6206021611125;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView num;
    private Button btnUp, btnDown, btnReset;
    final String message = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num = (TextView) findViewById(R.id.num);

        btnUp = (Button) findViewById(R.id.btnUp);
        btnUp.setOnClickListener(this);

        btnDown = (Button) findViewById(R.id.btnDown);
        btnDown.setOnClickListener(this);

        btnReset = (Button) findViewById(R.id.btnReset);
        btnReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int num1 = Integer.parseInt(num.getText().toString());

        if (view.getId() == R.id.btnUp) {
            num1 = num1 + 1;
            if (num1 % 5 == 0){
                Toast.makeText(this, "หาร 5 ลงตัว", Toast.LENGTH_SHORT).show();
            }
            num.setText(Integer.toString(num1));

        } else if (view.getId() == R.id.btnDown) {
            num1 = num1 - 1;
            if (num1 % 5 == 0){
                Toast.makeText(this, "หาร 5 ลงตัว", Toast.LENGTH_SHORT).show();
            }
            num.setText(Integer.toString(num1));

        } else if (view.getId() == R.id.btnReset) {
            num.setText(message);

        }
    }
}


