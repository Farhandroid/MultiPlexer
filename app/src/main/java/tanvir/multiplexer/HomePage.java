package tanvir.multiplexer;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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



    private LinearLayoutManager layoutManager;

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



    }

    public void startLoginActivity(View view) {

        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        this.startActivity(myIntent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
        finish();
    }
}
