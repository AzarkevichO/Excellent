package by.chris.excellent;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import android.support.v7.app.AppCompatActivity;
public class zadach1 extends AppCompatActivity {

    EditText edt24, edt25,edt26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zadach1);

        TextView txt31 = (TextView) findViewById(R.id.textView31);
        txt31.setText(R.string.zadach1);

        TextView txt32 = (TextView) findViewById(R.id.textView32);
        txt32.setText(R.string.zadach12);

        TextView txt35 = (TextView) findViewById(R.id.textView35);
        txt35.setText(R.string.zadach14);

        TextView txt34 = (TextView) findViewById(R.id.textView34);
        txt34.setText(R.string.zadach13);

        EditText edt23 = (EditText) findViewById(R.id.editText23);
         edt24 = (EditText) findViewById(R.id.editText24);
        TextView txt33 = (TextView) findViewById(R.id.textView33);
        txt33.setText("минут.");

        edt25 = (EditText) findViewById(R.id.editText25);
        edt26 = (EditText) findViewById(R.id.editText26);
Button button4 = (Button) findViewById(R.id.button4);
        View.OnClickListener buttonOK4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String edte25 = edt25.getText().toString();
                String edte24 = edt24.getText().toString();
                String edte26 = edt26.getText().toString();

                if(edte24.equals("20") & edte25.equals("20") & edte26.equals("1/3") ){
                    Intent intent = new Intent(zadach1.this,zadach2.class);
                    startActivity(intent);

                }
                else if (edte24.isEmpty() | edte25.isEmpty() | edte26.isEmpty()){
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

        button4.setOnClickListener(buttonOK4);

    }



    @Override
    public void onBackPressed() {
    }
}
