package tanvir.multiplexer.Activity;

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
}
