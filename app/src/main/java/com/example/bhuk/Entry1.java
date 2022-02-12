package com.example.bhuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class Entry1 extends AppCompatActivity {
    TextView donate, receive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry1);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        donate = findViewById(R.id.donateid);
        receive = findViewById(R.id.receiveid);

        donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Entry1.this,Entry2.class);
                i.putExtra("donate",1);
                i.putExtra("receive", 0);
                startActivity(i);
            }
        });

        receive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Entry1.this,Entry2.class);
                i.putExtra("donate",0);
                i.putExtra("receive", 1);
                startActivity(i);
            }
        });
    }
}