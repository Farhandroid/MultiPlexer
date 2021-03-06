package tanvir.multiplexer.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import tanvir.multiplexer.Activity.BigganOProjuktiActivity;
import tanvir.multiplexer.Activity.GoromKhoborActivity;
import tanvir.multiplexer.Activity.MainActivity;
import tanvir.multiplexer.ModelClass.BigganOProjukti;
import tanvir.multiplexer.ModelClass.GoromKhobor;
import tanvir.multiplexer.ModelClass.Kheladhula_Cricket;
import tanvir.multiplexer.R;
import tanvir.multiplexer.RecycleerViewAdapter.RecyclerAdapterForBigganOProjukti;
import tanvir.multiplexer.RecycleerViewAdapter.RecyclerAdapterForKheladhulaCricket;
import tanvir.multiplexer.RecycleerViewAdapter.RecyclerAdapterForMulloChar;
import tanvir.multiplexer.RecycleerViewAdapter.RecyclerAdapterForSorbosheshSongbadCricketfragment;
import tanvir.multiplexer.helper.Endpoints;

/**
 * A simple {@link Fragment} subclass.
 */
public class Cricket_fragment extends Fragment {

    private RecyclerView recyclerViewForWallPaper;
    private RecyclerView.Adapter adapterForWallPaper;

    private RecyclerView recyclerViewForSorbosheshSongbad;
    private RecyclerView.Adapter adapterForSorbosheshSongbad;

    RecyclerView.LayoutManager mLayoutManager;

    ArrayList<Kheladhula_Cricket> kheladhulaCricketArrayList;
    RequestQueue queue;


    public Cricket_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cricket_fragment, container, false);

        kheladhulaCricketArrayList = new ArrayList<>();
        queue = Volley.newRequestQueue(getActivity());
        loadDataFromVolley();

        recyclerViewForSorbosheshSongbad = view.findViewById(R.id.RV_sorboshesh_songbad_cricket_fragment);


        //Recyclerview for cricket wallpaper

        ArrayList<String> wallpaperData = new ArrayList<>();
        wallpaperData.add("সওয়ালপেপার বান্ডিল");
        wallpaperData.add("এক্সক্লুসিভ গান ");
        wallpaperData.add("এক্সক্লুসিভ মুস্তাফিজ");

        recyclerViewForWallPaper = view.findViewById(R.id.RV_wallpaper_cricket_fragment);

        recyclerViewForWallPaper.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false));

        SnapHelper snapHelperStartMulloChar = new GravitySnapHelper(Gravity.START);
        snapHelperStartMulloChar.attachToRecyclerView(recyclerViewForWallPaper);

        recyclerViewForWallPaper.setHasFixedSize(true);
        adapterForWallPaper = new RecyclerAdapterForKheladhulaCricket(getActivity(), wallpaperData);

        recyclerViewForWallPaper.setAdapter(adapterForWallPaper);




        return view;
    }

    private void loadDataFromVolley() {

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, Endpoints.KHELADHULA_CRICKET_GET_URL,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                        try {
                            JSONArray pachMishaliContentArr = response.getJSONArray("contents");
                            setporashunaiContent(pachMishaliContentArr);
                            //settop_contents(jsontop_contentsArr);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Volley", error.toString());
            }
        });

        queue.add(jsonObjectRequest);
    }

    private void setporashunaiContent(JSONArray jsonHotNewsContentArr) {

        if (jsonHotNewsContentArr.length() > 0) {
            for (int i = 0; i < jsonHotNewsContentArr.length(); i++) {
                try {
                    String imageUrl = jsonHotNewsContentArr.getJSONObject(i).getString("imageUrl");
                    String contentTitle = jsonHotNewsContentArr.getJSONObject(i).getString("contentTitle");
                    String contentType = jsonHotNewsContentArr.getJSONObject(i).getString("contentType");
                    String contentDescription = jsonHotNewsContentArr.getJSONObject(i).getString("contentDescription");
                    String publishedAt = jsonHotNewsContentArr.getJSONObject(i).getString("publishedAt");

                    kheladhulaCricketArrayList.add(new Kheladhula_Cricket(contentTitle, contentType, publishedAt, contentDescription, imageUrl));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            initializerRecyclerView();

        } else {
            Toast.makeText(getActivity(), "No data found", Toast.LENGTH_SHORT).show();

        }
    }

    private void initializerRecyclerView() {


        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerViewForSorbosheshSongbad.setLayoutManager(mLayoutManager);
        recyclerViewForSorbosheshSongbad.setHasFixedSize(true);
        adapterForSorbosheshSongbad = new RecyclerAdapterForSorbosheshSongbadCricketfragment(getActivity(), kheladhulaCricketArrayList);
        recyclerViewForSorbosheshSongbad.setAdapter(adapterForSorbosheshSongbad);

;
    }


}
