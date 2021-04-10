package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    EditText height;
    EditText weight;
    EditText gender;
    EditText disease;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
        gender = (EditText) findViewById(R.id.gender);
        disease = (EditText) findViewById(R.id.disease);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String h=height.getText().toString().trim();
                String w=weight.getText().toString().trim();
                String g=gender.getText().toString().trim();
                String d=disease.getText().toString().trim();
                Bundle bundle=new Bundle();
                bundle.putString("height",h);
                bundle.putString("weight",w);
                bundle.putString("gender",g);
                bundle.putString("disease",d);
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

}
