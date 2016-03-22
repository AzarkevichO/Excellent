package by.chris.excellent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ex14 extends AppCompatActivity {

    EditText editText1, editText2, editText3, editText4;
    Button button;
    String answer1, answer2, answer3, answer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex14);

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

                if(answer1.equals("КАРАНДАШ") || answer1.equals("Карандаш") || answer1.equals("карандаш")&&
                   answer2.equals("АРБУЗ") || answer2.equals("Арбуз")||answer2.equals("арбуз") &&
                   answer3.equals("МАШИНА") || answer3.equals("Машина") || answer3.equals("машина")&&
                   answer4.equals("ЯБЛОКО")|| answer4.equals("Яблоко") || answer4.equals("яблоко") ){

                    Intent intent = new Intent(ex14.this,ex15.class);
                    startActivity(intent);
                }

                else if (answer1.isEmpty() || answer1.isEmpty() || answer3.isEmpty() || answer4.isEmpty()) {

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
