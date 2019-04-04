package com.example.aysproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class fragmentMakeOrder extends Fragment  {
    View view1 ;
    Button btn1;
    Menu mymenu;



    public fragmentMakeOrder() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view1 = inflater.inflate(R.layout.mkeorfer_fragment, container, false);
        btn1=(Button)view1.findViewById(R.id.btn1);
        return view1;


    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);

        btn1 = (Button)view1.findViewById(R.id.signout1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onOptionsItemSelected();
            }
        });
    }


   @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.pop_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.item1:
                createToastMessage("Selected item 1");
                break;
            case R.id.item2:
                createToastMessage("Selected item 2");
                break;
            case R.id.item3:
                createToastMessage("Selected item 3");
                break;
        }
        return true;
    }

    private void createToastMessage(String message){
        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    }



}