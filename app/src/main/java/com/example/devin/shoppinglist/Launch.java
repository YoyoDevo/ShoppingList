package com.example.devin.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Launch extends AppCompatActivity {

    private Button logIn;
    private Button showLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        logIn = (Button)findViewById(R.id.logIn);
        logIn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent sg = new Intent(Launch.this,LoginPage.class);
                startActivity(sg);
            }
        });
        showLists = (Button)findViewById(R.id.showLists);
        showLists.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V) {
                Intent sg = new Intent(Launch.this, ShowLists.class);
                startActivity(sg);
            }
        });
    }
}
