package tanvir.multiplexer.ViewpagerAdapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by USER on 01-Mar-18.
 */

public class ViewPagerAdapterForGallery extends FragmentStatePagerAdapter {

    ArrayList<Fragment> fragments = new ArrayList<>();
    ArrayList<String> tabTitles = new ArrayList<>();


    public void addFragments(Fragment fragment, String titles) {
        this.fragments.add(fragment);
        this.tabTitles.add(titles);
    }

    public ViewPagerAdapterForGallery(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles.get(position);
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;

    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        /*frags[position] = (Fragment) super.instantiateItem(container, position);
        return frags[position];*/

        Fragment fragment=(Fragment) super.instantiateItem(container, position);
        fragments.remove(position);
        fragments.add(position,fragment);

        return fragments.get(position);
    }
}
