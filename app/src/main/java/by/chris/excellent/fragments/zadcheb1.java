package by.chris.excellent.fragments;



import android.app.DialogFragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import by.chris.excellent.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

public class zadcheb1 extends Fragment {
    View  view;
    TextView txt100;
    Button button30;
    DialogFragment dialogFragment4;
    DialogFragment dialogFragment5;
    DialogFragment dialogFragment6;
    android.support.v4.app.FragmentManager manager;
    private FragmentTransaction transaction;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        view = inflater.inflate(R.layout.chebzad1,  container, false);
        Button button30 = (Button) view.findViewById(R.id.button30);
        Button button32 = (Button) view.findViewById(R.id.button32);


    button30.setOnClickListener(new View.OnClickListener() {
        FragmentManager fm = getActivity().getFragmentManager();

        @Override
        public void onClick(View v) {

           /* FragmentTransaction trans=getFragmentManager().beginTransaction();
            trans.replace(R.id.container, zadcheb1);
            trans.commit();*/
            EditText edt51;
            edt51 = (EditText) view.findViewById(R.id.editText51);
            String answer1 = edt51.getText().toString();
            if (answer1.equals("Привет, Чебурашка. Не бойся меня, я хочу стать твоим другом. Я тебя не обижу, давай поговорим. Ты расскажешь мне, что случилось. Вмести мы сможем преодолеть неприятности.")) {
                dialogFragment6.show(fm, "dialogFragment6");
                //  transaction.replace(R.id.container, zadcheb2);

            } else {
                dialogFragment4.show(fm, "dialogFragment6");

            }
        }
    });
        button32.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            FragmentManager fm = getActivity().getFragmentManager();
                EditText edt51b;
                edt51b = (EditText) view.findViewById(R.id.editText51);
                edt51b.setText("Привет, Чебурашка не бойся меня я хочу стать твоим другом я тебя не обижу давай поговорим ты расскажешь мне что случилось вмести мы сможем преодолеть неприятности");



        }

    });
        return view;
}
}
