package by.chris.excellent;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import android.support.v7.app.AppCompatActivity;
public class zadach5 extends AppCompatActivity {

    Button button26;
    EditText edt44,edt45;
    String answer1,answer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zadach5);

        button26 = (Button) findViewById(R.id.button26);
        edt44 = (EditText) findViewById(R.id.editText44);
        edt45 = (EditText) findViewById(R.id.editText45);
        View.OnClickListener buttonOK13 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                answer1 = edt44.getText().toString();
                answer2 = edt45.getText().toString();


                if(answer1.equals("Збожжа, зацішша, поле, у лесе, жыццё, забыццё, узвышша, двукоссе, адкрыццё," +
                        " суддзя, карэнне,дзесяццю, вяселле, ноччу, наваколле, Беларуссю, памяццю.") & answer2.equals("15") ){
                    Intent intent = new Intent(zadach5.this,zadach6.class);
                    startActivity(intent);

                }
                else if (answer1.isEmpty()  ){
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

        button26.setOnClickListener(buttonOK13);
    }

    @Override
    public void onBackPressed() {
    }
}
