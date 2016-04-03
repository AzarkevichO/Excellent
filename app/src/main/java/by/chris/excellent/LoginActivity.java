package by.chris.excellent;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.ImageView;
public class LoginActivity extends FragmentActivity{


   public String name;
    TextView txt86;
    static public  EditText etName;
    Intent intent;
    ImageView imageView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginname);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        etName = (EditText) findViewById(R.id.editText40);
        txt86 = (TextView) findViewById(R.id.textView86);
        imageView = (ImageView) findViewById(R.id.imageView9);

        imageView.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                name = etName.getText().toString();

                        if (name.length() > 0) {
                            txt86.setText("Ну-ка,сейчас прочту.");

                            Intent intent2 = new Intent(LoginActivity.this,LoginPol.class);
                            intent2.putExtra("name", name);
                            startActivity(intent2);
                        }
                else{

                 txt86.setText("Как все же тебя зовут?");

                        }
            }








      /*  etEmail = (EditText) findViewById(R.id.etEmail);

    }



    @Override
    public void onClick(View v) {

        ContentValues cv = new ContentValues();  // создаем объект для данных

         // получаем данные из полей ввода
        String email = etEmail.getText().toString();

        String pol = s1;
        String Cl = s2;

        if (name.toString().equals("") & pol.toString().equals("") & Cl.toString().equals(""))
        {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Заполните все поля!", Toast.LENGTH_SHORT);
            toast.show();
        }
        /* if (pol.toString().equals(""))
        {
        Toast toast = Toast.makeText(getApplicationContext(),
        "Заполните", Toast.LENGTH_SHORT);
        toast.show();
        }
        // подключаемся к БД


        //etName.setOnEditorActionListener(new TextView.OnEditorActionListener() {
         //   public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        //        if (actionId == EditorInfo.IME_ACTION_DONE) {
        //            //Hide keyboard
        //            if (getCurrentFocus() != null) {
        //                ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE))
        //               LoginActivity.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        //            }
        //        }
        //        return false;
        //    }
        //});


        if (Cl.toString().length() > 0 & name.toString().length() > 0 & pol.toString().length() > 0) {
            SQLiteDatabase db = dbHelper.getWritableDatabase();


            switch (v.getId()) {
                case R.id.btnAdd:

// подготовим данные для вставки в виде пар: наименование столбца - значение

                    cv.put("name", name);
                    cv.put("email", email);
                    cv.put("pol", pol);
                    cv.put("Cl", Cl);
// вставляем запись и получаем ее ID
                    long rowID = db.insert("mytable", null, cv);
                    break;
            }
            dbHelper.close();

            Intent intent = new Intent(LoginActivity.this,LoginDoneActivity.class);
            intent.putExtra("pol",pol);
            intent.putExtra("name",name);
            startActivity(intent);}
        else {

            Toast toast = Toast.makeText(getApplicationContext(),
                    "Заполните все поля!", Toast.LENGTH_SHORT);
            toast.show();
        }





    }



    class DBHelper extends SQLiteOpenHelper {

        public DBHelper(Context context) {
            // конструктор суперкласса
            super(context, "myDB", null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {

            db.execSQL("create table mytable ("
                    + "id integer primary key autoincrement,"
                    + "name text not null,"
                    + "pol text not null,"
                    + "Cl integer not null,"
                    + "email text" + ");");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        }*/


        });}

    @Override
    public void onBackPressed() {
    }

    }
