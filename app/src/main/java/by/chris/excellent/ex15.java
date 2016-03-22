package by.chris.excellent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ex15 extends AppCompatActivity {

    EditText editText1, editText2, editText3, editText4;
    Button button;
    String answer1, answer2, answer3, answer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex15);

        button = (Button) findViewById(R.id.button);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText2);
        editText4 = (EditText) findViewById(R.id.editText4);

        View.OnClickListener buttonOK = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                answer1 = editText1.getText().toString();
                answer2 = editText2.getText().toString();
                answer3 = editText3.getText().toString();
                answer4 = editText4.getText().toString();

                if(answer1.equals("Здравствуйте") || answer1.equals("здравствуйте") || answer1.equals("ЗДРАВСТВУЙТЕ")&&
                        answer2.equals("Спасибо") || answer2.equals("спасибо")||answer2.equals("СПАСИБО") &&
                        answer3.equals("Извините") || answer3.equals("извините") || answer3.equals("ИЗВИНИТЕ")&&
                        answer4.equals("Пожалуйста")|| answer4.equals("пожалуйста") || answer4.equals("ПОЖАЛУЙСТА") ){

                    Intent intent = new Intent(ex15.this,ex16.class);
                    startActivity(intent);
                }

                else if (answer1.isEmpty() || answer2.isEmpty() || answer3.isEmpty() || answer4.isEmpty()) {

                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Введи ответ", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {

                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Неправильно, подумай ещё", Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        };

        button.setOnClickListener(buttonOK);
    }

    @Override
    public void onBackPressed() {
    }
}
