package by.chris.excellent;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import by.chris.excellent.fragments.Fragment_aug_2_2015_1;

public class August2_2015 extends AppCompatActivity {

    Fragment_aug_2_2015_1 fr1;
    FragmentTransaction fTrans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.august2_2015);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("август 2015");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        fr1 = new Fragment_aug_2_2015_1();
        fTrans = getFragmentManager().beginTransaction();
        fTrans.add(R.id.container_2class, fr1);
        fTrans.commit();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent intent = new Intent(this, MenuActivity.class);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
