package tanvir.multiplexer.Activity;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import tanvir.multiplexer.Fragment.Cricket_fragment;
import tanvir.multiplexer.Fragment.Football_fragment;
import tanvir.multiplexer.Fragment.other_sports_fragment;
import tanvir.multiplexer.R;
import tanvir.multiplexer.ViewpagerAdapter.ViewPagerAdapter;

public class Sports extends AppCompatActivity {

    private android.support.v7.widget.Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        toolbar = findViewById(R.id.toolbarlayoutinsports);
        setSupportActionBar(toolbar);

        context = Sports.this;

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPagerInSports);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setOffscreenPageLimit(3);

        viewPagerAdapter.addFragments(new Cricket_fragment(), "ক্রিকেট");
        viewPagerAdapter.addFragments(new Football_fragment(), "ফুটবল");
        viewPagerAdapter.addFragments(new other_sports_fragment(), "অন্যান্য");


        viewPager.setAdapter(viewPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);


        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {


            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {


                if (position == 1) {

                    ///Toast.makeText(context, "Safe", Toast.LENGTH_SHORT).show();
                } else {

                    ///Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                }


            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }

        });
    }


    @Override
    public void onBackPressed() {

        int count = getFragmentManager().getBackStackEntryCount();

        if (count == 0) {
            super.onBackPressed();
            Intent myIntent = new Intent(getApplicationContext(), HomePage.class);
            myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            this.startActivity(myIntent);
            overridePendingTransition(R.anim.left_in, R.anim.left_out);
            finish();
            //additional code
        } else {
            getFragmentManager().popBackStack();
        }

    }
}
