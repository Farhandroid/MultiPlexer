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

import tanvir.multiplexer.ModelClass.Auttohashi;
import tanvir.multiplexer.R;

/**
 * Created by USER on 01-Feb-17.
 */

public class RecyclerAdapterForAuttohashi extends RecyclerView.Adapter<RecyclerAdapterForAuttohashi.RecyclerViewHolder> {


    ///private int[] images = {R.drawable.shikkhya_sohayika_1, R.drawable.shikkhya_sohayika_2};

    Activity activity;
    private ArrayList<Auttohashi> auttohashiArrayList;


    public RecyclerAdapterForAuttohashi(Activity activity, ArrayList<Auttohashi> auttohashiArrayList)
    {

        this.activity = activity;
        this.auttohashiArrayList=auttohashiArrayList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_layout_auttohashi,parent,false);

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }



    @Override
    public void onBindViewHolder(final RecyclerViewHolder holder, int position) {


        holder.auttohashiNewsTV.setText(auttohashiArrayList.get(position).getContentTitle());

        Glide.with(activity)
                .load(auttohashiArrayList.get(position).getImageUrl())
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return auttohashiArrayList.size();
    }


    public  static  class  RecyclerViewHolder extends RecyclerView.ViewHolder
    {

        ImageView imageView;
        TextView auttohashiNewsTV;

        public RecyclerViewHolder(View view)
        {
            super(view);
            imageView =  view.findViewById(R.id.imgauttohashi);
            auttohashiNewsTV=view.findViewById(R.id.auttohashiNewsTV);
        }
    }


}
