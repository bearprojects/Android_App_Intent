package com.project.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editName, editHeight, editWeight;
    Button btn1, btn2, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Intent");

        editName = (EditText)findViewById(R.id.editName);
        editHeight = (EditText)findViewById(R.id.editHeight);
        editWeight = (EditText)findViewById(R.id.editWeight);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btnClear = (Button)findViewById(R.id.btnClear);

        editName.requestFocusFromTouch();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent();

                float h = Float.parseFloat(editHeight.getText().toString());
                float w = Float.parseFloat(editWeight.getText().toString());
                float BMI = w / (h/100 * h/100);

                it.putExtra("Name",editName.getText().toString());
                it.putExtra("Height",h);
                it.putExtra("Weight",w);
                it.putExtra("BMI",BMI);

                it.setClass(MainActivity.this,Intent_SimpleActivity.class);
                startActivity(it);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent();
                it.setClass(MainActivity.this,Intent_BundleActivity.class);

                float h = Float.parseFloat(editHeight.getText().toString());
                float w = Float.parseFloat(editWeight.getText().toString());
                float BMI = w / (h/100 * h/100);

                Bundle bundle = new Bundle();
                bundle.putString("Name",editName.getText().toString());
                bundle.putFloat("Height",h);
                bundle.putFloat("Weight",w);
                bundle.putFloat("BMI",BMI);

                it.putExtras(bundle);
                startActivity(it);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editName.setText("");
                editHeight.setText("");
                editWeight.setText("");
                editName.requestFocus();
            }
        });
    }
}
