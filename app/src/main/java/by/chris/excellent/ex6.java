package by.chris.excellent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ex6 extends AppCompatActivity {

    EditText editText1, editText2, editText3, editText4, editText5;
    String answer1, answer2, answer3, answer4, answer5;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex6);

        button = (Button) findViewById(R.id.button);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);

        editText4 = (EditText) findViewById(R.id.editText4);
        editText5 = (EditText) findViewById(R.id.editText5);



        View.OnClickListener buttonOK = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                answer1 = editText1.getText().toString();
                answer2 = editText2.getText().toString();
                answer3 = editText3.getText().toString();
                answer4 = editText4.getText().toString();
                answer5 = editText5.getText().toString();

                if(answer1.equals("9") && answer2.equals("2") && answer3.equals("3") && answer4.equals("4") && answer5.equals("3")){
                    Intent intent = new Intent(ex6.this,ex7.class);
                    startActivity(intent);
                }
                else if (answer1.isEmpty() || answer2.isEmpty() || answer3.isEmpty() || answer4.isEmpty() || answer5.isEmpty()) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Введи все ответы", Toast.LENGTH_SHORT);
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
