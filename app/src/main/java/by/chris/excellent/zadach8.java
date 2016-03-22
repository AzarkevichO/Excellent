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
public class zadach8 extends AppCompatActivity {

    Button button26;
    EditText edt44;
    String answer1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zadach8);

        button26 = (Button) findViewById(R.id.button26);
        edt44 = (EditText) findViewById(R.id.editText44);

        View.OnClickListener buttonOK16 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                answer1 = edt44.getText().toString();

                if(answer1.equals("Привет, Чебурашка. Не бойся меня, я хочу стать твоим другом. Я тебя не обижу, давай поговорим.Ты расскажешь мне, что случилось. Вмести мы сможем преодолеть неприятности.")){
                    Intent intent = new Intent(zadach8.this,MenuActivity.class);
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

        button26.setOnClickListener(buttonOK16);
    }

    @Override
    public void onBackPressed() {
    }
}
