package com.example.bhuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Entry2 extends AppCompatActivity {
    LinearLayout donordetailsform, receiverdetailsform;
    TextView heyxyz, nextbutton;
    int donate, receive;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry2);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        heyxyz = findViewById(R.id.heydonor);
        donordetailsform = findViewById(R.id.donor_detailsform);
        receiverdetailsform = findViewById(R.id.receiver_detailsform);
        nextbutton = findViewById(R.id.nextbtn);

        Intent i = getIntent();
        donate = i.getIntExtra("donate", 0);
        receive = i.getIntExtra("receive", 0);

        if(donate == 1 && receive == 0)
        {
            heyxyz.setVisibility(View.VISIBLE);
            heyxyz.setText("Hey Donor");
            donordetailsform.setVisibility(View.VISIBLE);
            receiverdetailsform.setVisibility(View.GONE);
        }
        else if (donate == 0 && receive == 1)
        {
            donordetailsform.setVisibility(View.GONE);
            heyxyz.setVisibility(View.VISIBLE);
            heyxyz.setText("Hey Receiver");
            receiverdetailsform.setVisibility(View.VISIBLE);
        }

        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Entry2.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}