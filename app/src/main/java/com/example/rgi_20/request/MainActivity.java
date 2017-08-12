package com.example.rgi_20.request;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.tostral.Tostral;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tostral.success(MainActivity.this,"ncksack", Toast.LENGTH_SHORT,true).show();

    }
}
