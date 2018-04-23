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

import tanvir.multiplexer.ModelClass.BigganOProjukti;
import tanvir.multiplexer.R;

/**
 * Created by USER on 01-Feb-17.
 */

public class RecyclerAdapterForBigganOProjukti extends RecyclerView.Adapter<RecyclerAdapterForBigganOProjukti.RecyclerViewHolder> {



    Activity activity;
    private ArrayList<BigganOProjukti> bigganOProjuktiArrayList;


    public RecyclerAdapterForBigganOProjukti(Activity activity,  ArrayList<BigganOProjukti> bigganOProjuktiArrayList)
    {

        this.activity = activity;
        this.bigganOProjuktiArrayList=bigganOProjuktiArrayList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_layout_biggan_o_projukti,parent,false);

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }



    @Override
    public void onBindViewHolder(final RecyclerViewHolder holder, int position) {


        holder.bigganOProjuktiNewsTV.setText(bigganOProjuktiArrayList.get(position).getContentTitle());

        Glide.with(activity)
                .load(bigganOProjuktiArrayList.get(position).getImageUrl())
                .into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return bigganOProjuktiArrayList.size();
    }


    public  static  class  RecyclerViewHolder extends RecyclerView.ViewHolder
    {

        ImageView imageView;
        TextView bigganOProjuktiNewsTV;

        public RecyclerViewHolder(View view)
        {
            super(view);


            imageView =  view.findViewById(R.id.imgbiggan_o_projukti);
            bigganOProjuktiNewsTV=view.findViewById(R.id.Biggan_o_projuktiNewsTV);

        }
    }


}
