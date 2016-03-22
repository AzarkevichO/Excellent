package by.chris.excellent;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class equation3 extends AppCompatActivity {
    EditText edt38,edt39,edt40;
    Button button22;
    String answer1,answer2,answer3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eq3);
    edt38 = (EditText) findViewById(R.id.editText38);
    edt39 = (EditText) findViewById(R.id.editText39);
    edt40 = (EditText) findViewById(R.id.editText47);
        button22 = (Button) findViewById(R.id.button22);
        View.OnClickListener buttonOK10 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                answer1 = edt38.getText().toString();
                answer2 = edt39.getText().toString();
                answer3 = edt40.getText().toString();

                if(answer1.equals("2") && answer2.equals("36") && answer3.equals("16")){

                    Intent intent = new Intent(equation3.this,zadach3.class);
                    startActivity(intent);

                }
                else if (answer1.isEmpty() || answer2.isEmpty() || answer3.isEmpty()) {


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

        button22.setOnClickListener(buttonOK10);


    }
    @Override
    public void onBackPressed() {
    }
}
