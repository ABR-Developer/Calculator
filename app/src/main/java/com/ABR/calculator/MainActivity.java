package com.ABR.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public String num1 = "";
    public String num2 = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView btn_dot = findViewById(R.id.button_dot);
        btn_dot.setOnClickListener(this);
        TextView btn_0 = findViewById(R.id.button_0);
        btn_0.setOnClickListener(this);
        TextView btn_1 = findViewById(R.id.button_1);
        btn_1.setOnClickListener(this);
        TextView btn_2 = findViewById(R.id.button_2);
        btn_2.setOnClickListener(this);
        TextView btn_3 = findViewById(R.id.button_3);
        btn_3.setOnClickListener(this);
        TextView btn_4 = findViewById(R.id.button_4);
        btn_4.setOnClickListener(this);
        TextView btn_5 = findViewById(R.id.button_5);
        btn_5.setOnClickListener(this);
        TextView btn_6 = findViewById(R.id.button_6);
        btn_6.setOnClickListener(this);
        TextView btn_7 = findViewById(R.id.button_7);
        btn_7.setOnClickListener(this);
        TextView btn_8 = findViewById(R.id.button_8);
        btn_8.setOnClickListener(this);
        TextView btn_9 = findViewById(R.id.button_9);
        btn_9.setOnClickListener(this);
        TextView btn_equal = findViewById(R.id.button_equal);
        btn_equal.setOnClickListener(this);
        TextView btn_plus_minus = findViewById(R.id.button_plus_minus);
        btn_plus_minus.setOnClickListener(this);
        TextView btn_plus = findViewById(R.id.button_plus);
        btn_plus.setOnClickListener(this);
        TextView btn_minus = findViewById(R.id.button_minus);
        btn_minus.setOnClickListener(this);
        TextView btn_multiply = findViewById(R.id.button_multiply);
        btn_multiply.setOnClickListener(this);
        TextView btn_divide = findViewById(R.id.button_divide);
        btn_divide.setOnClickListener(this);
        TextView btn_clear = findViewById(R.id.button_clear);
        btn_clear.setOnClickListener(this);
        TextView btn_mod = findViewById(R.id.button_mod);
        btn_mod.setOnClickListener(this);
        TextView btn_percentage = findViewById(R.id.button_percentage);
        btn_percentage.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        TextView number1 = findViewById(R.id.number1);
        TextView number2 = findViewById(R.id.number2);
        TextView op = findViewById(R.id.button_operator);

        switch (view.getId()){
            case R.id.button_plus_minus:
                if(op.getText() == "")
                {
                    if(!num1.contains("-"))
                    {
                        num1 = "-".concat(num1);
                    }
                    else{
                        num1 = num1.substring(1);
                    }
                    number1.setText(num1);
                }
                else{
                    if(!num2.contains("-"))
                    {
                        num2 = "-".concat(num2);
                    }
                    else{
                        num2 = num2.substring(1);
                    }
                    number2.setText(num2);
                }
                break;
            case R.id.button_0:
                if(op.getText() == "") {
                    if(num1 == "" || num1 == "0")
                    {

                    }
                    else{
                        num1 = num1.concat("0");
                    }
                    number1.setText(num1);
                }
                else{
                    if(num2 == "" || num2 == "0")
                    {

                    }
                    else{
                        num2 = num2.concat("0");
                    }
                    number2.setText(num2);
                }
                break;
            case R.id.button_dot:
                if(op.getText()=="")
                {
                    if( num1 == "" || num1 == "0" || num1 == "0.")
                    {
                        num1 = "0.";
                    }
                    else if(num1.contains("."))
                    {

                    }
                    else{
                        num1 = num1.concat(".");
                    }
                    number1.setText(num1);
                }
                else{
                    if( num2 == "" || num2 == "0" || num2 == "0.")
                    {
                        num2 = "0.";
                    }
                    else if(num2.contains("."))
                    {

                    }
                    else{
                        num2 = num2.concat(".");
                    }
                    number2.setText(num2);
                }
                break;
            case R.id.button_equal:
                double x = 0;
                if(op.getText()== "+")
                {
                    if(num2 == "")
                    {
                        x = Double.parseDouble(num1);
                    }
                    else{
                        x = Double.parseDouble(num1) + 0;
                    }
                }
                else if(op.getText()== "-")
                {
                    if(num2 == "")
                    {
                        x = Double.parseDouble(num1) - 0;
                    }
                    else {
                        x = Double.parseDouble(num1) - Double.parseDouble(num2);
                    }
                }
                else if(op.getText()== "*")
                {
                    if(num2 == "")
                    {
                        x = Double.parseDouble(num1) * 0;
                    }
                    else {
                        x = Double.parseDouble(num1) * Double.parseDouble(num2);
                    }
                }
                else if(op.getText()== "/")
                {
                    if(num2 == "")
                    {
                        Toast.makeText(this,"Second value must be not null", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        x = Double.parseDouble(num1) / Double.parseDouble(num2);
                    }
                }
                else if(op.getText()== "mod")
                {
                    if(num2 == "")
                    {
                        Toast.makeText(this,"Second value must be not null", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        x = Double.parseDouble(num1) % Double.parseDouble(num2);
                    }
                }
                num1 = Double.toString(x);
                num2 = "";
                number1.setText(num1);
                number2.setText(num2);
                break;
            case R.id.button_1:
                if(op.getText() == "")
                {
                    num1 = num1.concat("1");
                    number1.setText(num1);
                }
                else{
                    num2 = num2.concat("1");
                    number2.setText(num2);
                }
                break;
            case R.id.button_2:
                if(op.getText() == "")
                {
                    num1 = num1.concat("2");
                    number1.setText(num1);
                }
                else{
                    num2 = num2.concat("2");
                    number2.setText(num2);
                }
                break;
            case R.id.button_3:
                if(op.getText() == "")
                {
                    num1 = num1.concat("3");
                    number1.setText(num1);
                }
                else{
                    num2 = num2.concat("3");
                    number2.setText(num2);
                }
                break;
            case R.id.button_plus:
                op.setText("+");
                break;
            case R.id.button_4:
                if(op.getText() == "")
                {
                    num1 = num1.concat("4");
                    number1.setText(num1);
                }
                else{
                    num2 = num2.concat("4");
                    number2.setText(num2);
                }
                break;
            case R.id.button_5:
                if(op.getText() == "")
                {
                    num1 = num1.concat("5");
                    number1.setText(num1);
                }
                else{
                    num2 = num2.concat("5");
                    number2.setText(num2);
                }
                break;
            case R.id.button_6:
                if(op.getText() == "")
                {
                    num1 = num1.concat("6");
                    number1.setText(num1);
                }
                else{
                    num2 = num2.concat("6");
                    number2.setText(num2);
                }
                break;
            case R.id.button_minus:
                op.setText("-");
                break;
            case R.id.button_7:
                if(op.getText() == "")
                {
                    num1 = num1.concat("7");
                    number1.setText(num1);
                }
                else{
                    num2 = num2.concat("7");
                    number2.setText(num2);
                }
                break;
            case R.id.button_8:
                if(op.getText() == "")
                {
                    num1 = num1.concat("8");
                    number1.setText(num1);
                }
                else{
                    num2 = num2.concat("8");
                    number2.setText(num2);
                }
                break;
            case R.id.button_9:
                if(op.getText() == "")
                {
                    num1 = num1.concat("9");
                    number1.setText(num1);
                }
                else{
                    num2 = num2.concat("9");
                    number2.setText(num2);
                }
                break;
            case R.id.button_multiply:
                op.setText("*");
                break;
            case R.id.button_percentage:
                if(num1 != "" || num1 == "-")
                {
                    Double val = Double.parseDouble(num1) / 100;
                    num1 = Double.toString(val);
                    number1.setText(num1);
                    number2.setText(num2);
                    op.setText("");
                }
                break;
            case R.id.button_mod:
                op.setText("mod");
                break;
            case R.id.button_clear:
                num1 = "";
                num2 = "";
                number1.setText(num1);
                number2.setText(num2);
                op.setText("");
                break;
            case R.id.button_divide:
                op.setText("/");
                break;
        }
    }
}