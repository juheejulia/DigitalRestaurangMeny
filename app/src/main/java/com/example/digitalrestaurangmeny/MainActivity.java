package com.example.digitalrestaurangmeny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView appetizerTextView, mainDishesTextView, dessertsTextView;
    Button appetizersButton, mainDishesButton, dessertsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    appetizersButton = findViewById(R.id.appetizers_button);
    mainDishesButton = findViewById(R.id.main_dishes_button);
    dessertsButton = findViewById(R.id.desserts_button);
    appetizerTextView = findViewById(R.id.appetizers_view);
    mainDishesTextView = findViewById(R.id.main_dishes_view);
    dessertsTextView = findViewById(R.id.desserts_view);

        appetizersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView();
            }
        });

    }
}