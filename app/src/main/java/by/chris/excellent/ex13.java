package by.chris.excellent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ex13 extends AppCompatActivity {

    EditText editText1, editText2, editText3, editText4, editText5, editText6, editText7, editText8,
             editText9, editText10, editText11, editText12, editText13, editText14, editText15,
             editText16, editText17, editText18;
    Button button, button2;
    String answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8, answer9,answer10,
           answer11, answer12, answer13, answer14, answer15, answer16, answer17, answer18;
    TextView textView1, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex13);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button2.setVisibility(View.GONE);


        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);

        editText4 = (EditText) findViewById(R.id.editText4);
        editText5 = (EditText) findViewById(R.id.editText5);
        editText6 = (EditText) findViewById(R.id.editText6);
        editText7 = (EditText) findViewById(R.id.editText7);
        editText8 = (EditText) findViewById(R.id.editText8);
        editText9 = (EditText) findViewById(R.id.editText9);
        editText10 = (EditText) findViewById(R.id.editText10);
        editText11 = (EditText) findViewById(R.id.editText11);
        editText12 = (EditText) findViewById(R.id.editText12);
        editText13 = (EditText) findViewById(R.id.editText13);
        editText14 = (EditText) findViewById(R.id.editText14);
        editText15 = (EditText) findViewById(R.id.editText15);
        editText16 = (EditText) findViewById(R.id.editText16);
        editText17 = (EditText) findViewById(R.id.editText17);
        editText18 = (EditText) findViewById(R.id.editText18);





        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);




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
                answer8 = editText8.getText().toString();
                answer9 = editText9.getText().toString();
                answer10 = editText10.getText().toString();
                answer11 = editText11.getText().toString();
                answer12 = editText12.getText().toString();
                answer13 = editText13.getText().toString();
                answer14 = editText14.getText().toString();
                answer15 = editText15.getText().toString();
                answer16 = editText16.getText().toString();
                answer17 = editText17.getText().toString();
                answer18 = editText18.getText().toString();





                if(answer1.equals("10") && answer2.equals("7") && answer3.equals("13") &&
                        answer4.equals("16") && answer5.equals("5") && answer6.equals("15") &&
                        answer7.equals("4") && answer8.equals("19") && answer9.equals("3") &&
                        answer10.equals("9") && answer11.equals("8") && answer12.equals("20") &&
                        answer13.equals("17") && answer14.equals("14") && answer15.equals("2") &&
                        answer16.equals("12") && answer17.equals("1") && answer18.equals("18")){

                    textView1.setText("Привезите, пожалуйста, гостинцев!");
                    button2.setVisibility(View.VISIBLE);

                }
                else if (answer1.isEmpty() || answer2.isEmpty() || answer3.isEmpty() ||
                        answer4.isEmpty() || answer5.isEmpty() || answer6.isEmpty() ||
                        answer7.isEmpty() || answer8.isEmpty() || answer9.isEmpty() ||
                        answer10.isEmpty() || answer11.isEmpty() || answer12.isEmpty() ||
                        answer13.isEmpty() || answer14.isEmpty() || answer15.isEmpty() ||
                        answer16.isEmpty() || answer17.isEmpty() || answer18.isEmpty()) {

                    button2.setVisibility(View.GONE);
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Введи все ответы", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {
                    button2.setVisibility(View.GONE);
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Неправильно, подумай ещё", Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        };

        button.setOnClickListener(buttonOK);

        View.OnClickListener buttonOK2 = new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                if(button2.isClickable()) {
                    Intent intent = new Intent(ex13.this,ex14.class);
                    startActivity(intent);

                }

            }
        };

        button2.setOnClickListener(buttonOK2);
        }

    @Override
    public void onBackPressed() {
    }

}
