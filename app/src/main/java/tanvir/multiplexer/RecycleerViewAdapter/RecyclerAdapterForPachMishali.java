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

import tanvir.multiplexer.ModelClass.PacMishali;
import tanvir.multiplexer.R;

/**
 * Created by USER on 01-Feb-17.
 */

public class RecyclerAdapterForPachMishali extends RecyclerView.Adapter<RecyclerAdapterForPachMishali.RecyclerViewHolder> {



    Activity activity;
    private ArrayList<PacMishali> pacMishaliArrayList;


    public RecyclerAdapterForPachMishali(Activity activity, ArrayList<PacMishali> pacMishaliArrayList)
    {
        this.activity = activity;
        this.pacMishaliArrayList=pacMishaliArrayList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_layout_pach_mishali,parent,false);

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }



    @Override
    public void onBindViewHolder(final RecyclerViewHolder holder, int position) {
        holder.pachMishaliNewsTV.setText(pacMishaliArrayList.get(position).getContentTitle());
        Glide.with(activity)
                .load(pacMishaliArrayList.get(position).getImageUrl())
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return pacMishaliArrayList.size();
    }


    public  static  class  RecyclerViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView pachMishaliNewsTV;

        public RecyclerViewHolder(View view)
        {
            super(view);
            imageView=view.findViewById(R.id.imgPachMishali);
            pachMishaliNewsTV=view.findViewById(R.id.PachMishaliNewsTV);
        }
    }


}
