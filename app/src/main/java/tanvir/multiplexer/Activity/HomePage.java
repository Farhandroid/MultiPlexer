package tanvir.multiplexer.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper;
import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;

import tanvir.multiplexer.CustomSwipeAdapter;
import tanvir.multiplexer.R;
import tanvir.multiplexer.RecycleerViewAdapter.RecyclerAdapterForJapitoJibon;
import tanvir.multiplexer.RecycleerViewAdapter.RecyclerAdapterForMulloChar;
import tanvir.multiplexer.RecycleerViewAdapter.RecyclerAdapterForSeraChobi;
import tanvir.multiplexer.RecycleerViewAdapter.RecyclerAdapterForShikkhaSohayika;
import tanvir.multiplexer.RecycleerViewAdapter.RecyclerAdapterForShocolChobi;

public class HomePage extends AppCompatActivity {


    Context context;


    BottomNavigationView bottomNavigationView;

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

        context=HomePage.this;

        toolbar = findViewById(R.id.toolbarlayoutinhome_page);
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.viewPager);
        customSwipeAdapter =new CustomSwipeAdapter(this);
        viewPager.setAdapter(customSwipeAdapter);
        CirclePageIndicator indicator = findViewById(R.id.indicator);

        indicator.setViewPager(viewPager);

        final float density = getResources().getDisplayMetrics().density;

        indicator.setRadius(5 * density);



        recyclerViewForSeraChobi = findViewById(R.id.RV_SeraChobi);

        recyclerViewForSeraChobi.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false));

        SnapHelper snapHelperStart = new GravitySnapHelper(Gravity.START);
        snapHelperStart.attachToRecyclerView(recyclerViewForSeraChobi);

        recyclerViewForSeraChobi.setHasFixedSize(true);
        adapterForSeraChobi = new RecyclerAdapterForSeraChobi(this);

        recyclerViewForSeraChobi.setAdapter(adapterForSeraChobi);



        //Recyclerview for japito jibon

        ArrayList<String> japitoJibonData=new ArrayList<>();
        japitoJibonData.add("মোবাইল আসক্তি ডেকে আনছে চরম বিপর্যয়");
        japitoJibonData.add("মোবাইল ফোন ব্যাবহারে যে বিষয়গুলো মাথায় রাখা উচিৎ ");




        recyclerViewForJapitoJibon= findViewById(R.id.RV_japitoJibon);

        recyclerViewForJapitoJibon.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false));

        SnapHelper snapHelperStartJapitoJibon = new GravitySnapHelper(Gravity.START);
        snapHelperStartJapitoJibon.attachToRecyclerView(recyclerViewForJapitoJibon);


        recyclerViewForJapitoJibon.setHasFixedSize(true);
        adapterForJapitoJibon = new RecyclerAdapterForJapitoJibon(this,japitoJibonData);

        recyclerViewForJapitoJibon.setAdapter(adapterForJapitoJibon);

        //Recyclerview for mullochar

         ArrayList<String> mulloCharData=new ArrayList<>();
        mulloCharData.add("স্মার্ট থীম প্যাক");
        mulloCharData.add("এক্সক্লুসিভ গান ");
        mulloCharData.add("লাইভ কনসার্ট");

        recyclerViewForMulloChar= findViewById(R.id.RV_mulloChar);

        recyclerViewForMulloChar.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false));

        SnapHelper snapHelperStartMulloChar = new GravitySnapHelper(Gravity.START);
        snapHelperStartMulloChar.attachToRecyclerView(recyclerViewForMulloChar);

        recyclerViewForMulloChar.setHasFixedSize(true);
        adapterForMulloChar = new RecyclerAdapterForMulloChar(this,mulloCharData);

        recyclerViewForMulloChar.setAdapter(adapterForMulloChar);


        //Recyclerview for ShikkhaSohayika

        ArrayList<String> shikkhaSohayikaData=new ArrayList<>();
        shikkhaSohayikaData.add("পঞ্চম শ্রেনী সমাপনি পরীক্ষা প্রস্তুতি- পর্ব ৫");
        shikkhaSohayikaData.add("পঞ্চম শ্রেনী সমাপনি পরীক্ষা প্রস্তুতি- পর্ব ৪");

        recyclerViewForShikkhaSohayika= findViewById(R.id.RV_ShikkhaSohayika);

        recyclerViewForShikkhaSohayika.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false));

        SnapHelper snapHelperStartShikkhaSohayika= new GravitySnapHelper(Gravity.START);
        snapHelperStartShikkhaSohayika.attachToRecyclerView(recyclerViewForShikkhaSohayika);

        recyclerViewForShikkhaSohayika.setHasFixedSize(true);
        adapterForShikkhaSohayika = new RecyclerAdapterForShikkhaSohayika(this,shikkhaSohayikaData);

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

        ///Bottom navigation

        bottomNavigationView=findViewById(R.id.btmNavigation);
        bottomNavigationView.getMenu().findItem(R.id.home_bottom_navigation).setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {





                return true;
            }
        });



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

    public void startSportActivity(View view) {

        Intent myIntent = new Intent(getApplicationContext(), Sports.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        this.startActivity(myIntent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
        finish();


    }

    public void startPorashunaActivity(View view) {
        Intent myIntent = new Intent(getApplicationContext(), Porashuna.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        this.startActivity(myIntent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
        finish();

    }

    public void startAuttoHashiActivity(View view) {

        Intent myIntent = new Intent(getApplicationContext(), AuttoHashiActivity.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        this.startActivity(myIntent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
        finish();


    }

    public void startJibonJaponActivity(View view) {

        Intent myIntent = new Intent(getApplicationContext(), JibonJapon.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        this.startActivity(myIntent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
        finish();

    }

    public void startPachMishaliActivity(View view) {

        Intent myIntent = new Intent(getApplicationContext(), PachMishali.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        this.startActivity(myIntent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
        finish();


    }

    public void startBigganOProjuktiActivity(View view) {

        Intent myIntent = new Intent(getApplicationContext(), BigganOProjukti.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        this.startActivity(myIntent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
        finish();

    }

    public void startCartoonActivity(View view) {

        Intent myIntent = new Intent(getApplicationContext(), Cartoon.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        this.startActivity(myIntent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
        finish();

    }
}
