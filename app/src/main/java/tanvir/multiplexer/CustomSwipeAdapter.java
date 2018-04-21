package tanvir.multiplexer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.bumptech.glide.Glide;

/**
 * Created by USER on 20-Nov-17.
 */

public class CustomSwipeAdapter extends PagerAdapter {

    private int[] images = {R.drawable.japito_jibon_1, R.drawable.japito_jibon_2, R.drawable.shikkhya_sohayika_4};
    private LayoutInflater inflater;
    private Context context;


    public CustomSwipeAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == (LinearLayout) object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);


    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public Object instantiateItem(ViewGroup view, final int position) {

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = inflater.inflate(R.layout.swipelayout, view, false);

        assert item_view != null;
        final ImageView imageView = item_view
                .findViewById(R.id.image);


        Glide.with(context)
                .load(images[position])
                .into(imageView);


        imageView.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Toast.makeText(context, Integer.toString(position), Toast.LENGTH_SHORT).show();
            }
        });

        view.addView(item_view, 0);
        return item_view;
    }
}
