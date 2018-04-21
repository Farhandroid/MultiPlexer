package tanvir.multiplexer.RecycleerViewAdapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import tanvir.multiplexer.R;

/**
 * Created by USER on 01-Feb-17.
 */

public class RecyclerAdapterForSeraChobi extends RecyclerView.Adapter<RecyclerAdapterForSeraChobi.RecyclerViewHolder> {


    private int[] images = {R.drawable.sera_chobi_1, R.drawable.sera_chobi_2, R.drawable.sera_chobi_3, R.drawable.sera_chobi_4};

    Activity activity;


    public RecyclerAdapterForSeraChobi(Activity activity)
    {

        this.activity = activity;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_layout_sera_chobi,parent,false);

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }



    @Override
    public void onBindViewHolder(final RecyclerViewHolder holder, int position) {




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

        public RecyclerViewHolder(View view)
        {
            super(view);


            imageView = (ImageView) view.findViewById(R.id.img);

        }
    }


}
