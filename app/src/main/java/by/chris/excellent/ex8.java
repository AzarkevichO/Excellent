package by.chris.excellent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ex8 extends AppCompatActivity {

    EditText editText1, editText2, editText3;
    Button button;
    String answer1, answer2, answer3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex8);

        button = (Button) findViewById(R.id.button);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText2);


        View.OnClickListener buttonOK = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                answer1 = editText1.getText().toString();
                answer2 = editText2.getText().toString();
                answer3 = editText3.getText().toString();



                if(answer1.equals("мухомор") || answer1.equals("Мухомор") || answer1.equals("МУХОМОР") &&
                   answer2.equals("бледная") || answer2.equals("Бледная") || answer2.equals("БЛЕДНАЯ")&&
                   answer3.equals("поганка") || answer3.equals("Поганка") ||answer3.equals("ПОГАНКА"))  {

                    Intent intent = new Intent(ex8.this,ex9.class);
                    startActivity(intent);
                } else if (answer1.isEmpty() || answer2.isEmpty() || answer3.isEmpty() ) {

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
