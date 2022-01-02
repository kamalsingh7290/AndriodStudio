package com.example.service;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button st,sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        st=(Button) findViewById(R.id.button2);
        sp=(Button) findViewById(R.id.button3);
        st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v==st) {startService(new Intent(MainActivity.this,ServiceClass.class));}
            }
        });
        sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v==sp){stopService(new Intent(MainActivity.this,ServiceClass.class));}
            }
        });
    }
}