package com.example.day01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView title1;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title1 = findViewById(R.id.title1);
        title1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              i =  10/0;

            }
        });
    }
}
