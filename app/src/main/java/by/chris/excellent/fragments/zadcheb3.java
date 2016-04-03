package by.chris.excellent.fragments;

import android.app.DialogFragment;
import android.content.Intent;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import by.chris.excellent.R;
import android.widget.EditText;
import android.widget.TextView;


public class zadcheb3 extends Fragment  {

    Button button35;
    EditText edt35,edt33,edt34,edt36,edt37,edt38,edt39,edt40,edt41,edt42,edt52,edt54,edt55,edt56,edt57,edt58,edt21,edt59,edt61,edt33e,edt62;
    DialogFragment dialogFragment4;
    DialogFragment dialogFragment5;
    DialogFragment dialogFragment6;
zadcheb4 zadcheb4;
    zadcheb3 zadcheb3;
    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState){
     View   view = inflater.inflate(R.layout.chebzad3,  container, false);

        dialogFragment4 = new DialogFragment4();
        dialogFragment5 = new dialogFragment5();
        dialogFragment6 = new dialogFragment6();
        zadcheb4 = new zadcheb4();
zadcheb3 = new zadcheb3();
        button35  = (Button)  view.findViewById(R.id.button35);
        edt35 = (EditText) view.findViewById(R.id.editText35);
        edt33e = (EditText) view.findViewById(R.id.editText33);
        edt33 = (EditText) view.findViewById(R.id.editText53);
        edt34 = (EditText) view.findViewById(R.id.editText34);
        edt36 = (EditText) view.findViewById(R.id.editText);
        edt52 = (EditText) view.findViewById(R.id.editText52);
        edt54 = (EditText) view.findViewById(R.id.editText54);
        edt55 = (EditText) view.findViewById(R.id.editText55);
        edt56 = (EditText) view.findViewById(R.id.editText56);
        edt57 = (EditText) view.findViewById(R.id.editText57);
        edt37 = (EditText) view.findViewById(R.id.editText17);
        edt38 = (EditText) view.findViewById(R.id.editText18);
        edt39 = (EditText) view.findViewById(R.id.editText19);
        edt40 = (EditText) view.findViewById(R.id.editText20);
        edt41 = (EditText) view.findViewById(R.id.editText21);
        edt42 = (EditText) view.findViewById(R.id.editText22);
        edt58 = (EditText) view.findViewById(R.id.editText58);
        edt21 = (EditText) view.findViewById(R.id.editText21);
        edt59 = (EditText) view.findViewById(R.id.editText59);
        edt61 = (EditText) view.findViewById(R.id.editText61);
        edt62 = (EditText) view.findViewById(R.id.editText62);

      /*  TextView txt51 = (TextView) view.findViewById(R.id.textView51);
        txt51.setText(R.string.insertlit);

        TextView txt52 = (TextView) view.findViewById(R.id.textView52);
        txt52.setText(R.string.insertlit1);

        TextView txt53 = (TextView) view.findViewById(R.id.textView53);
        txt53.setText(R.string.insertlit2);

        TextView txt55 = (TextView) view.findViewById(R.id.textView55);
        txt55.setText(R.string.insertlit4);

        TextView txt56 = (TextView) view.findViewById(R.id.textView);
        txt56.setText(R.string.insertlit5);

        TextView txt57 = (TextView) view.findViewById(R.id.textView23);
        txt57.setText(R.string.insertlit6);

        TextView txt58 = (TextView) view.findViewById(R.id.textView24);
        txt58.setText(R.string.insertlit7);

        TextView txt59 = (TextView) view.findViewById(R.id.textView25);
        txt59.setText(R.string.insertlit8);

        TextView txt60 = (TextView) view.findViewById(R.id.textView26);
        txt60.setText(R.string.insertlit9);

        TextView txt61 = (TextView) view.findViewById(R.id.textView27);
        txt61.setText(R.string.insertlit10);

        TextView txt62 = (TextView) view.findViewById(R.id.textView28);
        txt62.setText(R.string.insertlit11);

        TextView txt63 = (TextView) view.findViewById(R.id.textView29);
        txt63.setText(R.string.insertlit12);*/

        View.OnClickListener buttonOK3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getActivity().getFragmentManager();
                String edt5 = edt35.getText().toString();
                String edt3 = edt33.getText().toString();
                String edt4 = edt34.getText().toString();
                String edt22 = edt52.getText().toString();
                String edt45 = edt54.getText().toString();
                String edt55е = edt55.getText().toString();
                String edt33е = edt33e.getText().toString();
                String edt56е = edt56.getText().toString();
                String edt57е = edt57.getText().toString();
                String edt6 = edt36.getText().toString();
                String edt7 = edt37.getText().toString();
                String edt8 = edt38.getText().toString();
                String edt9 = edt39.getText().toString();
                String edt10 = edt40.getText().toString();
                String edt11 = edt41.getText().toString();
                String edt12 = edt42.getText().toString();
                String edt58е = edt58.getText().toString();
                String edt21е = edt21.getText().toString();
                String edt59е = edt59.getText().toString();
                String edt61е = edt61.getText().toString();
                String edt62е = edt62.getText().toString();
                if(edt5.equals("е")& edt33е.equals("м")& edt4.equals("а") &edt62е.equals("c") & edt3.equals("о") & edt6.equals("э")|edt6.equals("Э") &edt22.equals("т")
                        & edt45.equals("о") &edt55е.equals("р") & edt7.equals("а")& (edt8.equals("Ю") |edt8.equals("ю"))
                        & edt9.equals("н")&edt56е.equals("о") & edt57е.equals("е") & (edt10.equals("с") | edt10.equals("С"))&edt58е.equals("е") &edt21е.equals("в")&
                        edt59е.equals("о")&edt61е.equals("е")   & edt11.equals("о")& edt12.equals("глобус")){

                  // FragmentManager fm = getActivity().getFragmentManager();
                    dialogFragment6.show(fm,"dialogFragment6");
                }
                else if (edt5.isEmpty() |edt61е.isEmpty()| edt3.isEmpty() |edt33е.isEmpty() | edt4.isEmpty() |edt62е.isEmpty()|edt22.isEmpty()| edt6.isEmpty() | edt7.isEmpty() | edt8.isEmpty()
                        | edt9.isEmpty() |edt59е.isEmpty()| edt10.isEmpty() |edt21е.isEmpty()|edt45.isEmpty()|edt58е.isEmpty()|edt57е.isEmpty()|edt56е.isEmpty()| edt11.isEmpty() |edt55е.isEmpty()| edt12.isEmpty()){

                    FragmentTransaction trans=getFragmentManager().beginTransaction();
                    trans.replace(R.id.container, zadcheb4);
                    trans.commit();
                    //   dialogFragment5.show(fm,"dialogFragment5");

                }
                else {
                 //   FragmentManager fm = getActivity().getFragmentManager();
                   dialogFragment4.show(fm, "dialogFragment4");



                }

            }
        };

        button35.setOnClickListener(buttonOK3);

        return view;
    }



    private void setRequestedOrientation(int screenOrientationLandscape) {

    }



}
