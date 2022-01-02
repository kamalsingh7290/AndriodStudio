package com.example.BluetoothConnectivity;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.blue.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    public static final int support_simple_spinner_dropdown_item = 1300091;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=findViewById(R.id.button);
        Button b2=findViewById(R.id.button2);
        Button b3=findViewById(R.id.button3);
        Button b4=findViewById(R.id.button4);
        ListView l=findViewById(R.id.ListView);
        BluetoothAdapter bt=BluetoothAdapter.getDefaultAdapter();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!bt.isEnabled())
                {
                    Intent i=new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                    startActivityForResult(i,0);
                    Toast.makeText(getApplicationContext(), "Bluetooth is turn on", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Already on", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
                startActivityForResult(i2,0);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Set<BluetoothDevice>Pair=bt.getBondedDevices();
                ArrayList<String> a=new ArrayList<String>(Arrays.asList(Pair.toString()));
                for (BluetoothDevice bt:Pair) a.add(bt.getName());
                Toast.makeText(getApplicationContext(), "Showing Paired Device", Toast.LENGTH_SHORT).show();
                ArrayAdapter<String> ad =new ArrayAdapter<String>(getBaseContext(),R.layout.support_simple_spinner_dropdown_item,a);
                 l.setAdapter(ad);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt.disable();
                Toast.makeText(getApplicationContext(), "Turned off", Toast.LENGTH_SHORT).show();
                l.setAdapter(null);
            }
        });
    }
}