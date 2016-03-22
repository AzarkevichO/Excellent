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
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
public class exmpls extends AppCompatActivity  {



    EditText editText11,editText12,editText13,editText14,editText15,editText16;

    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exmpls);

        MediaPlayer mediaPlayer;
        mediaPlayer= MediaPlayer.create(this, R.raw.power);
        mediaPlayer.start();
        button1 = (Button) findViewById(R.id.button20);

        TextView textView16 = (TextView)findViewById(R.id.textView16);
        textView16.setText(R.string.exmpls1);
        editText11 = (EditText) findViewById(R.id.editText11);

        final TextView textView17 = (TextView)findViewById(R.id.textView17);
        textView17.setText(R.string.exmpls2);
        editText12 = (EditText) findViewById(R.id.editText12);

        TextView textView18 = (TextView)findViewById(R.id.textView18);
        textView18.setText(R.string.exmpls3);
        editText13 = (EditText) findViewById(R.id.editText13);

        TextView textView19 = (TextView)findViewById(R.id.textView19);
        textView19.setText(R.string.exmpls4);
        editText14 = (EditText) findViewById(R.id.editText16);

        TextView textView20 = (TextView)findViewById(R.id.textView20);
        textView20.setText(R.string.exmpls5);
        editText15 = (EditText) findViewById(R.id.editText14);

        TextView textView21 = (TextView)findViewById(R.id.textView21);
        textView21.setText(R.string.exmpls6);
        editText16 = (EditText) findViewById(R.id.editText15);

        View.OnClickListener buttonOK1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ansex1 = editText11.getText().toString();
               //  Integer answex1 = new Integer(ansex1);

                String ansex2 = editText12.getText().toString();
              //  Integer answex2 = new Integer(ansex2);

                String ansex3 = editText13.getText().toString();
              //  Integer answex3 = new Integer(ansex3);

                String ansex4 = editText14.getText().toString();
              //  Integer answex4 = new Integer(ansex4);

                String ansex5 = editText15.getText().toString();
               // Integer answex5 = new Integer(ansex5);

                String ansex6 = editText16.getText().toString();
              //  Integer answex6 = new Integer(ansex6);


                if (ansex1.equals("40")  & ansex2.equals("40") & ansex3.equals("52") & ansex4.equals("99") & ansex5.equals("31") & ansex6.equals("27")){

                   Intent intent = new Intent(exmpls.this,insertlit.class);
                   startActivity(intent);

                }
                else if (ansex1.isEmpty() | ansex2.isEmpty() | ansex3.isEmpty() | ansex4.isEmpty() | ansex5.isEmpty() | ansex6.isEmpty()){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Пустота", Toast.LENGTH_SHORT);
                    toast.show();
                }
              else{
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Где то ты ошибся дружочек!Подумай еще.", Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        };

        button1.setOnClickListener(buttonOK1);


    }


    @Override
    public void onBackPressed() {
    }


}




