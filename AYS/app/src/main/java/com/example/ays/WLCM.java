package com.example.ays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WLCM extends AppCompatActivity {

    Button btncart ,btnorder , btnacc;
    TextView wlcmsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wlcm);

        btnacc = (Button) findViewById(R.id.btnacc);
        btncart = (Button) findViewById(R.id.btncart);
        btnorder =(Button) findViewById(R.id.btnorder);
        wlcmsg = (TextView) findViewById(R.id.wlcmsg);


      btncart.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i=new Intent(getBaseContext(),CRT.class);
        startActivity(i);
    }});
      btnorder.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i=new Intent(getBaseContext(),MkOrder.class);
              startActivity(i);
          }
      });
        btnacc.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i=new Intent(getBaseContext(),Acnt.class);
        startActivity(i);
    }
       });

    }





}
