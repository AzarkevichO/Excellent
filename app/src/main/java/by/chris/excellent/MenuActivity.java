package by.chris.excellent;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import by.chris.excellent.fragments.Setting;

import by.chris.excellent.fragments.Fragment_2class;
import by.chris.excellent.fragments.Fragment_3class;
import by.chris.excellent.fragments.Fragment_4class;

import static by.chris.excellent.R.id.container;

public class MenuActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Fragment_2class f2class;
    Fragment_3class f3class;
    Fragment_4class f4class;
    Setting setting;
    public TextView name;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        f2class = new Fragment_2class();
        f3class = new Fragment_3class();
        f4class = new Fragment_4class();
        setting = new Setting();



        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
        //       Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        //                .setAction("Action", null).show();
        //    }
        //});

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // установка имени в меню.
        name = (TextView) findViewById(R.id.Name);
        Intent intent = getIntent();
        String namek = intent.getStringExtra("name");
        String polk = intent.getStringExtra("pol");
        name.setText(namek);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
     //   String pol = new String(polk);



        ////
        //if(pol.equals( "Девочка")){
        //    imageView.setImageResource(R.drawable.girl);
        //}
        //else if(pol.equals("Мальчик")){
        //    imageView.setImageResource(R.drawable.boy);
        //}
        //////////////////////////////////////////

        getMenuInflater().inflate(R.menu.menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.


        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
  //      if (id == R.id.action_settings) {
   //         return true;
    //    }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        if (id == R.id.nav_2class) {
            transaction.replace(container, f2class);
        } else if (id == R.id.nav_3class) {
            transaction.replace(container, f3class);
        } else if (id == R.id.nav_4class) {
            transaction.replace(container, f4class);
        } else if (id == R.id.nav_manage) {
            transaction.replace(container, setting);
        }  else if (id == R.id.nav_send) {

        } transaction.commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



}



