package com.example.vaksinasischedule;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void Register(View v) {
        setContentView(R.layout.register);
    }

    public void Balik(View v) {
        setContentView(R.layout.login);
    }
}