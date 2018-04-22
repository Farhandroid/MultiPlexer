package tanvir.multiplexer.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper;

import java.util.ArrayList;

import tanvir.multiplexer.Activity.MainActivity;
import tanvir.multiplexer.R;
import tanvir.multiplexer.RecycleerViewAdapter.RecyclerAdapterForKheladhulaCricket;
import tanvir.multiplexer.RecycleerViewAdapter.RecyclerAdapterForMulloChar;
import tanvir.multiplexer.RecycleerViewAdapter.RecyclerAdapterForSorbosheshSongbadCricketfragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class Cricket_fragment extends Fragment {

    private RecyclerView recyclerViewForWallPaper;
    private RecyclerView.Adapter adapterForWallPaper;

    private RecyclerView recyclerViewForSorbosheshSongbad;
    private RecyclerView.Adapter adapterForSorbosheshSongbad;


    public Cricket_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cricket_fragment, container, false);



        //Recyclerview for cricket wallpaper

        ArrayList<String> wallpaperData=new ArrayList<>();
        wallpaperData.add("সওয়ালপেপার বান্ডিল");
        wallpaperData.add("এক্সক্লুসিভ গান ");
        wallpaperData.add("এক্সক্লুসিভ মুস্তাফিজ");

        recyclerViewForWallPaper= view.findViewById(R.id.RV_wallpaper_cricket_fragment);

        recyclerViewForWallPaper.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false));

        SnapHelper snapHelperStartMulloChar = new GravitySnapHelper(Gravity.START);
        snapHelperStartMulloChar.attachToRecyclerView(recyclerViewForWallPaper);

        recyclerViewForWallPaper.setHasFixedSize(true);
        adapterForWallPaper = new RecyclerAdapterForKheladhulaCricket(getActivity(),wallpaperData);

        recyclerViewForWallPaper.setAdapter(adapterForWallPaper);


        //Recyclerview for sorboshesh songbad

        ArrayList<String> SorbosheshSongbadData=new ArrayList<>();
        SorbosheshSongbadData.add("বাঘের গর্জন শুনেছে বিশ্ব");
        SorbosheshSongbadData.add("মুস্তাফিজে কুপকাত ভারত ");


        recyclerViewForSorbosheshSongbad= view.findViewById(R.id.RV_sorboshesh_songbad_cricket_fragment);

        recyclerViewForSorbosheshSongbad.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayoutManager.VERTICAL, false));

        SnapHelper snapHelperStartSorbosheshSongbad = new GravitySnapHelper(Gravity.START);
        snapHelperStartSorbosheshSongbad.attachToRecyclerView(recyclerViewForSorbosheshSongbad);

        recyclerViewForSorbosheshSongbad.setHasFixedSize(true);
        adapterForSorbosheshSongbad = new RecyclerAdapterForSorbosheshSongbadCricketfragment(getActivity(),SorbosheshSongbadData);

        recyclerViewForSorbosheshSongbad.setAdapter(adapterForSorbosheshSongbad);




        return view;
    }



}
