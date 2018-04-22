package tanvir.multiplexer.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import tanvir.multiplexer.R;

public class SignInActivity extends AppCompatActivity {


    EditText userName , password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        userName=findViewById(R.id.txtUserName);
        password=findViewById(R.id.txtpassword);



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

    public void startForgotPasswordActivity(View view) {

        Intent myIntent = new Intent(getApplicationContext(), ForgetPasswordActivity.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        this.startActivity(myIntent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
        finish();

    }

    public void startHomePage(View view) {



        checkCredintial();

    }

    public void checkCredintial()
    {

        if (password.getText().toString().equals("12345") && userName.getText().toString().equals("admin"))
        {
            homePageStart();
        }
        else
        {
            Toast.makeText(this, "Sorry\n Your credintial is wrong ", Toast.LENGTH_SHORT).show();
        }
    }

    public void homePageStart()
    {
        Intent myIntent = new Intent(getApplicationContext(), HomePage.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        this.startActivity(myIntent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
        finish();
    }
}
