package by.chris.excellent.fragments;

import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import by.chris.excellent.R;

public class DialogFragment2 extends DialogFragment implements OnClickListener {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getDialog().setTitle("Письмо от Леопольда!");
        View v = inflater.inflate(R.layout.dialogfragment2, null);
        TextView txt97;
        txt97 = (TextView) v.findViewById(R.id.textView97);
        txt97.setText(" Теперь твои родители будут знать о твоих успехах!");
        return v;
    }

    public void onClick(View v) {
        dismiss();
    }

    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
    }

    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
    }
}