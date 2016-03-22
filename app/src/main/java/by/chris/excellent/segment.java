package by.chris.excellent;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class segment extends AppCompatActivity {


    Button button1;
    EditText edt1;
    String answer1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segment);
            edt1 = (EditText) findViewById(R.id.editText37);
        button1 = (Button) findViewById(R.id.button21);
        View.OnClickListener buttonOK9 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                answer1 = edt1.getText().toString();

                if(answer1.equals("1")){
                    Intent intent = new Intent(segment.this,equation3.class);
                    startActivity(intent);



                }
                else if (answer1.isEmpty() ) {


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

        button1.setOnClickListener(buttonOK9);



    }

    @Override
    public void onBackPressed() {
    }
}
