package by.chris.excellent.fragments;

import android.app.DialogFragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;

import by.chris.excellent.R;


public class Fragment_aug_2_2015_1 extends Fragment {

    Integer val_np;
    DialogFragment dialogFragment4;
    dialogFragment6 dialogFragment6;
    NumberPicker np;
    android.support.v4.app.FragmentManager manager;
    private FragmentTransaction transaction;
    Fragment_aug_2_2015_2 fr2;

    public Fragment_aug_2_2015_1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        dialogFragment4 = new DialogFragment4();
        dialogFragment6 = new dialogFragment6();
        fr2 = new Fragment_aug_2_2015_2();


        View v;
        v = inflater.inflate(R.layout.aug_2_2015_1, container, false);

        np = (NumberPicker) v.findViewById(R.id.numberPicker);
        np.setWrapSelectorWheel(false);
        np.setMaxValue(4);
        np.setMinValue(1);


        Button button = (Button) v.findViewById(R.id.button33);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                val_np = np.getValue();

                if (val_np.equals(3)){
                    FragmentManager fm = getActivity().getFragmentManager();
                    dialogFragment4.show(fm,"dialogFragment6");
                    FragmentTransaction trans=getFragmentManager().beginTransaction();
                    trans.replace(R.id.container_2class, fr2);
                    trans.commit();
                }
                else {
                    FragmentManager fm = getActivity().getFragmentManager();
                    dialogFragment6.show(fm,"dialogFragment4");
                }

                }

        });

        return v;

    }

}
