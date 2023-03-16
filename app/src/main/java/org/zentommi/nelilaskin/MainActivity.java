package org.zentommi.nelilaskin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstNumberInput;
    private EditText secondNumberInput;
    private TextView answerOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumberInput = findViewById(R.id.firstNumberInput);
        secondNumberInput = findViewById(R.id.secondNumberInput);
        answerOutput = findViewById(R.id.answerOutput);

    }

    public void addNumbers(View view) {
        int firstNumber = Integer.parseInt(firstNumberInput.getText().toString());
        int secondNumber = Integer.parseInt(secondNumberInput.getText().toString());
        int answer = firstNumber + secondNumber;
        answerOutput.setText(Integer.toString(answer));
    }

    public void minusNumbers(View view) {
        int firstNumber = Integer.parseInt(firstNumberInput.getText().toString());
        int secondNumber = Integer.parseInt(secondNumberInput.getText().toString());
        int answer = firstNumber - secondNumber;
        answerOutput.setText(Integer.toString(answer));
    }

    public void multiplyNumbers(View view) {
        int firstNumber = Integer.parseInt(firstNumberInput.getText().toString());
        int secondNumber = Integer.parseInt(secondNumberInput.getText().toString());
        int answer = firstNumber * secondNumber;
        answerOutput.setText(Integer.toString(answer));
    }

    public void divideNumbers(View view) {
        int firstNumber = Integer.parseInt(firstNumberInput.getText().toString());
        int secondNumber = Integer.parseInt(secondNumberInput.getText().toString());
        int answer = firstNumber / secondNumber;
        answerOutput.setText(Integer.toString(answer));
    }
}