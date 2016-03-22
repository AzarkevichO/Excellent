package by.chris.excellent;


import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.CountDownTimer;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Window;
import android.widget.TextView;

public class LoginDoneActivity extends Activity implements SoundPool.OnLoadCompleteListener {

    final int MAX_STREAMS = 5;

    SoundPool sp;
    int soundIdShot;
    int soundIdExplosion;


    private TextView mTimer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        SystemClock.sleep(4000);
        setContentView(R.layout.login_done);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        mTimer = (TextView) findViewById(R.id.tv);
       // textView = (TextView) findViewById(R.id.textView);

        CountDownTimer start = new CountDownTimer(4000, 1000) {

            Intent intent1 = getIntent();
            String name = intent1.getStringExtra("name");
            String pol = intent1.getStringExtra("pol");


    public void onTick(long millisUntilFinished) {
                mTimer.setText(name + ",вот мы с тобой и познакомились. А теперь, время приключени! "
                       );
            }


            public void onFinish() {
                Intent intent = new Intent(LoginDoneActivity.this, MenuActivity.class);
                intent.putExtra("name",name);
                intent.putExtra("pol",pol);
                startActivity(intent);
            }
        } .start();


        sp = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        sp.setOnLoadCompleteListener(this);

        soundIdShot = sp.load(this, R.raw.power, 1);


    }


    @Override
    public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
        sp.play(soundIdShot, 1, 1, 0, 0, 1);//запускается воспроизведения,(id-файла,громкость левого и правого каналаа,приоритет,кол-во повторов
        sp.play(soundIdExplosion, 1, 1, 0, 0, 1);

    }


    @Override
    public void onBackPressed() {
    }
}