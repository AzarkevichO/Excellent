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

public class zadach3 extends AppCompatActivity {

    EditText edt41, edt42;
    Button button23;
    String answer1,answer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zadach3);
    edt41 = (EditText) findViewById(R.id.editText41);
        edt42 = (EditText) findViewById(R.id.editText42);
        button23 = (Button) findViewById(R.id.button23);

        View.OnClickListener buttonOK11 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                answer1 = edt41.getText().toString();
                answer2 = edt42.getText().toString();


                if(answer1.equals("4") & answer2.equals("1/3") ){
                    Intent intent = new Intent(zadach3.this,zadach4.class);
                    startActivity(intent);

                }
                else if (answer1.isEmpty() || answer2.isEmpty() ){
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

        button23.setOnClickListener(buttonOK11);


    }


    @Override
    public void onBackPressed() {
    }
}
