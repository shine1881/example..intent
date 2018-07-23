package com.example.itsme.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity_b extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        findViewById(R.id.button1).setOnClickListener(activity_b.this);
        findViewById(R.id.button3).setOnClickListener(activity_b.this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
            {
                Intent intent=new Intent(activity_b.this,activity_a.class);
                startActivity(intent);
                break;
            }
            case R.id.button3:
            {
                Intent intent=new Intent(activity_b.this,activity_c.class);
                startActivity(intent);
                break;
            }
            default:break;
        }
    }
}
