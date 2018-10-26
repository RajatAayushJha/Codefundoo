package com.example.rjgen.dummy;

import android.content.Intent;
import android.provider.ContactsContract;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button Flooded_areas;
    private  Button shelter;
    private TextView num;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Flooded_areas=(Button)findViewById(R.id.button);
        shelter=(Button)findViewById(R.id.button2);
        num=(TextView)findViewById(R.id.editText2);
        title=(TextView)findViewById(R.id.editText);
        title.setText("Austin Rescue Flood");

        shelter.setOnClickListener(new View.OnClickListener(){
            public void Onclick(View view){
                Intent intent =new Intent(MainActivity.this,ShelterMapActivity.this);
            }
        });
        Flooded_areas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,Flooded_areasMapActivity.this);
            }
        });



    }
}
