package by.chris.excellent.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import by.chris.excellent.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

public class zadcheb2 extends Fragment {

   TextView txt100;
    android.support.v4.app.FragmentManager manager;
    private FragmentTransaction transaction;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
      View  view = inflater.inflate(R.layout.chebzad2,  container, false);
        txt100 = (TextView) view.findViewById(R.id.textView100);
        txt100.setText(R.string.plan1);
        return view;
    }

}
