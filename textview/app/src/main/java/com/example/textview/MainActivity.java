package com.example.textview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        ArrayList<String> a=new ArrayList<>();
        float ist,sec;
        boolean eadd,esub,ediv,emul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
        Button b1=findViewById(R.id.button1);
        Button b2=findViewById(R.id.button2);
        Button b3=findViewById(R.id.button3);
        Button b4=findViewById(R.id.button4);
        Button b5=findViewById(R.id.button5);
        Button b6=findViewById(R.id.button6);
        Button b7=findViewById(R.id.button7);
        Button b8=findViewById(R.id.button8);
        Button b9=findViewById(R.id.button9);
        Button b10=findViewById(R.id.button10);
        Button clicks=findViewById(R.id.button15);
        Button reset=findViewById(R.id.resetbutton);
        EditText e=findViewById(R.id.Screen);
        Button add=findViewById(R.id.button12);
        Button sub=findViewById(R.id.button11);
        Button mul=findViewById(R.id.button13);
        Button div=findViewById(R.id.button14);
        Button rem=findViewById(R.id.remove);
        Button d=findViewById(R.id.dot);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setText(e.getText()+".");
            }
        });
        rem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                a.add("1");
//                e.setText("1 is entered into stack!");
                e.setText(e.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                a.add("2");
//                e.setText("2 is entered into stack!");
                e.setText(e.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                a.add("3");
//                e.setText("3 is entered into stack!");
                e.setText(e.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                a.add("4");
//                e.setText("4 is entered into stack!");
                e.setText(e.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                a.add("5");
//                e.setText("5 is entered into stack!");
                e.setText(e.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                a.add("6");
//                e.setText("6 is entered into stack!");
                e.setText(e.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                a.add("7");
//                e.setText("7 is entered into stack!");
                e.setText(e.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                a.add("8");
//                e.setText("8 is entered into stack!");
                e.setText(e.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                a.add("9");
//                e.setText("9 is entered into stack!");
                e.setText(e.getText()+"9");
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                a.add("0");
//                e.setText("0 is entered into stack!");
                e.setText(e.getText()+"0");
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                a.clear();
                e.setText(null);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e.getText().toString().isEmpty())
                {
                    e.setText("");
                }
                else {
                    ist = Float.parseFloat(e.getText() + "");
                    eadd = true;
                    e.setText(null);
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e.getText().toString().isEmpty())
                {
                    e.setText("");
                }
                else {
                    ist = Float.parseFloat(e.getText() + "");
                    esub = true;
                    e.setText(null);
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e.getText().toString().isEmpty())
                {
                    e.setText("");
                }
                else {
                    ist = Float.parseFloat(e.getText() + "");
                    emul = true;
                    e.setText(null);
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e.getText().toString().isEmpty())
                {
                    e.setText("");
                }
                else {
                    ist = Float.parseFloat(e.getText() + "");
                    ediv = true;
                    e.setText(null);
                }
            }
        });
        clicks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e.getText().toString().isEmpty()) {
                    e.setText("");
                } else {
                    sec = Float.parseFloat(e.getText() + "");
                    if (eadd == true) {
                        e.setText(ist + sec + "");
                        eadd = false;
                    }
                    if (esub == true) {
                        e.setText(ist - sec + "");
                        esub = false;
                    }
                    if (emul == true) {
                        e.setText(ist * sec + "");
                        emul = false;
                    }
                    if (ediv == true) {
                        e.setText(ist / sec + "");
                        ediv = false;
                    }
                }
            }
        });
    }
}