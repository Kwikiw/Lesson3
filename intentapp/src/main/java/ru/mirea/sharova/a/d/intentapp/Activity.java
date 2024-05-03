package ru.mirea.sharova.a.d.intentapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

        Intent intent = getIntent();
        String string = intent.getStringExtra("message");

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Квадрат значения моего номера по списку в группе составляет 676, а текущее время " + string);
    }
}
