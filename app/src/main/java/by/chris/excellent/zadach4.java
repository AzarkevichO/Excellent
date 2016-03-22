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

public class zadach4 extends AppCompatActivity {

    EditText edt43;
    Button button24;
    String answer1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zadach4);
        edt43 = (EditText) findViewById(R.id.editText43);

        button24 = (Button) findViewById(R.id.button24);

        View.OnClickListener buttonOK12 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                answer1 = edt43.getText().toString();



                if(answer1.equals("2") ){
                    Intent intent = new Intent(zadach4.this,zadach5.class);
                    startActivity(intent);

                }
                else if (answer1.isEmpty()  ){
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

        button24.setOnClickListener(buttonOK12);


    }

    @Override
    public void onBackPressed() {
    }
}
