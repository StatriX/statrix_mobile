package com.example.statrix;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class PrimaryActivity extends AppCompatActivity implements PrimaryCallbackInterface {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
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
        GeneralStatisticsFragment generalStatisticsFragment = new GeneralStatisticsFragment();
        fragmentLoader(generalStatisticsFragment);
        setupDrawer();
        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);
    }

    private void setupDrawer() {
        NavigationView navView = (NavigationView) findViewById(R.id.navigation_view);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                item.setChecked(true);
                switch (item.getItemId()){
                    case R.id.firstMenu:
                        GeneralStatisticsFragment generalStatisticsFragment = new GeneralStatisticsFragment();
                        fragmentLoader(generalStatisticsFragment);
                        break;
                    case R.id.secondMenu:
                        DailyStatisticsFragment dailyStatisticsFragment = new DailyStatisticsFragment();
                        fragmentLoader(dailyStatisticsFragment);
                        break;
                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }
}

