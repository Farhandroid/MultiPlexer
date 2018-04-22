package tanvir.multiplexer.Activity;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import tanvir.multiplexer.R;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.IV);
        Glide.with(this).load(R.drawable.symphoni).into(imageView);
    }

    public void startSignUpActivity(View view) {


            Intent myIntent = new Intent(getApplicationContext(), SignUpActivity.class);
            myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            this.startActivity(myIntent);
            overridePendingTransition(R.anim.left_in, R.anim.left_out);
            finish();

    }

    public void startSignInActivity(View view) {


            Intent myIntent = new Intent(getApplicationContext(), SignInActivity.class);
            myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            this.startActivity(myIntent);
            overridePendingTransition(R.anim.left_in, R.anim.left_out);
            finish();




    }




}
