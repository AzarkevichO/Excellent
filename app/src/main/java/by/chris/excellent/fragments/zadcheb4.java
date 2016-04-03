package by.chris.excellent.fragments;

import android.app.DialogFragment;
import android.graphics.Color;
import android.os.Bundle;
import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import java.util.Random;
import by.chris.excellent.R;
import me.panavtec.drawableview.DrawableView;
import me.panavtec.drawableview.DrawableViewConfig;

public class zadcheb4 extends Fragment {
    zadcheb1 zadcheb1;
    View view;
    private DrawableView drawableView;
    private DrawableViewConfig config = new DrawableViewConfig();
    android.support.v4.app.FragmentManager manager;
    private FragmentTransaction transaction;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       view = inflater.inflate(R.layout.chebzad4, container, false);
        initUi();
        return view;
    }


    private void initUi() {
        drawableView = (DrawableView) view.findViewById(R.id.paintView);
        Button strokeWidthMinusButton = (Button) view.findViewById(R.id.strokeWidthMinusButton);
        Button strokeWidthPlusButton = (Button) view.findViewById(R.id.strokeWidthPlusButton);
        Button changeColorButton = (Button) view.findViewById(R.id.changeColorButton);
        Button undoButton = (Button) view.findViewById(R.id.undoButton);
        Button next = (Button) view.findViewById(R.id.next);
       zadcheb1 = new zadcheb1();
        config.setStrokeColor(getResources().getColor(android.R.color.black));
        config.setShowCanvasBounds(true);
        config.setStrokeWidth(20.0f);
        config.setMinZoom(1.0f);
        config.setMaxZoom(3.0f);
        config.setCanvasHeight(1080);
        config.setCanvasWidth(1920);
        drawableView.setConfig(config);

        strokeWidthPlusButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                config.setStrokeWidth(config.getStrokeWidth() + 10);
            }
        });
        strokeWidthMinusButton.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                config.setStrokeWidth(config.getStrokeWidth() - 10);
            }
        });
        changeColorButton.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                Random random = new Random();
                config.setStrokeColor(
                        Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            }
        });
        undoButton.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                drawableView.undo();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {

                FragmentTransaction trans=getFragmentManager().beginTransaction();
                trans.replace(R.id.container, zadcheb1);
                trans.commit();
            }
        });
    }
}

