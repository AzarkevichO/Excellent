package by.chris.excellent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.content.pm.ActivityInfo;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.CountDownTimer;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Window;
public class map extends AppCompatActivity implements SoundPool.OnLoadCompleteListener {

TextView textView1,textView2;

EditText editText1,editText2,editText3,editText4,editText5,editText6,editText7,editText8,editText9,editText10;

Button button;
    final int MAX_STREAMS = 5;

    SoundPool sp;
    int soundIdShot;
    int soundIdExplosion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.map);

        CountDownTimer start = new CountDownTimer(4000, 1000) {


            public void onTick(long millisUntilFinished) {
                button = (Button) findViewById(R.id.button19);
                TextView textView1 = (TextView) findViewById(R.id.textView6);
                textView1.setText(R.string.map1);
                editText1 = (EditText) findViewById(R.id.editText1);

                TextView textView2 = (TextView) findViewById(R.id.textView7);
                textView2.setText(R.string.map2);
                editText2 = (EditText) findViewById(R.id.editText2);

                TextView textView3 = (TextView) findViewById(R.id.textView8);
                textView3.setText(R.string.map3);
                editText3 = (EditText) findViewById(R.id.editText3);

                TextView textView4 = (TextView) findViewById(R.id.textView9);
                textView4.setText(R.string.map4);
                editText4 = (EditText) findViewById(R.id.editText4);

                TextView textView5 = (TextView) findViewById(R.id.textView10);
                textView5.setText(R.string.map5);
                editText5 = (EditText) findViewById(R.id.editText5);

                TextView textView6 = (TextView) findViewById(R.id.textView11);
                textView6.setText(R.string.map6);
                editText6 = (EditText) findViewById(R.id.editText6);

                TextView textView7 = (TextView) findViewById(R.id.textView12);
                textView7.setText(R.string.map7);
                editText7 = (EditText) findViewById(R.id.editText7);

                TextView textView8 = (TextView) findViewById(R.id.textView13);
                textView8.setText(R.string.map8);
                editText8 = (EditText) findViewById(R.id.editText8);

                TextView textView9 = (TextView) findViewById(R.id.textView14);
                textView9.setText(R.string.map9);
                editText9 = (EditText) findViewById(R.id.editText9);

                TextView textView10 = (TextView) findViewById(R.id.textView15);
                textView10.setText(R.string.map10);
                editText10 = (EditText) findViewById(R.id.editText10);

            }

            public void onFinish() {

                View.OnClickListener buttonOK = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String ans1 = editText1.getText().toString();
                        //   Integer answ1 = new Integer(ans1);

                        String ans2 = editText2.getText().toString();
                        //   Integer answ2 = new Integer(ans2);

                        String ans3 = editText3.getText().toString();
                        //   Integer answ3 = new Integer(ans3);

                        String ans4 = editText4.getText().toString();
                        //  Integer answ4 = new Integer(ans4);

                        String ans5 = editText5.getText().toString();
                        //  Integer answ5 = new Integer(ans5);

                        String ans6 = editText6.getText().toString();
                        // Integer answ6 = new Integer(ans6);

                        String ans7 = editText7.getText().toString();
                        // Integer answ7 = new Integer(ans7);

                        String ans8 = editText8.getText().toString();
                        //  Integer answ8 = new Integer(ans8);

                        String ans9 = editText9.getText().toString();
                        //   Integer answ9 = new Integer(ans9);

                        String ans10 = editText10.getText().toString();
                        //  Integer answ10 = new Integer(ans10);


                        if (ans1.equals("2") & ans2.equals("4") & ans3.equals("6") & ans4.equals("5") & ans5.equals("1") & ans6.equals("3") & ans7.equals("8")
                                & ans8.equals("7") & ans9.equals("9") & ans10.equals("10")) {

                            Intent intent = new Intent(map.this, exmpls.class);
                            startActivity(intent);

                        } else if (ans1.isEmpty() | ans2.isEmpty() | ans3.isEmpty() | ans4.isEmpty() | ans5.isEmpty() | ans6.isEmpty() | ans7.isEmpty()
                                | ans8.isEmpty() | ans9.isEmpty() | ans10.isEmpty()) {
                            Toast toast = Toast.makeText(getApplicationContext(),
                                    "Пустота", Toast.LENGTH_SHORT);
                            toast.show();
                        } else {
                            Toast toast = Toast.makeText(getApplicationContext(),
                                    "Где то ты ошибся дружочек!Подумай еще.", Toast.LENGTH_SHORT);
                            toast.show();
                        }

                    }

                };


                button.setOnClickListener(buttonOK);
            }
        }.start();
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




