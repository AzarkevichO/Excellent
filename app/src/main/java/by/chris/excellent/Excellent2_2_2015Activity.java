package by.chris.excellent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Excellent2_2_2015Activity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button button;

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.excellent2_2_2015);

    //    Toolbar toolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);
    //    setSupportActionBar(toolbar);

    /// кнопка назад
    //    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
     //   getSupportActionBar().setHomeButtonEnabled(true);
     //   getSupportActionBar().setDisplayShowHomeEnabled(true);
      //  getSupportActionBar().setHomeAsUpIndicator(R.drawable.abc_ic_ab_back_mtrl_am_alpha);
    ////


     //   mToolbar = (Toolbar) findViewById(R.id.toolbar);
    //    setSupportActionBar(mToolbar);
    //    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
     //   getSupportActionBar().setDisplayShowHomeEnabled(true);
    //    mToolbar.setNavigationIcon(R.drawable.abc_ic_ab_back_mtrl_am_alpha);
     //   mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
    //        @Override
    //        public void onClick(View v) {
    //            onBackPressed();
     //       }
     //   });
     //   getSupportActionBar().setTitle("Event Details");


        //setTitle("2/2015 август");

        textView = (TextView) findViewById(R.id.textView6);
        textView.setText("Здравствуй, дорогой друг!\n" +
                "Совсем недавно мы получили письмо от Незнайки. Он рассказал о том, что коротышки решили построить ракету, которая смогла бы долететь\n" +
                "до Луны. Незнайке помогать не разрешили —\n" +
                "побоялись, что он будет мешать или что-нибудь\n" +
                "испортит. Но кто же не мечтает поучаствовать\n" +
                "в постройке настоящего космического аппарата?\n" +
                "Незнайка просит тебя о помощи. Ему хочется\n" +
                "доказать другим малышам, что он тоже умный и\n" +
                "сообразительный. Тогда коротышки с радостью\n" +
                "пригласят его строить звездолёт. Для выполнения\n" +
                "этой задачи придётся использовать суперспособности — знания и умения, полученные в школе.");

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) { //обработчик кнопки
        switch (v.getId()) {
            case R.id.button:
                Intent intent = new Intent(this, ex1.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

}
