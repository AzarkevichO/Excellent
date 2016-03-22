package by.chris.excellent;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.view.LayoutInflater;
import android.widget.Toast;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ex1 extends AppCompatActivity  {

    EditText editText;
    Button button;
    String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex1);

        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);


        View.OnClickListener buttonOK = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer = editText.getText().toString();

                if(answer.equals("3")){
                    Intent intent = new Intent(ex1.this,ex2.class);
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
