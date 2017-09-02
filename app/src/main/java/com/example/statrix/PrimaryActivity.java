package com.example.statrix;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class PrimaryActivity extends AppCompatActivity implements PrimaryCallbackInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (savedInstanceState == null) {
            LoginFragment loginFragment = new LoginFragment();
            fragmentLoader(loginFragment);
        }
    }


    public void fragmentLoader(Fragment frgmnt) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.primary_fragment_container,frgmnt);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

    @Override
    public void registration() {
        RegistrationFragment registrationFragment = new RegistrationFragment();
        fragmentLoader(registrationFragment);

    }

    @Override
    public void forgetpassword() {
    }

    @Override
    public void entry(@NonNull String login, @NonNull String password) {

    }
}

