package tanvir.multiplexer;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by USER on 01-Feb-17.
 */

public class RecyclerAdapterForJapitoJibon extends RecyclerView.Adapter<RecyclerAdapterForJapitoJibon.RecyclerViewHolder> {


    private int[] images = {R.drawable.image_1, R.drawable.image_2, R.drawable.image_3, R.drawable.image_4};

    Activity activity;


    public RecyclerAdapterForJapitoJibon(Activity activity)
    {

        this.activity = activity;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_layout_japito_jibon,parent,false);

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


            imageView =  view.findViewById(R.id.imgJapitoJibon);

        }
    }


}
