package by.chris.excellent;

import android.content.Context;
import android.widget.ArrayAdapter;


public class DataAdapter extends ArrayAdapter<String> {

    private static final String[] mContacts = { "Ключ   ", "", "46",
            "Н", "11", "А", "3", "Ь", "4","Я", "20", "Т"};

    Context mContext;

       public DataAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId, mContacts);

           this.mContext = context;
    }

}
