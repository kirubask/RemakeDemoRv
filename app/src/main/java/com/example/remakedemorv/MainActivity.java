package com.example.remakedemorv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView plus_btn = findViewById(R.id.plus_btn);

        plus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,recycler_item_customize.class);
                startActivity(intent);

            }
        });

      list = findViewById(R.id.show_list);
      Intent intent = getIntent();
      String str = intent.getStringExtra("str");
      String des = intent.getStringExtra("d");
      




    }
}