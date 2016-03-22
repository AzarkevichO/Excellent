package by.chris.excellent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ex16 extends AppCompatActivity {

    EditText editText1, editText2, editText3, editText4, editText5, editText6, editText7;
    Button button;
    String answer1, answer2, answer3, answer4, answer5, answer6, answer7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex16);

        button = (Button) findViewById(R.id.button);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText2);
        editText4 = (EditText) findViewById(R.id.editText4);
        editText5 = (EditText) findViewById(R.id.editText5);
        editText6 = (EditText) findViewById(R.id.editText6);
        editText7 = (EditText) findViewById(R.id.editText7);

        View.OnClickListener buttonOK = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                answer1 = editText1.getText().toString();
                answer2 = editText2.getText().toString();
                answer3 = editText3.getText().toString();
                answer4 = editText4.getText().toString();
                answer5 = editText5.getText().toString();
                answer6 = editText6.getText().toString();
                answer7 = editText7.getText().toString();

                if(answer1.equals("дрэва") || answer1.equals("ДРЭВА") || answer1.equals("Дрэва")&&
                        answer2.equals("сцяг") || answer2.equals("СЦЯГ")||answer2.equals("Сцяг") &&
                        answer3.equals("бусел") || answer3.equals("БУСЕЛ") || answer3.equals("Бусел")&&
                        answer4.equals("хмара")|| answer4.equals("ХМАРА") || answer4.equals("Хмара") &&
                        answer5.equals("шчасце") || answer5.equals("ШЧАСЦЕ")||answer5.equals("Шчасце") &&
                        answer6.equals("гульня") || answer6.equals("ГУЛЬНЯ") || answer6.equals("Гульня")&&
                        answer7.equals("рамонак")|| answer7.equals("РАМОНАК") || answer7.equals("Рамонак")){

                    Intent intent = new Intent(ex16.this,ex17.class);
                    startActivity(intent);
                }

                else if (answer1.isEmpty() || answer2.isEmpty() || answer3.isEmpty() ||
                        answer4.isEmpty() || answer5.isEmpty() || answer6.isEmpty() || answer7.isEmpty()) {

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
