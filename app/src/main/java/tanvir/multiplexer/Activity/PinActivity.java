package tanvir.multiplexer.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.goodiebag.pinview.Pinview;

import tanvir.multiplexer.R;

public class PinActivity extends AppCompatActivity {
        //Pinview pinview;
        private android.support.v7.widget.Toolbar toolbar;

        RadioGroup radioGroup;
        RadioButton radioButton1,radioButton2,radioButton3,radioButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);

        toolbar = findViewById(R.id.toolbarlayoutinpin);
        setSupportActionBar(toolbar);

        radioGroup=findViewById(R.id.radioGroupInPinActivity);
        radioButton1=findViewById(R.id.firstRadioButton);
        radioButton2=findViewById(R.id.secondRadioButton);
        radioButton3=findViewById(R.id.thirdRadioButton);
        radioButton4=findViewById(R.id.fourthRadioButton);


        //pinview=findViewById(R.id.pinview);

        /*pinview.setPinViewEventListener(new Pinview.PinViewEventListener() {
            @Override
            public void onDataEntered(Pinview pinview, boolean b) {

                ///if (pinview.getValue().toString().contains("1234"))
                ///{
                    ///Toast.makeText(PinActivity.this, "Pin matches successfully", Toast.LENGTH_SHORT).show();
                    Intent myIntent = new Intent(getApplicationContext(), SignUp2.class);
                    myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                    PinActivity.this.startActivity(myIntent);
                    overridePendingTransition(R.anim.left_in, R.anim.left_out);
                    finish();
                //}
                //else
                    ///Toast.makeText(PinActivity.this, "Pin is wrong ", Toast.LENGTH_SHORT).show();
            }
        });*/
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent myIntent = new Intent(getApplicationContext(), SignUpActivity.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        this.startActivity(myIntent);
        overridePendingTransition(R.anim.right_in, R.anim.right_out);
        finish();

    }
}
