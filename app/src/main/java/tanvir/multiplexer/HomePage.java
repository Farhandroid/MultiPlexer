package tanvir.multiplexer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.Gravity;
import android.view.View;

import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper;

public class HomePage extends AppCompatActivity {

    private android.support.v7.widget.Toolbar toolbar;
    CustomSwipeAdapter customSwipeAdapter;
    ViewPager viewPager;

    private RecyclerView recyclerViewForSeraChobi;
    public RecyclerAdapterForSeraChobi adapterForSeraChobi;

    private RecyclerView recyclerViewForJapitoJibon;
    public RecyclerAdapterForJapitoJibon adapterForJapitoJibon;

    private RecyclerView recyclerViewForMulloChar;
    public RecyclerAdapterForMulloChar adapterForMulloChar;

    private RecyclerView recyclerViewForShikkhaSohayika;
    public RecyclerAdapterForShikkhaSohayika adapterForShikkhaSohayika;

    private RecyclerView recyclerViewForShocolChobi;
    public RecyclerAdapterForShocolChobi adapterForShocolChobi;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        toolbar = findViewById(R.id.toolbarlayoutinhome_page);
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.viewPager);
        customSwipeAdapter =new CustomSwipeAdapter(this);
        viewPager.setAdapter(customSwipeAdapter);



        recyclerViewForSeraChobi = findViewById(R.id.RV_SeraChobi);

        recyclerViewForSeraChobi.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false));

        SnapHelper snapHelperStart = new GravitySnapHelper(Gravity.START);
        snapHelperStart.attachToRecyclerView(recyclerViewForSeraChobi);

        recyclerViewForSeraChobi.setHasFixedSize(true);
        adapterForSeraChobi = new RecyclerAdapterForSeraChobi(this);

        recyclerViewForSeraChobi.setAdapter(adapterForSeraChobi);



        //Recyclerview for japito jibon


        recyclerViewForJapitoJibon= findViewById(R.id.RV_japitoJibon);

        recyclerViewForJapitoJibon.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false));

        SnapHelper snapHelperStartJapitoJibon = new GravitySnapHelper(Gravity.START);
        snapHelperStartJapitoJibon.attachToRecyclerView(recyclerViewForJapitoJibon);

        recyclerViewForJapitoJibon.setHasFixedSize(true);
        adapterForJapitoJibon = new RecyclerAdapterForJapitoJibon(this);

        recyclerViewForJapitoJibon.setAdapter(adapterForJapitoJibon);

        //Recyclerview for mullochar

        recyclerViewForMulloChar= findViewById(R.id.RV_mulloChar);

        recyclerViewForMulloChar.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false));

        SnapHelper snapHelperStartMulloChar = new GravitySnapHelper(Gravity.START);
        snapHelperStartMulloChar.attachToRecyclerView(recyclerViewForMulloChar);

        recyclerViewForMulloChar.setHasFixedSize(true);
        adapterForMulloChar = new RecyclerAdapterForMulloChar(this);

        recyclerViewForMulloChar.setAdapter(adapterForMulloChar);


        //Recyclerview for ShikkhaSohayika

        recyclerViewForShikkhaSohayika= findViewById(R.id.RV_ShikkhaSohayika);

        recyclerViewForShikkhaSohayika.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false));

        SnapHelper snapHelperStartShikkhaSohayika= new GravitySnapHelper(Gravity.START);
        snapHelperStartShikkhaSohayika.attachToRecyclerView(recyclerViewForShikkhaSohayika);

        recyclerViewForShikkhaSohayika.setHasFixedSize(true);
        adapterForShikkhaSohayika = new RecyclerAdapterForShikkhaSohayika(this);

        recyclerViewForShikkhaSohayika.setAdapter(adapterForShikkhaSohayika);

        //Recyclerview for ShocholChobi

        recyclerViewForShocolChobi= findViewById(R.id.RV_ShocolChobi);

        recyclerViewForShocolChobi.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false));

        SnapHelper snapHelperStartShocolChobi= new GravitySnapHelper(Gravity.START);
        snapHelperStartShocolChobi.attachToRecyclerView(recyclerViewForShocolChobi);

        recyclerViewForShocolChobi.setHasFixedSize(true);
        adapterForShocolChobi = new RecyclerAdapterForShocolChobi(this);

        recyclerViewForShocolChobi.setAdapter(adapterForShocolChobi);



    }

    public void startLoginActivity(View view) {

        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        this.startActivity(myIntent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        this.startActivity(myIntent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
        finish();

    }
}
