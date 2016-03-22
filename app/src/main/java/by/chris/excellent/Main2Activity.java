package by.chris.excellent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import by.chris.excellent.EasyDialog;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private Button btnMiddleTop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        iniComponent();
    }


    private void iniComponent()
    {
        btnMiddleTop = (Button) findViewById(R.id.btnMiddleTop);
        btnMiddleTop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnMiddleTop:
                new EasyDialog(Main2Activity.this)
                        .setLayoutResourceId(R.layout.layout_tip_content_horizontal)
                        .setBackgroundColor(Main2Activity.this.getResources().getColor(R.color.background_color_blue))
                        .setLocationByAttachedView(btnMiddleTop)
                        .setAnimationTranslationShow(EasyDialog.DIRECTION_Y, 1000, -800, 100, -50, 50, 0)
                        .setAnimationTranslationDismiss(EasyDialog.DIRECTION_Y, 500, 0, -800)
                        .setGravity(EasyDialog.GRAVITY_TOP)
                        .setTouchOutsideDismiss(true)
                        .setMatchParent(false)
                        .setMarginLeftAndRight(24, 24)
                        .setOutsideColor(Main2Activity.this.getResources().getColor(R.color.outside_color_pink))
                        .show();
                break;
        }
    }

}

