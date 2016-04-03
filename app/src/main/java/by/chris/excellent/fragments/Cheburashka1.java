package by.chris.excellent.fragments;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import by.chris.excellent.R;
import by.chris.excellent.fragments.Cheburashka2;
import android.widget.VideoView;
import android.net.Uri;
import android.content.pm.ActivityInfo;
public class Cheburashka1 extends Fragment {

    private Cheburashka2 cheburashka2;
     VideoView videoView;
     public  MediaPlayer mediaPlayer;
    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
    //    cheburashka2 = new Cheburashka2();

        View view = inflater.inflate(R.layout.cheburashka1,  container, false);

      /*  mediaPlayer= MediaPlayer.create(view.getContext(), R.raw.power);
        mediaPlayer.start();*/
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
return view;
         }

    private void setRequestedOrientation(int screenOrientationLandscape) {

    }

  /*  public void onClickFragment(View view){
        fragmentManager = getFragmentManager();
        transaction = fragmentManager.beginTransaction();
        switch (view.getId() ) {
            case  R.id.button30:
                       cheburashka1 = new Cheburashka1();
cheburashka1.mediaPlayer.setVolume(0f,0f);
                break;
        }
        transaction.commit();
    }
*/

}
