package com.predator.chatapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent intent = getIntent();
        String message = intent.getStringExtra("msg");
        TextView textView = (TextView) findViewById(R.id.msgdisplay);
        textView.setText(message);
    }
    public void sndmsg(View view){
        Intent intent = new Intent(this,MainActivity.class);
        EditText editText = (EditText) findViewById(R.id.msg);
        String message = editText.getText().toString();
        intent.putExtra("msg", message);

        startActivity(intent);
    }
}