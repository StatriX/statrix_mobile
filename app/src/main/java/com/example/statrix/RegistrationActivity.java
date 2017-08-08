package com.example.statrix;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.mikepenz.iconics.typeface.FontAwesome;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.SectionDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

public class RegistrationActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        new Drawer()
                .withActivity(this)
                .withToolbar(toolbar)
                .withActionBarDrawerToggle(true)
                .withHeader(R.layout.drawer_header)
                .addDrawerItems(
                        new PrimaryDrawerItem().withName(R.string.drawer_item_general_statistics).withIdentifier(1),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_everyday_statistics).withIdentifier(2),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_administration).withIdentifier(3),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_products).withIdentifier(4),
                        new DividerDrawerItem(),
                        new SecondaryDrawerItem().withName(R.string.drawer_item_help).withIdentifier(5)
                )
                /*.addDrawerItems(
                        new PrimaryDrawerItem().withName(R.string.drawer_item_general_statistics).withIcon(FontAwesome.Icon.faw_home).withIdentifier(1),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_everyday_statistics).withIcon(FontAwesome.Icon.faw_gamepad),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_administration).withIcon(FontAwesome.Icon.faw_eye).withIdentifier(2),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_products).withIcon(FontAwesome.Icon.faw_gamepad),
                        new DividerDrawerItem(),
                        new SecondaryDrawerItem().withName(R.string.drawer_item_help).withIcon(FontAwesome.Icon.faw_github).withIdentifier(1)
                )*/
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id, IDrawerItem drawerItem) {
                        switch (drawerItem.getIdentifier()){
                            case 1:
                                Intent intent = new Intent(view.getContext(), GeneralStatistics.class);
                                startActivity(intent);
                                break;
                            /*case 2:
                                Intent intent1 = new Intent(view.getContext(), EveryDayStatistics.class);
                                startActivity(intent1);
                                break;
                            case 3:
                                Intent intent2 = new Intent(view.getContext(), Admin.class);
                                startActivity(intent2);
                                break;
                            case 4:
                                Intent intent3 = new Intent(view.getContext(), BuyProduct.class);
                                startActivity(intent3);
                                break;
                            case 5:
                                Intent intent4 = new Intent(view.getContext(), FeedBack.class);
                                startActivity(intent4);
                                break;*/
                        }
                    }
                });

    }
}

