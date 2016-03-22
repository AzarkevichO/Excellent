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
public class zadach6 extends AppCompatActivity {

    Button button27;
    EditText edt46;
    String answer1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zadach6);

        button27 = (Button) findViewById(R.id.button27);
        edt46 = (EditText) findViewById(R.id.editText46);

        View.OnClickListener buttonOK14 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                answer1 = edt46.getText().toString();



                if(answer1.equals("3") ){
                    Intent intent = new Intent(zadach6.this,zadach7.class);
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

        button27.setOnClickListener(buttonOK14);
    }

    @Override
    public void onBackPressed() {
    }
}
