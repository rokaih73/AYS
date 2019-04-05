package com.example.ays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MkOrder extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {


TextView txtback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_mk_order);
         txtback=(TextView) findViewById(R.id.txtback);

         txtback.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent b=new Intent(getBaseContext(),WLCM.class);
                 startActivity(b);

             }
         });

                }

    public void showPopUp(View v){
        PopupMenu popup =  new PopupMenu(this, v );
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.pop_menu);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.comp_col_cof:
               Intent i=new Intent(getBaseContext(),comcaf.class);
                startActivity(i);
               // Toast.makeText(this,"computer coffe selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.adm_col_cof:
                Intent ii=new Intent(getBaseContext(),admincaf.class);
                startActivity(ii);
                return true;
            case R.id.sci_col_cof:
                Intent iv=new Intent(getBaseContext(),scicaf.class);
                startActivity(iv);
                return true;
            default:
                return false;
        }  }





}