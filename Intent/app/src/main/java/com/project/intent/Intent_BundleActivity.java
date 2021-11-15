package com.project.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Intent_BundleActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent__bundle);

        setTitle("Budle資料傳遞");

        textView = (TextView)findViewById(R.id.textView);

        Intent it = getIntent();
        Bundle bundle = it.getExtras();
        String name =  bundle.getString("Name");
        float h = bundle.getFloat("Height");
        float w = bundle.getFloat("Weight");
        float BMI = bundle.getFloat("BMI");

        textView.setText("姓名：" + name + "\n" + "身高：" + h + "\n"  + "體重：" + w + "\n" + "\n" + "BMI：" + BMI);
    }
}
