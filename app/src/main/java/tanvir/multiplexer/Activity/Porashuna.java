package tanvir.multiplexer.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper;

import java.util.ArrayList;

import tanvir.multiplexer.R;
import tanvir.multiplexer.RecycleerViewAdapter.RecyclerAdapterForPorashuna;

public class Porashuna extends AppCompatActivity {



    private android.support.v7.widget.Toolbar toolbar;


    private RecyclerView recyclerViewForPorashuna;
    public RecyclerAdapterForPorashuna adapterForPorashuna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_porashuna);

        toolbar = findViewById(R.id.toolbarlayoutinporashuna);
        setSupportActionBar(toolbar);


        ArrayList<String> PorashunaData=new ArrayList<>();
        PorashunaData.add("পঞ্চম শ্রেনী সমাপনি পরীক্ষা প্রস্তুতি- পর্ব ৫");
        PorashunaData.add("পঞ্চম শ্রেনী সমাপনি পরীক্ষা প্রস্তুতি- পর্ব ৪ ");

        recyclerViewForPorashuna= findViewById(R.id.RV_Porashuna);

        recyclerViewForPorashuna.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false));

        SnapHelper snapHelperStartPorashuna = new GravitySnapHelper(Gravity.START);
        snapHelperStartPorashuna.attachToRecyclerView(recyclerViewForPorashuna);


        recyclerViewForPorashuna.setHasFixedSize(true);
        adapterForPorashuna = new RecyclerAdapterForPorashuna(this,PorashunaData);

        recyclerViewForPorashuna.setAdapter(adapterForPorashuna);
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
