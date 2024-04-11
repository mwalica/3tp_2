package com.example.temp110424_3tp_start;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private View view1, view2;
    private Button btnSave, btnCompare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view1 = findViewById(R.id.view1);
        view2 = findViewById(R.id.view2);
        btnSave = findViewById(R.id.btnSave);
        btnCompare = findViewById(R.id.btnCompare);

        btnSave.setOnClickListener(view -> {

        });

        btnCompare.setOnClickListener(view -> {
            
        });
    }
}