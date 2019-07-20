package com.example.textreccy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    private String resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        resultText=getIntent().getStringExtra("reco");
        textView.setText(resultText);
    }
}
