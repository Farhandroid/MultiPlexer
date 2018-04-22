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
import tanvir.multiplexer.RecycleerViewAdapter.RecyclerAdapterForAuttohashi;

public class AuttoHashiActivity extends AppCompatActivity {

    private android.support.v7.widget.Toolbar toolbar;


    private RecyclerView recyclerViewForAuttohashi;
    public RecyclerAdapterForAuttohashi adapterForAuttohashi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autto_hashi);

        toolbar = findViewById(R.id.toolbarlayoutinauttohashi);
        setSupportActionBar(toolbar);


        ArrayList<String> AuttohashiData=new ArrayList<>();
        AuttohashiData.add("পঞ্চম শ্রেনী সমাপনি পরীক্ষা প্রস্তুতি- পর্ব ৫");
        AuttohashiData.add("পঞ্চম শ্রেনী সমাপনি পরীক্ষা প্রস্তুতি- পর্ব ৪ ");

        recyclerViewForAuttohashi= findViewById(R.id.RV_Auttoahshi);

        recyclerViewForAuttohashi.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false));

        SnapHelper snapHelperStartAuttohashi = new GravitySnapHelper(Gravity.START);
        snapHelperStartAuttohashi.attachToRecyclerView(recyclerViewForAuttohashi);


        recyclerViewForAuttohashi.setHasFixedSize(true);
        adapterForAuttohashi = new RecyclerAdapterForAuttohashi(this,AuttohashiData);

        recyclerViewForAuttohashi.setAdapter(adapterForAuttohashi);
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
