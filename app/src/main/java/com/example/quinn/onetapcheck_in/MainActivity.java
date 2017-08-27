package com.example.quinn.onetapcheck_in;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Push
    }

    //Direct me to the Events activity
        public void loginButton(View view) {

            Intent i = new Intent(this, Events.class);
            startActivity(i);
        }



}
