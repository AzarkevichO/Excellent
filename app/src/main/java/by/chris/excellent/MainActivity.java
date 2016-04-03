package by.chris.excellent;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import android.content.Context;
import android.view.LayoutInflater;
public class MainActivity extends AppCompatActivity  {
String name;
    TextView textView90;
    public Button button_main;
    boolean hasVisited;
    LoginPol loginPol;
    private static final String MY_SETTINGS = "my_settings";
ViewFlipper flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.loginname);
        textView90 = (TextView) findViewById(R.id.textView90);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
loginPol = new LoginPol();
        button_main = (Button) findViewById(R.id.button_main);
   //     button_main.setOnClickListener(this);
        SharedPreferences sp = getSharedPreferences(MY_SETTINGS,
                Context.MODE_PRIVATE);
        // проверяем, первый ли раз открывается программа
       hasVisited = sp.getBoolean("hasVisited", false);

        if (!hasVisited) {
            // выводим нужную активность
            SharedPreferences.Editor e = sp.edit();
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            e.commit(); // не забудьте подтвердить изменения
        }
        else {

            Intent intent = new Intent(this, MenuActivity.class);
            startActivity(intent);

        }
    }

 /*@Override
    public void onClick(View v) { //обработчик кнопки
        switch (v.getId()) {
            case R.id.button_main:
                if (hasVisited == true){
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);}
                else {Intent intent = new Intent(this, MenuActivity.class);
                    startActivity(intent);}
                break;
            default:
                break;
        }
    }
*/

    @Override
    public void onBackPressed() {
    }
}
