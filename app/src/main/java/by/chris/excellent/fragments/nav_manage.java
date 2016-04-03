package by.chris.excellent.fragments;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import by.chris.excellent.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link nav_manage#newInstance} factory method to
 * create an instance of this fragment.
 */

public class nav_manage extends Fragment {

    final int  GALLERY_REQUEST = 1;
    String namel;
    public  Bitmap bmp;
    TextView txt93;
    View vie;
    public  File file;
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_2class.
     */
    // TODO: Rename and change types and number of parameters
    public static nav_manage newInstance(String param1, String param2)  {
        nav_manage fragment = new nav_manage();
        Bundle args = new Bundle();
        return fragment;
    }

    public nav_manage() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vie = inflater.inflate(R.layout.setting, container, false);
        Intent intent2 = getActivity().getIntent();
        namel = intent2.getStringExtra("name");
        txt93 = (TextView) vie.findViewById(R.id.textView93);
   //   txt93.setText(namel);
     Button button = (Button)vie.findViewById(R.id.button31);
     button.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
            photoPickerIntent.setType("image/*");
            startActivityForResult(photoPickerIntent, GALLERY_REQUEST);
        }
    });

    return vie;
}
 @Override
    public void onActivityResult(int requestCode, int resultCode, Intent imageReturnedIntent) {
        super.onActivityResult(requestCode, resultCode, imageReturnedIntent);
        ImageView imageViewty = (ImageView) vie.findViewById(R.id.imageView15);
        switch(requestCode) {
            case GALLERY_REQUEST:
               Uri uri = imageReturnedIntent.getData();
                imageViewty.setImageURI(uri);
        }}

    public Bitmap getBitmap()
    {   ImageView img1 = (ImageView) vie.findViewById(R.id.imageView15);
        img1.setDrawingCacheEnabled(true);
        img1.buildDrawingCache();
        bmp = Bitmap.createBitmap(img1.getDrawingCache());
        img1.setDrawingCacheEnabled(false);
        return bmp;
    }
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

}



