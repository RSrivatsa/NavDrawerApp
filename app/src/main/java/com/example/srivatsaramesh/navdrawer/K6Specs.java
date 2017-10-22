package com.example.srivatsaramesh.navdrawer;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class K6Specs extends AppCompatActivity {
    TextView textView;
    Button b;
    Button rb;
    RatingBar r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k6_specs);
        textView = (TextView) findViewById(R.id.textView4);
        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://fkrt.it/hADQnTuuuN");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }

        });
        r=(RatingBar)findViewById(R.id.ratingBar);
        rb=(Button)findViewById(R.id.button2);
        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Snackbar snackbar = Snackbar.make(view,"You Rated it " + r.getRating()+" ", Toast.LENGTH_SHORT);
                snackbar.show();
            }
        });
    }
}
