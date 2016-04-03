package by.chris.excellent;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import by.chris.excellent.fragments.Cheburashka1;
import by.chris.excellent.fragments.Cheburashka2;
import by.chris.excellent.fragments.DialogFragment4;
import by.chris.excellent.fragments.dialogFragment6;
import by.chris.excellent.fragments.zadcheb2;
import by.chris.excellent.fragments.zadcheb3;
import by.chris.excellent.fragments.zadcheb4;
import android.widget.VideoView;
import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
public class Cheburashka extends AppCompatActivity {

    Cheburashka1 cheburashka1;
    Cheburashka2 cheburashka2;
    zadcheb2 zadcheb2;
    zadcheb3 zadcheb3;
    zadcheb4 zadcheb4;
    DialogFragment dialogFragment4;
    DialogFragment dialogFragment6;

    VideoView videoView;

    private FragmentManager manager;
    private FragmentTransaction transaction;

    Button btn29;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    //    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.cheburashka);
     manager = getSupportFragmentManager();

        cheburashka1 = new Cheburashka1();
        cheburashka2 = new Cheburashka2();
        dialogFragment4 = new DialogFragment4();
        dialogFragment6 = new dialogFragment6();
        zadcheb2 = new zadcheb2();
        zadcheb3 = new zadcheb3();
        zadcheb4 = new zadcheb4();
        btn29 = (Button) findViewById(R.id.button29);

        videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/"+R.raw.vid1));
        videoView.requestFocus();
        videoView.start();
    }

  public void onClickFragment(View view){
        transaction = manager.beginTransaction();
switch (view.getId() ) {

    case  R.id.button29:
        videoView.setVisibility(View.GONE);
        btn29.setVisibility(View.GONE);
        transaction.add(R.id.container, zadcheb2);
        break;
    
    case  R.id.button33:
        videoView.setVisibility(View.GONE);
        btn29.setVisibility(View.GONE);
        transaction.replace(R.id.container, zadcheb3);
        break;

}
        transaction.commit();
    }



    }
