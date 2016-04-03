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
import android.view.LayoutInflater;
import android.support.v7.app.AppCompatActivity;
public class exmpls extends AppCompatActivity implements View.OnClickListener  {



    EditText editText11,editText12,editText13,editText14,editText15,editText16;

    Button button20, but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exmpls);
        iniComponent();
        MediaPlayer mediaPlayer;
        mediaPlayer= MediaPlayer.create(this, R.raw.power);
        mediaPlayer.start();
    //  button1 = (Button) findViewById(R.id.button20);

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
    /*    Intent intent = new Intent(exmpls.this,segment.class);
        startActivity(intent);
View.OnClickListener buttonOK1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };

        button1.setOnClickListener(buttonOK1);*/

    }





    private void iniComponent()
    {
        button20 = (Button) findViewById(R.id.button20);
        button20.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id. button20:
              String ansex1 = editText11.getText().toString();

                String ansex2 = editText12.getText().toString();

                String ansex3 = editText13.getText().toString();

                String ansex4 = editText14.getText().toString();

                String ansex5 = editText15.getText().toString();

                String ansex6 = editText16.getText().toString();


                if (ansex1.equals("40")  & ansex2.equals("40") & ansex3.equals("52") & ansex4.equals("99") & ansex5.equals("31") & ansex6.equals("27")){

                    new EasyDialog(exmpls.this)
                            .setLayoutResourceId(R.layout.layout_tip_content_horizontal)
                            .setBackgroundColor(exmpls.this.getResources().getColor(R.color.colorPrimaryDark))
                            .setLocationByAttachedView(button20)

                            .setAnimationTranslationShow(EasyDialog.DIRECTION_Y, 1000, -800, 100, -50, 50, 0)
                            .setAnimationTranslationDismiss(EasyDialog.DIRECTION_Y, 500, 0, -800)
                            .setGravity(EasyDialog.GRAVITY_TOP)
                            .setTouchOutsideDismiss(true)
                            .setMatchParent(false)
                            .setMarginLeftAndRight(24, 24)
                            .setOutsideColor(exmpls.this.getResources().getColor(R.color.MediumAquamarine))
                            .show();

            }
                else {

                    new EasyDialog(exmpls.this)
                            .setLayoutResourceId(R.layout.layout_tip_content_horizontalno)
                            .setBackgroundColor(exmpls.this.getResources().getColor(R.color.colorPrimaryDark))
                            .setLocationByAttachedView(button20)
                             .setAnimationTranslationShow(EasyDialog.DIRECTION_Y, 1000, -800, 100, -50, 50, 0)
                            .setAnimationTranslationDismiss(EasyDialog.DIRECTION_Y, 500, 0, -800)
                            .setGravity(EasyDialog.GRAVITY_TOP)
                            .setTouchOutsideDismiss(true)
                            .setMatchParent(false)
                            .setMarginLeftAndRight(24, 24)
                            .setOutsideColor(exmpls.this.getResources().getColor(R.color.outside_color_tomato))
                            .show();

                }
                break;

                    }
    }

    }




