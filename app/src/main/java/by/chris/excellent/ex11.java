package by.chris.excellent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ex11 extends AppCompatActivity {

    EditText editText;
    Button button;
    String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex11);

        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);


        View.OnClickListener buttonOK = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer = editText.getText().toString();

                if(answer.equals("20")){
                    Intent intent = new Intent(ex11.this,ex13.class);
                    startActivity(intent);
                }
                else if (answer.isEmpty()) {
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
