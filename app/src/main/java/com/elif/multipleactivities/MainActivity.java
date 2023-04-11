package com.elif.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String personName;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.editText);

        personName="";

    }

    public void changeActivity(View view)
    {
        //kullanıcının girdiği veriyi aldık eşitledik
        personName = editText.getText().toString();

        Intent intent =new Intent(MainActivity.this,MainActivity2.class);

        intent.putExtra("username",personName);
        startActivity(intent);



    }
}