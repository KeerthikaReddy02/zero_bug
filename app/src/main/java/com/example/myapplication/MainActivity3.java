package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    float height,weight,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String h = bundle.getString("height");
            String w = bundle.getString("weight");
            String g = bundle.getString("gender");
            String d= bundle.getString("disease");
            height=Float.parseFloat(h);
            weight=Float.parseFloat(w);
            result=weight/(height*height);
            if(result<18.5)
            {
                String r="Malnourished BMI";
                TextView bmi = findViewById(R.id.textView3);
                bmi.setText(r);
            }
            if(result>25)
            {
                String r="Overweight BMI";
                TextView bmi = findViewById(R.id.textView3);
                bmi.setText(r);
            }
            if(result>=18.5&&result<=25)
            {
                String r="Healthy BMI";
                TextView bmi = findViewById(R.id.textView3);
                bmi.setText(r);
            }
            if(d.equals("Yes")){

                if (g.equals("M")&& result < 18.5) {
                    String r = "Focus more on carbohydrates, iodine, vitamin A.Focus on building muscle. Make sure to consult your doctor";
                    TextView bmi = findViewById(R.id.textView4);
                    bmi.setText(r);
                }
                if (g.equals("M")&& result > 25) {
                    String r = "Focus on managing calories. Focus on fat burning exercises. Make sure to consult your doctor.";
                    TextView bmi = findViewById(R.id.textView4);
                    bmi.setText(r);
                }
                if (g.equals("M")&& (result >= 18.5 && result <= 25)) {
                    String r = "Focus on eating a balanced diet. Focus both on muscle building and cardio. Make sure to consult your doctor.";
                    TextView bmi = findViewById(R.id.textView4);
                    bmi.setText(r);
                }
                if (g.equals("F") && result < 18.5) {
                    String r = "Focus more on carbohydrates, iodine, vitamin A.Focus on building muscle. Make sure to consult your doctor";
                    TextView bmi = findViewById(R.id.textView4);
                    bmi.setText(r);
                }
                if (g.equals("F") && result > 25) {
                    String r = "Focus on managing calories. Focus on flexibility and fitness. Make sure to consult your doctor.";
                    TextView bmi = findViewById(R.id.textView4);
                    bmi.setText(r);
                }
                if (g.equals("F") && (result >= 18.5 && result <= 25)) {
                    String r = "Focus more on carbohydrates, iodine, vitamin A.Focus on building muscle. Make sure to consult your doctor";
                    TextView bmi = findViewById(R.id.textView4);
                    bmi.setText(r);
                }
            }

            else
            {


                if (g.equals("M") && result < 18.5) {
                    String r = "Focus more on carbohydrates, iodine, vitamin A.Focus on building muscle,endurance and cardio";
                    TextView bmi = findViewById(R.id.textView4);
                    bmi.setText(r);
                }
                if (g.equals("M") && result > 25) {
                    String r = "Focus on managing calories. Focus on fat burning exercises. Do more rigorous workout";
                    TextView bmi = findViewById(R.id.textView4);
                    bmi.setText(r);
                }
                if (g.equals("M") && (result >= 18.5 && result <= 25)) {
                    String r = "Focus on eating a balanced diet. Focus both on muscle building and cardio";
                    TextView bmi = findViewById(R.id.textView4);
                    bmi.setText(r);
                }
                if (g.equals("F") && result < 18.5) {
                    String r = "Focus more on carbohydrates, iodine, vitamin A.Focus on building muscle.";
                    TextView bmi = findViewById(R.id.textView4);
                    bmi.setText(r);
                }
                if (g.equals("F") && result > 25) {
                    String r = "Focus on managing calories. Focus on flexibility and fitness.";
                    TextView bmi = findViewById(R.id.textView4);
                    bmi.setText(r);
                }
                if (g.equals("F") && (result >= 18.5 && result <= 25)) {
                    String r = "Focus more on carbohydrates, iodine, vitamin A.Focus on building muscle.";
                    TextView bmi = findViewById(R.id.textView4);
                    bmi.setText(r);
                }
            }



        }
    }
}
