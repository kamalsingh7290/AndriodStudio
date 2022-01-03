package com.example.modernlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String title[]={
            "Aman Sir NIIT","Arun Sir AVS institution","Ankit Gupta","Kuldeep Nagar","Booby Bhai",
            "Muskesh Chacha","Deepak Sir","Durgesh","Siddharth","Satender Akki Rawat",
            "Gourav bisht","kamalnain Sir NIIT","Lalit Bisht","Sunidhi","Ravinder Sir","Ritesh Niit",
            "Sanskar"
    };

    String description[]={
          "Software Developer and Trainee","Physics Teacher at Bloom International","Owner of Ankit Electricals","My friend since scholling"
            ,"Drinking partner","Owner of Mukesh optical","Teacher at Krazy Institute","Friend at NIIT","Fried at my Place",
            "Friend at my local","Friend at my place","Teacher at NIIT ","Friend at my local","Class Mate at NIIT","Teacher of C# and .Net",
            "Friend at NIIT","NIIT Friend"
    };
    Integer imgs[]={
            R.drawable.aman,R.drawable.avs,R.drawable.gupta,R.drawable.kuldeep,
            R.drawable.booby,R.drawable.chacha,R.drawable.deepak,R.drawable.durgesh,R.drawable.gollu,
            R.drawable.golu,R.drawable.gourav,R.drawable.kamlsir,R.drawable.lalit,R.drawable.nidhi,
            R.drawable.ravinder,R.drawable.ritesh,R.drawable.sanskar
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =findViewById(R.id.listView);
        Adaptery adapter=new Adaptery(this,title,description,imgs);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "This is at "+position+" position",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

}