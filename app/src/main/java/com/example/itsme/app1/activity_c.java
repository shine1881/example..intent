package com.example.itsme.app1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class activity_c extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        findViewById(R.id.button1).setOnClickListener(activity_c.this);
        findViewById(R.id.button2).setOnClickListener(activity_c.this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
            {
                Intent intent=new Intent(activity_c.this,activity_a.class);
                startActivity(intent);
                break;
            }
            case R.id.button2:
            {
                Intent intent=new Intent(activity_c.this,activity_b.class);
                startActivity(intent);
                break;
            }
            default:break;
        }

    }
}
