package by.chris.excellent;

import android.app.DialogFragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.format.Time;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URI;

import by.chris.excellent.fragments.nav_manage;
import by.chris.excellent.fragments.Fragment_2class;
import by.chris.excellent.fragments.Fragment_3class;
import by.chris.excellent.fragments.Fragment_4class;
import static by.chris.excellent.R.id.container;
import static by.chris.excellent.R.id.imageView;

import by.chris.excellent.fragments.DialogFragment1;
import by.chris.excellent.fragments.DialogFragment2;
import by.chris.excellent.fragments.DialogFragment3;


public class MenuActivity extends AppCompatActivity
     implements NavigationView.OnNavigationItemSelectedListener {

    Fragment_2class f2class;
    Fragment_3class f3class;
    Fragment_4class f4class;
    nav_manage nav_manage;

    EmailValidator emailValidator;

    public TextView name;
    public TextView namee;
    public EditText edt48;
    public ImageView imageView;
    ImageView   imageViewty;
    Button button28;
    Bitmap bu;

   public Context context;
    File file;

    public String namek;
    String  pol;
    String polk;
    String  nameel;
    String email;
    String savedpic = null;

    public Intent intentcam;

    DialogFragment dialogFragment1;
    DialogFragment dialogFragment2;
    DialogFragment dialogFragment3;



    String folderToSave = Environment.getExternalStorageDirectory().toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        f2class = new Fragment_2class();
        f3class = new Fragment_3class();
        f4class = new Fragment_4class();
        nav_manage = new nav_manage();
        file = new File(folderToSave,"Avat.jpg");
        emailValidator = new EmailValidator();
        imageViewty = (ImageView)findViewById(R.id.imageView15);
        dialogFragment1 = new DialogFragment1();
        dialogFragment2 = new DialogFragment2();
        dialogFragment3 = new DialogFragment3();

        button28 = (Button) findViewById(R.id.button28);

            Intent intent = getIntent();
            namek = intent.getStringExtra("name");
            polk = intent.getStringExtra("pol");
//            pol = new String(polk);

        intentcam = getIntent();
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
      /*  name = (TextView) findViewById(R.id.Name);
        name.setText(namek);*/
       imageView = (ImageView) findViewById(R.id.imageView17);

/*if(savedpic.equals("dac")) {
    if (pol.equals("Девочка")) {
        imageView.setImageResource(R.drawable.girl);
    } else if (pol.equals("Мальчик")) {
        imageView.setImageResource(R.drawable.boy);
    }

}*/
   imageView.setImageURI(Uri.fromFile(file));
    getMenuInflater().inflate(R.menu.menu, menu);
        return true;

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
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
            transaction.replace(container, nav_manage);
        }
        else if (id == R.id.nav_send) {
        } transaction.commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public String SavePicture(Bitmap bu,String folderToSave)
    {
        OutputStream fOut = null;
        try {
            fOut = new FileOutputStream(file);


            bu.compress(Bitmap.CompressFormat.JPEG, 40, fOut);
            fOut.flush();
            fOut.close();
         MediaStore.Images.Media.insertImage(getContentResolver(), file.getAbsolutePath(), file.getName(),  file.getName()); // регистрация в фотоальбоме

        }
        catch (Exception e)
        {
            return e.getMessage();
        }
        return "";
    }
  public void onClickFrag(View view) throws FileNotFoundException {

      switch (view.getId()) {
          case R.id.button28:
              namee = (TextView) findViewById(R.id.Name);
              edt48 = (EditText) findViewById(R.id.editText48);
              nameel = edt48.getText().toString();
              namee.setText(nameel);
              dialogFragment3.show(getFragmentManager(), "dialogFragment3");
              break;
          case R.id.button30:
              EditText edt49 = (EditText) findViewById(R.id.editText49);
              email = edt49.getText().toString();
              boolean valid = emailValidator.validate(email);
              if (valid == false) {
                  dialogFragment1.show(getFragmentManager(), "dialogFragment1");
              } else {
                  dialogFragment2.show(getFragmentManager(), "dialogFragment2");

              }
          break;
        case R.id.button34:
          ImageView img17 = (ImageView) findViewById(R.id.imageView17);
              bu = nav_manage.getBitmap();
              img17.setImageBitmap(bu);
              SavePicture(bu, folderToSave);

          break;
      }
    }

}
