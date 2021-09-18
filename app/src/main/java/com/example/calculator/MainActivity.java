package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculation(View v) {
        // Define variable for component
        EditText eTextNum1 = findViewById(R.id.number1);
        EditText eTextNum2 = findViewById(R.id.number2);
        EditText eTextResult = findViewById(R.id.result);

        // Get value from edittext
        String txtNum1 = eTextNum1.getText().toString();
        String txtNum2 = eTextNum2.getText().toString();

        if (txtNum1.equals("") ||  txtNum2.equals("")) {
            Toast toast = Toast.makeText(getApplicationContext(), "Please fill all the field!", Toast.LENGTH_SHORT);
            toast.show();
            return;
        }

        // Parse to double
        double num1 = Double.parseDouble(txtNum1);
        double num2 = Double.parseDouble(txtNum2);

        // Calculate and Show result to edittext result
        if (v.getId() == R.id.increment) {
            double result = num1 + num2;
            eTextResult.setText(String.valueOf(result));
        } else if (v.getId() == R.id.decrement) {
            double result = num1 - num2;
            eTextResult.setText(String.valueOf(result));
        } else if (v.getId() == R.id.multiply) {
            double result = num1 * num2;
            eTextResult.setText(String.valueOf(result));
        } else {
            double result = num1 / num2;
            eTextResult.setText(String.valueOf(result));
        }
    }
}