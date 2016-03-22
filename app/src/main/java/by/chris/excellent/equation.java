package by.chris.excellent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;
import android.graphics.Color;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class equation extends AppCompatActivity {


    private DataAdapter mAdapter;
    EditText edt2,edt3,edt4,edt5,edt6;
    TextView txt37;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eq1);


        Button button = (Button) findViewById(R.id.button);



         TextView txt16 = (TextView) findViewById(R.id.textView16);
        txt16.setText(R.string.equaation1);

         TextView txt9 = (TextView) findViewById(R.id.textView9);
        txt9.setText(R.string.equaation4);

         TextView txt13 = (TextView) findViewById(R.id.textView13);
        txt13.setText(R.string.equaation3);

         TextView txt7 = (TextView) findViewById(R.id.textView7);
        txt7.setText(R.string.equaation2);

        TextView txt11 = (TextView) findViewById(R.id.textView11);
        txt11.setText(R.string.equaation5);

         edt2 = (EditText) findViewById(R.id.editText2);
         edt3 = (EditText) findViewById(R.id.editText3);
         edt4 = (EditText) findViewById(R.id.editText4);
         edt5 = (EditText) findViewById(R.id.editText5);
         edt6 = (EditText) findViewById(R.id.editText6);
         txt37 = (TextView) findViewById(R.id.textView37);
        View.OnClickListener buttonOK6 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String edit2 = edt2.getText().toString();
                String edit3 = edt3.getText().toString();
                String edit4 = edt4.getText().toString();
                String edit5 = edt5.getText().toString();
                String edit6 = edt6.getText().toString();


                if(edit2.equals("20") & edit4.equals("3") & edit3.equals("46") & edit6.equals("4") & edit5.equals("11")){
                    Intent intent = new Intent(equation.this,equation2.class);
                    startActivity(intent);


                }
                else if (edit2.isEmpty() | edit3.isEmpty() | edit4.isEmpty() | edit5.isEmpty() | edit6.isEmpty()
                        ){
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

        button.setOnClickListener(buttonOK6);

    }

    @Override
    public void onBackPressed() {
    }


}