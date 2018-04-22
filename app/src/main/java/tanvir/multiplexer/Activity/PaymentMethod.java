package tanvir.multiplexer.Activity;

import android.graphics.Color;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import tanvir.multiplexer.R;

import static android.graphics.Color.WHITE;

public class PaymentMethod extends AppCompatActivity {

    ImageButton payWithPin , payWithBikash, payWithRocket , payWithMaxis, payWithVisa, payWithMasterCard;

    boolean isItFirstTime=true;
    boolean isAnyThinSelected=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method);

        payWithPin=findViewById(R.id.payWithPin);
        payWithBikash=findViewById(R.id.payWithBikash);
        payWithRocket=findViewById(R.id.payWithRocket);
        payWithMaxis=findViewById(R.id.payWithMaxis);
        payWithVisa=findViewById(R.id.payWithVisa);
        payWithMasterCard=findViewById(R.id.payWithMasterCard);

        payWithPin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isItFirstTime)
                {
                    isAnyThinSelected=true;
                    isItFirstTime=false;
                    payWithPin.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_red_border, null));
                }
                else
                {
                    isAnyThinSelected=false;
                    payWithPin.setBackgroundColor(Color.WHITE);
                    isItFirstTime=true;
                }

            }
        });

        payWithBikash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isItFirstTime)
                {
                    isAnyThinSelected=true;
                    isItFirstTime=false;
                    payWithBikash.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_red_border, null));
                }
                else
                {
                    isAnyThinSelected=false;
                    payWithBikash.setBackgroundColor(Color.WHITE);
                    isItFirstTime=true;
                }

            }
        });

        payWithRocket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isItFirstTime)
                {
                    isAnyThinSelected=true;
                    isItFirstTime=false;
                    payWithRocket.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_red_border, null));
                }
                else
                {
                    isAnyThinSelected=false;
                    payWithRocket.setBackgroundColor(Color.WHITE);
                    isItFirstTime=true;
                }

            }
        });

        payWithMaxis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isItFirstTime)
                {
                    isAnyThinSelected=true;
                    isItFirstTime=false;
                    payWithMaxis.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_red_border, null));
                }
                else
                {
                    isAnyThinSelected=false;
                    payWithMaxis.setBackgroundColor(Color.WHITE);
                    isItFirstTime=true;
                }

            }
        });

        payWithVisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isItFirstTime)
                {
                    isAnyThinSelected=true;
                    isItFirstTime=false;
                    payWithVisa.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_red_border, null));
                }
                else
                {
                    isAnyThinSelected=false;
                    payWithVisa.setBackgroundColor(Color.WHITE);
                    isItFirstTime=true;
                }

            }
        });

        payWithMasterCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isItFirstTime)
                {
                    isAnyThinSelected=true;
                    isItFirstTime=false;
                    payWithMasterCard.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_red_border, null));
                }
                else
                {
                    isAnyThinSelected=false;
                    payWithMasterCard.setBackgroundColor(Color.WHITE);
                    isItFirstTime=true;
                }

            }
        });
    }

    public void payMent(View view) {

        if (isAnyThinSelected=true)
            Toast.makeText(PaymentMethod.this, "payment Success", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "please select a payment method to pay", Toast.LENGTH_SHORT).show();
    }
}
