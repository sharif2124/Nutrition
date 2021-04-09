package com.example.nutrition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    private Button carbohydrate,protien,fat,vitamin,water;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carbohydrate=(Button) findViewById(R.id.carbohydratesid);
        protien=(Button)findViewById(R.id.protienid);
        fat=(Button)findViewById(R.id.fatsid);
        vitamin=(Button)findViewById(R.id.vitaminsid);
        water=(Button) findViewById(R.id.waterid);

        carbohydrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,carbohydrateActivity.class);
                startActivity(intent);
            }
        }) ;
        protien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,protienActivity.class);
                startActivity(intent);
            }
        }) ;
        fat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,fatActivity.class);
                startActivity(intent);
            }
        });
        vitamin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,vitaminActivity.class);
                startActivity(intent);
            }
        });
        water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,waterActivity.class);
                startActivity(intent);
            }
        });
    }

}
