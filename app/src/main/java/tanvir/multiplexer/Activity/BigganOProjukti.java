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
import tanvir.multiplexer.RecycleerViewAdapter.RecyclerAdapterForBigganOProjukti;

public class BigganOProjukti extends AppCompatActivity {

    private android.support.v7.widget.Toolbar toolbar;


    private RecyclerView recyclerViewForBigganOProjukti;
    public RecyclerAdapterForBigganOProjukti adapterForBigganOProjukti;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biggan_oprojukti);

        toolbar = findViewById(R.id.toolbarlayoutinbigganOProjukti);
        setSupportActionBar(toolbar);

        ArrayList<String> BigganOProjuktiData=new ArrayList<>();
        BigganOProjuktiData.add("পঞ্চম শ্রেনী সমাপনি পরীক্ষা প্রস্তুতি- পর্ব ৫");
        BigganOProjuktiData.add("পঞ্চম শ্রেনী সমাপনি পরীক্ষা প্রস্তুতি- পর্ব ৪ ");

        recyclerViewForBigganOProjukti= findViewById(R.id.RV_BigganOProjukti);

        recyclerViewForBigganOProjukti.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false));

        SnapHelper snapHelperStartBigganOProjukti = new GravitySnapHelper(Gravity.START);
        snapHelperStartBigganOProjukti.attachToRecyclerView(recyclerViewForBigganOProjukti);

        recyclerViewForBigganOProjukti.setHasFixedSize(true);
        adapterForBigganOProjukti = new RecyclerAdapterForBigganOProjukti(this,BigganOProjuktiData);

        recyclerViewForBigganOProjukti.setAdapter(adapterForBigganOProjukti);
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
