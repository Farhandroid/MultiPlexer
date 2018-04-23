package tanvir.multiplexer.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

import tanvir.multiplexer.ModelClass.GoromKhobor;
import tanvir.multiplexer.R;

public class NewsDescriptionActivity extends AppCompatActivity implements Serializable {

    ImageView newsImageView;
    TextView newsTitle , newsPublishedAt , newsDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_description);

        GoromKhobor object = (GoromKhobor) getIntent().getSerializableExtra("Data");

        newsImageView=findViewById(R.id.imgNewsPaperinNewsDescription);
        newsTitle=findViewById(R.id.newsTitleInNewsDetailActivity);
        newsPublishedAt=findViewById(R.id.newsPublishedatNewsDetailsActivity);
        newsDescription=findViewById(R.id.newsdescriptionInNewsPaperActivity);

        newsTitle.setText(object.getContentTitle());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent myIntent = new Intent(getApplicationContext(), GoromKhoborActivity.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        this.startActivity(myIntent);
        overridePendingTransition(R.anim.right_in , R.anim.right_out);
        finish();

    }
}
