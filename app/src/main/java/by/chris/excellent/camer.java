package by.chris.excellent;

import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import  by.chris.excellent.fragments.nav_manage;
public class camer extends Activity {
public Intent intentcam;
    public  Uri uricam;

    File directory;
    final int TYPE_PHOTO = 1;
    final int REQUEST_CODE_PHOTO = 1;
TextView txt93;
    public  ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.camera);
        createDirectory();
        imageView = (ImageView) findViewById(R.id.imageView17);
    }

  public void onClickPhoto(View view) {
     Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
     intent.putExtra(MediaStore.EXTRA_OUTPUT, generateFileUri(TYPE_PHOTO));
        startActivityForResult(intent, REQUEST_CODE_PHOTO);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent intent) {
        if (requestCode == REQUEST_CODE_PHOTO) {
            if (resultCode == RESULT_OK) {
                if (intent == null) {
                } else {
                    Bundle bndl = intent.getExtras();
                    if (bndl != null) {
                        Object obj = intent.getExtras().get("data");
                        if (obj instanceof Bitmap) {
                            Bitmap bitmap = (Bitmap) obj;
                        }
                    }
                }
            } else if (resultCode == RESULT_CANCELED) {
            }
        }
    }

    private Uri generateFileUri(int type) {
        File file = null;
        switch (type) {
            case TYPE_PHOTO:
                file = new File(directory.getPath() + "/" + "photo_"
                        + System.currentTimeMillis() + ".jpg");
                break;
                }
       Intent  intentcam = new Intent(this,MenuActivity.class);
       startActivity(intentcam);

          return Uri.fromFile(file);

    }

    private void createDirectory() {
        directory = new File(
                Environment
                        .getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                "Отличник");

        if (!directory.exists())
            directory.mkdirs();
    }


}