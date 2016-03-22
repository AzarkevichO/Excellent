package by.chris.excellent;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import android.support.v7.app.AppCompatActivity;
public class insertlit extends AppCompatActivity {
    EditText edt35,edt33,edt34,edt36,edt37,edt38,edt39,edt40,edt41,edt42;

    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ks);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        button3 = (Button) findViewById(R.id.button3);

        edt35 = (EditText) findViewById(R.id.editText35);
        edt33 = (EditText) findViewById(R.id.editText33);
        edt34 = (EditText) findViewById(R.id.editText34);
        edt36 = (EditText) findViewById(R.id.editText);
        edt37 = (EditText) findViewById(R.id.editText17);
        edt38 = (EditText) findViewById(R.id.editText18);
        edt39 = (EditText) findViewById(R.id.editText19);
        edt40 = (EditText) findViewById(R.id.editText20);
        edt41 = (EditText) findViewById(R.id.editText21);
        edt42 = (EditText) findViewById(R.id.editText22);

        TextView txt51 = (TextView) findViewById(R.id.textView51);
        txt51.setText(R.string.insertlit);

        TextView txt52 = (TextView) findViewById(R.id.textView52);
        txt52.setText(R.string.insertlit1);

        TextView txt53 = (TextView) findViewById(R.id.textView53);
        txt53.setText(R.string.insertlit2);

        TextView txt54 = (TextView) findViewById(R.id.textView54);
        txt54.setText(R.string.insertlit3);

        TextView txt55 = (TextView) findViewById(R.id.textView55);
        txt55.setText(R.string.insertlit4);

        TextView txt56 = (TextView) findViewById(R.id.textView);
        txt56.setText(R.string.insertlit5);

        TextView txt57 = (TextView) findViewById(R.id.textView23);
        txt57.setText(R.string.insertlit6);

        TextView txt58 = (TextView) findViewById(R.id.textView24);
        txt58.setText(R.string.insertlit7);

        TextView txt59 = (TextView) findViewById(R.id.textView25);
        txt59.setText(R.string.insertlit8);

        TextView txt60 = (TextView) findViewById(R.id.textView26);
        txt60.setText(R.string.insertlit9);

        TextView txt61 = (TextView) findViewById(R.id.textView27);
        txt61.setText(R.string.insertlit10);

        TextView txt62 = (TextView) findViewById(R.id.textView28);
        txt62.setText(R.string.insertlit11);

        TextView txt63 = (TextView) findViewById(R.id.textView29);
        txt63.setText(R.string.insertlit12);

        View.OnClickListener buttonOK3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String edt5 = edt35.getText().toString();
                String edt3 = edt33.getText().toString();
                String edt4 = edt34.getText().toString();
                String edt6 = edt36.getText().toString();
                String edt7 = edt37.getText().toString();
                String edt8 = edt38.getText().toString();
                String edt9 = edt39.getText().toString();
                String edt10 = edt40.getText().toString();
                String edt11 = edt41.getText().toString();
                String edt12 = edt42.getText().toString();

                if(edt5.equals("ем") & edt4.equals("а") & edt3.equals("ос") & edt6.equals("э") & edt7.equals("атор")& (edt8.equals("Ю") |edt8.equals("ю"))
                        & edt9.equals("ное")& (edt10.equals("севе")| edt10.equals("Севе")) & edt11.equals("ое")& edt12.equals("глобус")){
                    Intent intent = new Intent(insertlit.this,zadach1.class);
                    startActivity(intent);

                }
                else if (edt5.isEmpty() | edt3.isEmpty() | edt4.isEmpty() | edt6.isEmpty() | edt7.isEmpty() | edt8.isEmpty()
                        | edt9.isEmpty() | edt10.isEmpty() | edt11.isEmpty() | edt12.isEmpty()){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Пустота", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {

                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Где то ты ошибся дружочек!Подумай еще.", Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        };

        button3.setOnClickListener(buttonOK3);


    }


    @Override
    public void onBackPressed() {
    }
}
