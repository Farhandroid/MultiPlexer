package tanvir.multiplexer.RecycleerViewAdapter;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import tanvir.multiplexer.Activity.PaymentMethod;
import tanvir.multiplexer.Activity.SignUpActivity;
import tanvir.multiplexer.ModelClass.MulloChar;
import tanvir.multiplexer.R;

/**
 * Created by USER on 01-Feb-17.
 */

public class RecyclerAdapterForMulloChar extends RecyclerView.Adapter<RecyclerAdapterForMulloChar.RecyclerViewHolder> {


    ///private int[] images = {R.drawable.mullochar_1, R.drawable.mullochar_2, R.drawable.mullochar_3};

    Activity activity;
    ArrayList<MulloChar> mulloCharArrayList;

    public RecyclerAdapterForMulloChar(Activity activity, ArrayList<MulloChar> mulloCharArrayList) {
        this.activity = activity;
        this.mulloCharArrayList = mulloCharArrayList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_layout_mullo_char, parent, false);

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view,activity);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(final RecyclerViewHolder holder, int position) {
        holder.strikrthroughTextView.setPaintFlags(holder.strikrthroughTextView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        holder.mullocharTV.setText(mulloCharArrayList.get(position).getContentTile());
        holder.strikrthroughTextView.setText(Integer.toString(mulloCharArrayList.get(position).getPreviousPrice()));
        holder.newPriceTV.setText(Integer.toString((mulloCharArrayList.get(position).getNewPrice())));

        Glide.with(activity)
                .load(mulloCharArrayList.get(position).getImageUrl())
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return mulloCharArrayList.size();
    }


    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView strikrthroughTextView;
        TextView mullocharTV, newPriceTV;

        Activity activity;

        public RecyclerViewHolder(View view, final Activity activity) {
            super(view);
            mullocharTV = view.findViewById(R.id.mulloCharTV);
            strikrthroughTextView = view.findViewById(R.id.strikeThroughTextMulloChar);
            imageView = view.findViewById(R.id.imgMulloChar);
            newPriceTV = view.findViewById(R.id.newPriceTV);

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent myIntent = new Intent(activity, PaymentMethod.class);
                    myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                    activity.startActivity(myIntent);
                    activity.overridePendingTransition(R.anim.left_in, R.anim.left_out);
                    activity.finish();

                }
            });

        }
    }


}
