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
import tanvir.multiplexer.RecycleerViewAdapter.RecyclerAdapterForCartoon;

public class Cartoon extends AppCompatActivity {

    private android.support.v7.widget.Toolbar toolbar;


    private RecyclerView recyclerViewForCartoon;
    public RecyclerAdapterForCartoon adapterForCartoon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartoon);

        toolbar = findViewById(R.id.toolbarlayoutincartoon);
        setSupportActionBar(toolbar);


        ArrayList<String> CartoonData=new ArrayList<>();
        CartoonData.add("পঞ্চম শ্রেনী সমাপনি পরীক্ষা প্রস্তুতি- পর্ব ৫");
        CartoonData.add("পঞ্চম শ্রেনী সমাপনি পরীক্ষা প্রস্তুতি- পর্ব ৪ ");

        recyclerViewForCartoon= findViewById(R.id.RV_Cartoon);

        recyclerViewForCartoon.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false));

        SnapHelper snapHelperStartCartoon = new GravitySnapHelper(Gravity.START);
        snapHelperStartCartoon.attachToRecyclerView(recyclerViewForCartoon);


        recyclerViewForCartoon.setHasFixedSize(true);
        adapterForCartoon = new RecyclerAdapterForCartoon(this,CartoonData);

        recyclerViewForCartoon.setAdapter(adapterForCartoon);
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
