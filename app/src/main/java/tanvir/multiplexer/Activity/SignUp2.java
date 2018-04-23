package tanvir.multiplexer.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;

import java.util.Calendar;

import tanvir.multiplexer.R;

public class SignUp2 extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    private android.support.v7.widget.Toolbar toolbar;

    EditText DOB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2);

        toolbar = findViewById(R.id.toolbarlayoutinmainactivity);
        setSupportActionBar(toolbar);

        DOB = findViewById(R.id.txtDOB);
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

    public void startSignInActivityInSignUp2(View view) {

        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        this.startActivity(myIntent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
        finish();
    }

    @Override
    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {

        DOB.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);



    }

    public void showDatePickerDialog(View view) {

        Calendar now = Calendar.getInstance();
        DatePickerDialog dpd = DatePickerDialog.newInstance(
                SignUp2.this,
                now.get(Calendar.YEAR),
                now.get(Calendar.MONTH),
                now.get(Calendar.DAY_OF_MONTH)
        );
        dpd.show(getFragmentManager(), "Datepickerdialog");
    }
}
