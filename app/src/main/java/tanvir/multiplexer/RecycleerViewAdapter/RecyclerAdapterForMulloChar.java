package tanvir.multiplexer.RecycleerViewAdapter;

import android.app.Activity;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import tanvir.multiplexer.R;

/**
 * Created by USER on 01-Feb-17.
 */

public class RecyclerAdapterForMulloChar extends RecyclerView.Adapter<RecyclerAdapterForMulloChar.RecyclerViewHolder> {


    private int[] images = {R.drawable.mullochar_1, R.drawable.mullochar_2, R.drawable.mullochar_3};
    private ArrayList<String> data;



    Activity activity;


    public RecyclerAdapterForMulloChar(Activity activity,ArrayList<String> data)
    {

        this.activity = activity;
        this.data=data;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_layout_mullo_char,parent,false);

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }



    @Override
    public void onBindViewHolder(final RecyclerViewHolder holder, int position) {


        holder.strikrthroughTextView.setPaintFlags(holder.strikrthroughTextView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        holder.mullocharTV.setText(data.get(position));

        Glide.with(activity)
                .load(images[position])
                .into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return images.length;
    }


    public  static  class  RecyclerViewHolder extends RecyclerView.ViewHolder
    {

        ImageView imageView;
        TextView strikrthroughTextView;
        TextView mullocharTV;

        public RecyclerViewHolder(View view)
        {
            super(view);

            mullocharTV=view.findViewById(R.id.mulloCharTV);
            strikrthroughTextView=view.findViewById(R.id.strikeThroughText);
            imageView =  view.findViewById(R.id.imgMulloChar);

        }
    }


}
