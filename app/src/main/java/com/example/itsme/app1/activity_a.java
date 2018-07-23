package com.example.itsme.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class activity_a extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        findViewById(R.id.button2).setOnClickListener(activity_a.this);
        findViewById(R.id.button3).setOnClickListener(activity_a.this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button2:
            {
                Intent intent=new Intent(activity_a.this,activity_b.class);
                startActivity(intent);
                break;
            }
            case R.id.button3:
            {
                Intent intent=new Intent(activity_a.this,activity_c.class);
                startActivity(intent);
                break;
            }
            default:break;
        }

    }
}
