package tanvir.multiplexer.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.Gravity;

import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper;

import java.util.ArrayList;

import tanvir.multiplexer.R;
import tanvir.multiplexer.RecycleerViewAdapter.RecyclerAdapterForJibonJapon;

public class JibonJapon extends AppCompatActivity {

    private android.support.v7.widget.Toolbar toolbar;


    private RecyclerView recyclerViewForJibonJapon;
    public RecyclerAdapterForJibonJapon adapterForJibonJapon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jibon_japon);

        toolbar = findViewById(R.id.toolbarlayoutinjibonjapon);
        setSupportActionBar(toolbar);


        ArrayList<String> JibonJaponData=new ArrayList<>();
        JibonJaponData.add("পঞ্চম শ্রেনী সমাপনি পরীক্ষা প্রস্তুতি- পর্ব ৫");
        JibonJaponData.add("পঞ্চম শ্রেনী সমাপনি পরীক্ষা প্রস্তুতি- পর্ব ৪ ");

        recyclerViewForJibonJapon= findViewById(R.id.RV_JibonJapon);

        recyclerViewForJibonJapon.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false));

        SnapHelper snapHelperStartJibonJapon = new GravitySnapHelper(Gravity.START);
        snapHelperStartJibonJapon.attachToRecyclerView(recyclerViewForJibonJapon);


        recyclerViewForJibonJapon.setHasFixedSize(true);
        adapterForJibonJapon = new RecyclerAdapterForJibonJapon(this,JibonJaponData);

        recyclerViewForJibonJapon.setAdapter(adapterForJibonJapon);
    }

    @Override
    public void onBackPressed() {




        super.onBackPressed();
        Intent myIntent = new Intent(getApplicationContext(), HomePage.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        this.startActivity(myIntent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
        finish();


    }
}
