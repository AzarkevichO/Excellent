package by.chris.excellent;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class LoginPol extends Activity{


    TextView txt90;
    String s1 = new String();
    RadioGroup rdgroup;
    String name;
    ImageView imageView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SystemClock.sleep(4000);
        setContentView(R.layout.loginpol);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        txt90 = (TextView) findViewById(R.id.textView90);
        rdgroup = (RadioGroup) findViewById(R.id.radioGroup);

        Intent intent2 = getIntent();
        name = intent2.getStringExtra("name");
        txt90.setText(name+"! Да это же одно из моих любимых имен! Я конечно не глупый кот, но все же скажи: ты мальчик? или девочка?");

        rdgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                switch (checkedId) {

                     case R.id.radioButton:
                         s1 = "Мальчик";
                         txt90.setText(name+", да ты  истенный супергерой!");
                          break;
                    case R.id.radioButton2:
                        s1 = "Девочка";
                        txt90.setText(name+", да ты прекрасная принцесса!");                    break;
                      default:
                        break;
                }
            }
        });
        imageView = (ImageView) findViewById(R.id.imageView9);

        imageView.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

if (s1.length()>0){

    Intent intent1 = new Intent(LoginPol.this,LoginDoneActivity.class);
    intent1.putExtra("pol",s1);
    intent1.putExtra("name",name);
    txt90.setText("хочешь узнать что будет дальше?");
    startActivity(intent1);
    }

}});}



    @Override
    public void onBackPressed() {
    }

}


       /*  imageView = (ImageView) findViewById(R.id.imageView14);
        OnClickListener oclBtnOk = new OnClickListener() {
            @Override
            public void onClick(View v) {
            if (s1.length() > 0) {

                    txt86.setText("Оооо,какое у тебя прекрастное имя!");
                 /*   Intent intent = new Intent(LoginPol.this, LoginPol.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else {

                    txt86.setText("Как все же тебя зовут?");

                }


            }
        };

        imageView.setOnClickListener(oclBtnOk);*/
     /*   btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);

        CheckBox chkDev = (CheckBox) findViewById(R.id.chkDev);
        chkDev.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
                s1 = "Девочка";
            }
        });

        CheckBox chkMal = (CheckBox) findViewById(R.id.chkMal);
        chkMal.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
                s1="Мальчик";
            }
        } );

        CheckBox chk2 = (CheckBox) findViewById(R.id.chk2);
        chk2.setOnCheckedChangeListener( new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
                s2 = "2";
            }
        } );

        CheckBox chk3 = (CheckBox) findViewById(R.id.chk3);
        chk3.setOnCheckedChangeListener( new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
                s2 = "3";
            }
        } );


        etEmail = (EditText) findViewById(R.id.etEmail);
        // создаем объект для создания и управления версиями БД
        dbHelper = new DBHelper(this);
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




