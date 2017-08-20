package com.example.statrix;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class PrimaryActivity extends AppCompatActivity implements PrimaryCallbackInterface {

    private final String TAG_REGISTRATION = "REGISTRATION";
    private final String TAG_FORGET_PASSWORD = "FORGET_PASSWORD";
    private final String TAG_ENTRY = "ENTRY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        LoginFragment loginFragment = new LoginFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.primary_fragment_container, loginFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void chooser(String action) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        switch (action) {
            case TAG_ENTRY:
                break;
            case TAG_FORGET_PASSWORD:
                break;
            case TAG_REGISTRATION:
//                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//                getSupportActionBar().setTitle(R.string.reg_frgmnt_toolbar_title);
                RegistrationFragment registrationFragment = new RegistrationFragment();
                fragmentTransaction.replace(R.id.primary_fragment_container, registrationFragment);
                break;
            default:
                break;
        }
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }
}

