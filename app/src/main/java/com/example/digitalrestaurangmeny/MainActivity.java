package com.example.digitalrestaurangmeny;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView appetizerTextView, mainDishesTextView, dessertsTextView;
    Button appetizersButton, mainDishesButton, dessertsButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout mainLayout = findViewById(R.id.main_linear_layout);
        LayoutInflater inflate = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        ConstraintLayout appetizersLayout = (ConstraintLayout) inflate.inflate(
                R.layout.appetizers_layout, null);
        ConstraintLayout mainDishesLayout = (ConstraintLayout) inflate.inflate(
                R.layout.main_dishes_layout, null);
        ConstraintLayout dessertsLayout = (ConstraintLayout) inflate.inflate(
                R.layout.desserts_layout, null);

        mainLayout.addView(appetizersLayout);
        mainLayout.addView(mainDishesLayout);
        mainLayout.addView(dessertsLayout);

        appetizersButton = findViewById(R.id.appetizers_button);
        mainDishesButton = findViewById(R.id.main_dishes_button);
        dessertsButton = findViewById(R.id.desserts_button);

        appetizersLayout.setVisibility(View.GONE);
        mainDishesLayout.setVisibility(View.GONE);
        dessertsLayout.setVisibility(View.GONE);

        appetizersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appetizersLayout.setVisibility(View.VISIBLE);
                mainDishesLayout.setVisibility(View.GONE);
                dessertsLayout.setVisibility(View.GONE);
            }
        });

        mainDishesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appetizersLayout.setVisibility(View.GONE);
                mainDishesLayout.setVisibility(View.VISIBLE);
                dessertsLayout.setVisibility(View.GONE);
            }
        });

        dessertsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appetizersLayout.setVisibility(View.GONE);
                mainDishesLayout.setVisibility(View.GONE);
                dessertsLayout.setVisibility(View.VISIBLE);
            }
        });
    }
}