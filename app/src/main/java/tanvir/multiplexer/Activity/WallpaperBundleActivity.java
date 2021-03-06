package tanvir.multiplexer.Activity;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import tanvir.multiplexer.R;

public class WallpaperBundleActivity extends AppCompatActivity {

    private android.support.v7.widget.Toolbar toolbar;

    TextView strikethroughTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper_bundle);

        toolbar = findViewById(R.id.toolbarlayoutinwallpaperBundle);
        setSupportActionBar(toolbar);

        strikethroughTextView=findViewById(R.id.strikeThroughInWallPaperBundle);
        strikethroughTextView.setPaintFlags(strikethroughTextView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent myIntent = new Intent(getApplicationContext(), KheladhulaActivity.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        this.startActivity(myIntent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
        finish();

    }
}
