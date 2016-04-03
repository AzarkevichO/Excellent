package by.chris.excellent;

import android.app.DialogFragment;
import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.app.Fragment;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.VideoView;

import by.chris.excellent.fragments.DialogFragment4;
import by.chris.excellent.fragments.Fragment_aug_2_2015_1;
import by.chris.excellent.fragments.dialogFragment6;

public class August2_2015 extends AppCompatActivity {

    Fragment_aug_2_2015_1 fr1;
    private FragmentManager manager;
    private FragmentTransaction transaction;
    Button button;
    VideoView videoView;
    NumberPicker np;
    Integer val;

    DialogFragment dialogFragment4;
    DialogFragment dialogFragment6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.august2_2015);


        fr1 = new Fragment_aug_2_2015_1();
        button = (Button) findViewById(R.id.button);
        manager = getSupportFragmentManager();
        np = (NumberPicker) findViewById(R.id.numberPicker);
    
        dialogFragment4 = new DialogFragment4();
        dialogFragment6 = new dialogFragment6();


     /*   android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("август 2015");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);*/


        videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.movie1));
        //videoView.setMediaController(new MediaController(this));
        videoView.requestFocus();
        videoView.start();





    }



 /* @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent intent = new Intent(this, MenuActivity.class);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }
    }*/




    public void onClickFragment(View view){
        transaction = manager.beginTransaction();
        switch (view.getId() ) {
            case  R.id.button:
                button.setVisibility(View.GONE);
                videoView.setVisibility(View.GONE);
                transaction.add(R.id.container_2class, fr1);
                break;
        }
        transaction.commit();
    }
}

