package com.example.aysproject;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GoogleAuthProvider;

public class MainActivity extends AppCompatActivity {

    private TabLayout tab1;
    private AppBarLayout bar1;
    private ViewPager vp1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tab1 = (TabLayout) findViewById(R.id.t1);//this is the id of TabLayout from mainActivity axl file
        bar1 = (AppBarLayout) findViewById(R.id.bb1);
        vp1 = (ViewPager) findViewById(R.id.p1);
        //this code is for adding fragment
        ViewPageAdapter adapter = new ViewPageAdapter(getSupportFragmentManager());
        adapter.AddFragment(new fragmentMakeOrder(), "Make Order");
        adapter.AddFragment(new FragmentMyAccount(), "My Account");
        adapter.AddFragment(new fragmentMyCart(), "MY Cart");

        //adapter setup
        vp1.setAdapter(adapter);
       tab1.setupWithViewPager(vp1);



    }

}
