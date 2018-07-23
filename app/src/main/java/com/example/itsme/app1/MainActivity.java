package com.example.itsme.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private  final String TAG = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button1).setOnClickListener(MainActivity.this);
        findViewById(R.id.button2).setOnClickListener(MainActivity.this);
        findViewById(R.id.button3).setOnClickListener(MainActivity.this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1: {
                Intent intent = new Intent(MainActivity.this, activity_a.class);
                startActivity(intent);
                Log.d(TAG, "onClick: a");
                break;
            }
            case R.id.button2: {
                Intent intent = new Intent(MainActivity.this, activity_b.class);
                startActivity(intent);
                Log.d(TAG, "onClick: b");
                break;
            }
            case R.id.button3: {
                Intent intent = new Intent(MainActivity.this, activity_c.class);
                startActivity(intent);
                Log.d(TAG, "onClick: c");
                break;
            }
            default:break;
        }
    }
}
