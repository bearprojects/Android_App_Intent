package com.project.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Intent_SimpleActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent__simple);

        setTitle("簡易資料傳遞");

        textView = (TextView)findViewById(R.id.textView);

        Intent it = getIntent();
        String name = it.getStringExtra("Name");
        float h = it.getFloatExtra("Height",0);
        float w = it.getFloatExtra("Weight",0);
        float BMI = it.getFloatExtra("BMI",0);

        textView.setText("姓名：" + name + "\n" + "身高：" + h + "\n"  + "體重：" + w + "\n" + "\n" + "BMI：" + BMI);
    }
}
