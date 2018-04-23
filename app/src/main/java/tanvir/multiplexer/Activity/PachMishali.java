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
import tanvir.multiplexer.RecycleerViewAdapter.RecyclerAdapterForPachMishali;

public class PachMishali extends AppCompatActivity {

    private android.support.v7.widget.Toolbar toolbar;


    private RecyclerView recyclerViewForPachMishali;
    public RecyclerAdapterForPachMishali adapterForPachMishali;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pach_mishali);

        toolbar = findViewById(R.id.toolbarlayoutinpachMishali);
        setSupportActionBar(toolbar);


        ArrayList<String> PachMishaliData=new ArrayList<>();
        PachMishaliData.add("পঞ্চম শ্রেনী সমাপনি পরীক্ষা প্রস্তুতি- পর্ব ৫");
        PachMishaliData.add("পঞ্চম শ্রেনী সমাপনি পরীক্ষা প্রস্তুতি- পর্ব ৪ ");

        recyclerViewForPachMishali= findViewById(R.id.RV_PachMishali);

        recyclerViewForPachMishali.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false));

        SnapHelper snapHelperStartPachMishali = new GravitySnapHelper(Gravity.START);
        snapHelperStartPachMishali.attachToRecyclerView(recyclerViewForPachMishali);


        recyclerViewForPachMishali.setHasFixedSize(true);
        adapterForPachMishali = new RecyclerAdapterForPachMishali(this,PachMishaliData);

        recyclerViewForPachMishali.setAdapter(adapterForPachMishali);
    }

    @Override
    public void onBackPressed() {




        super.onBackPressed();
        Intent myIntent = new Intent(getApplicationContext(), HomePage.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        this.startActivity(myIntent);
        overridePendingTransition(R.anim.right_in, R.anim.right_out);
        finish();


    }
}
