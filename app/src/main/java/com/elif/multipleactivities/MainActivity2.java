package com.elif.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.PersonName);
        Intent intent = getIntent();
        String personName =intent.getStringExtra("username");
        textView.setText(personName);

    }

    public void changeActivity2(View view)
    {
        Intent intent =new Intent(MainActivity2.this,MainActivity.class);

        startActivity(intent);


    }
}