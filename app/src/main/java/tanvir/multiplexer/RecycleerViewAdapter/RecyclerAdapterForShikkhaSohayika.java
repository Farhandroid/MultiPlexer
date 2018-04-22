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

import tanvir.multiplexer.ModelClass.ShikkhaSohaYika;
import tanvir.multiplexer.R;

/**
 * Created by USER on 01-Feb-17.
 */

public class RecyclerAdapterForShikkhaSohayika extends RecyclerView.Adapter<RecyclerAdapterForShikkhaSohayika.RecyclerViewHolder> {


    ArrayList<ShikkhaSohaYika> shikkhaSohaYikaArrayList;
    Activity activity;

    public RecyclerAdapterForShikkhaSohayika(Activity activity,ArrayList<ShikkhaSohaYika> shikkhaSohaYikaArrayList)
    {

        this.activity = activity;
        this.shikkhaSohaYikaArrayList=shikkhaSohaYikaArrayList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_layout_shikkha_sohayika,parent,false);

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(final RecyclerViewHolder holder, int position) {

        holder.news.setText(shikkhaSohaYikaArrayList.get(position).getContentTitle());

        Glide.with(activity)
                .load(shikkhaSohaYikaArrayList.get(position).getImageURL()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return shikkhaSohaYikaArrayList.size();
    }


    public  static  class  RecyclerViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView news;

        public RecyclerViewHolder(View view)
        {
            super(view);

            news=view.findViewById(R.id.newsTV);
            imageView =  view.findViewById(R.id.imgShikkhaSohayika);

        }
    }

}
