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
public class zadach7 extends AppCompatActivity {

    Button button24;
    EditText edt43;
    String answer1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zadach7);

        button24 = (Button) findViewById(R.id.button24);
        edt43 = (EditText) findViewById(R.id.editText43);

        View.OnClickListener buttonOK15 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                answer1 = edt43.getText().toString();



                if(answer1.equals("2") ){
                    Intent intent = new Intent(zadach7.this,zadach8.class);
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

        button24.setOnClickListener(buttonOK15);
    }

    @Override
    public void onBackPressed() {
    }
}
