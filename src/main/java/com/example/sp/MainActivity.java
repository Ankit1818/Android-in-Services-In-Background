package com.example.sp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button start,stop,next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start=findViewById(R.id.start);
        stop=findViewById(R.id.stop);
        next=findViewById(R.id.next);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);
        next.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.start:
            Intent i=new Intent(MainActivity.this,Myservices.class);
            startService(i);
            break;

            case R.id.stop:
                Intent intent=new Intent(MainActivity.this,Myservices.class);
                stopService(intent);
                break;

            case  R.id.next:
                Intent iii=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(iii);
                break;
        }

    }
}
