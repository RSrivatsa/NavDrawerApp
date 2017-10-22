package com.example.srivatsaramesh.navdrawer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class UnderINR10 extends AppCompatActivity {
 TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_under_inr10);
        t=(TextView)findViewById(R.id.textView3);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(UnderINR10.this, K6Specs.class);
                startActivity(i);
            }
        });



    }
}
