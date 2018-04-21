package tanvir.multiplexer.RecycleerViewAdapter;

import android.app.Activity;
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

public class RecyclerAdapterForJapitoJibon extends RecyclerView.Adapter<RecyclerAdapterForJapitoJibon.RecyclerViewHolder> {


    private int[] images = {R.drawable.japito_jibon_1, R.drawable.japito_jibon_2};

    Activity activity;
    private ArrayList<String> data;


    public RecyclerAdapterForJapitoJibon(Activity activity, ArrayList<String> data)
    {

        this.activity = activity;
        this.data=data;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_layout_japito_jibon,parent,false);

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }



    @Override
    public void onBindViewHolder(final RecyclerViewHolder holder, int position) {


        holder.japitoJebonNewsTV.setText(data.get(position));

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
        TextView japitoJebonNewsTV;

        public RecyclerViewHolder(View view)
        {
            super(view);


            imageView =  view.findViewById(R.id.imgJapitoJibon);
            japitoJebonNewsTV=view.findViewById(R.id.japitoJibonNewsTV);

        }
    }


}
