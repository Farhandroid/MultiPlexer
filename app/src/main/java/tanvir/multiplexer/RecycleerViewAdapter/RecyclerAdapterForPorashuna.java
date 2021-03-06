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

import tanvir.multiplexer.ModelClass.Porashuna;
import tanvir.multiplexer.R;

/**
 * Created by USER on 01-Feb-17.
 */

public class RecyclerAdapterForPorashuna extends RecyclerView.Adapter<RecyclerAdapterForPorashuna.RecyclerViewHolder> {




    Activity activity;
    private ArrayList<Porashuna> porashunaArrayList;


    public RecyclerAdapterForPorashuna(Activity activity, ArrayList<Porashuna> porashunaArrayList)
    {

        this.activity = activity;
        this.porashunaArrayList=porashunaArrayList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_layout_porashuna,parent,false);

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }



    @Override
    public void onBindViewHolder(final RecyclerViewHolder holder, int position) {


        holder.porashunaNewsTV.setText(porashunaArrayList.get(position).getContentTitle());

        Glide.with(activity)
                .load(porashunaArrayList.get(position).getImageUrl())
                .into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return porashunaArrayList.size();
    }


    public  static  class  RecyclerViewHolder extends RecyclerView.ViewHolder
    {

        ImageView imageView;
        TextView porashunaNewsTV;

        public RecyclerViewHolder(View view)
        {
            super(view);


            imageView =  view.findViewById(R.id.imgPorashuna);
            porashunaNewsTV=view.findViewById(R.id.porashunNewsTV);

        }
    }


}
