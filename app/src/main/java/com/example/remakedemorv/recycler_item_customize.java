package com.example.remakedemorv;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class recycler_item_customize extends AppCompatActivity {
    ImageView imageGallery;
    EditText userTxt;
    EditText descrptionText;
    Button addbtn;
    ArrayList<String> list = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_item_customize);

        imageGallery = findViewById(R.id.image_view);
        userTxt = findViewById(R.id.user_name);
        descrptionText = findViewById(R.id.desription_view);
        addbtn = findViewById(R.id.add_btn);

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getInput = descrptionText.getText().toString();
                if (list.contains(getInput)){
                    Toast.makeText(recycler_item_customize.this, "item already added to the list", Toast.LENGTH_SHORT).show();
                }
                else if (getInput == null || getInput.trim().equals("")){
                    Toast.makeText(recycler_item_customize.this, "input field is empty", Toast.LENGTH_SHORT).show();
                }
                else {
//                    list.add(getInput);
//
//                //                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(recycler_item_customize.this,
//                    Intent i = new Intent(recycler_item_customize.this,MainActivity.class);

                        String str = userTxt.getText().toString();
                        String des = descrptionText.getText().toString();
                        Intent intent = new Intent(recycler_item_customize.this,MainActivity.class);
                        intent.putExtra("name",str);
                        intent.putExtra("d",des);




                }

            }
        });


    }
}