package by.chris.excellent;

import android.content.Intent;
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
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
String name;
    TextView textView90;
    public Button button_main;
ViewFlipper flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.main);
        textView90 = (TextView) findViewById(R.id.textView90);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        button_main = (Button) findViewById(R.id.button_main);
        button_main.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) { //обработчик кнопки
        switch (v.getId()) {
            case R.id.button_main:
                Intent intent = new Intent(this, MenuActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }


    @Override
    public void onBackPressed() {
    }
}
