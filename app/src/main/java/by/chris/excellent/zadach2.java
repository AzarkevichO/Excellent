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
public class zadach2 extends AppCompatActivity {

    EditText edt24, edt25,edt26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zadach2);


            TextView txt31 = (TextView) findViewById(R.id.textView31);
            txt31.setText(R.string.zadach2);

            TextView txt32 = (TextView) findViewById(R.id.textView32);
            txt32.setText(R.string.zadach21);

           TextView txt33 = (TextView) findViewById(R.id.textView33);
           txt33.setText(R.string.zadach22);


            edt24 = (EditText) findViewById(R.id.editText24);



            Button button5 = (Button) findViewById(R.id.button5);
            View.OnClickListener buttonOK5 = new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    String edte24 = edt24.getText().toString();

                    if(edte24.equals("72") ){
                        Intent intent = new Intent(zadach2.this,equation.class);
                        startActivity(intent);

                    }
                    else if (edte24.isEmpty() ){
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

            button5.setOnClickListener(buttonOK5);

        }

    @Override
    public void onBackPressed() {
    }
}
