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
import tanvir.multiplexer.ModelClass.JapitoJibonMC;

/**
 * Created by USER on 01-Feb-17.
 */

public class RecyclerAdapterForJapitoJibon extends RecyclerView.Adapter<RecyclerAdapterForJapitoJibon.RecyclerViewHolder> {


    ///private int[] images = {R.drawable.japito_jibon_1, R.drawable.japito_jibon_2};

    Activity activity;
    private ArrayList<JapitoJibonMC> japitoJibonMCArrayList;


    public RecyclerAdapterForJapitoJibon(Activity activity, ArrayList<JapitoJibonMC> japitoJibonMCArrayLis) {

        this.activity = activity;
        this.japitoJibonMCArrayList = japitoJibonMCArrayLis;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_layout_japito_jibon, parent, false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(final RecyclerViewHolder holder, int position) {

        holder.japitoJebonNewsTV.setText(japitoJibonMCArrayList.get(position).getContentTitle());
        Glide.with(activity)
                .load(japitoJibonMCArrayList.get(position).getContentUrl())
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return 3;
    }


    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView japitoJebonNewsTV;

        public RecyclerViewHolder(View view) {
            super(view);

            imageView = view.findViewById(R.id.imgJapitoJibon);
            japitoJebonNewsTV = view.findViewById(R.id.japitoJibonNewsTV);

        }
    }


}
