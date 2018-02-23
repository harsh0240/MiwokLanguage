package com.example.user.miwok;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Opening Numbers List",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,NumbersActivity.class));
            }
        });

        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Opening Family Members List",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,FamilyActivity.class));
            }
        });

        TextView colors = (TextView) findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Opening Colors List",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,ColorsActivity.class));
            }
        });

        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Opening Phrases List",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,PhrasesActivity.class));
            }
        });
    }

}
