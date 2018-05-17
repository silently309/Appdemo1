package com.example.namnh66.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class FragmentActivites extends Fragment {
    private RecyclerView rvAirport;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_activities,container,false);
        initView(view);
        return view;
    }
    public void initView(View view)
    {
        rvAirport = (RecyclerView)view.findViewById(R.id.rview_Airport);
        rvAirport.setHasFixedSize(true);
        LinearLayoutManager layout = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false);
        rvAirport.setLayoutManager(layout);
        ArrayList<Airport> airportArray = new ArrayList<>();
        airportArray.add(new Airport("TAN SON NHAT AIRPORT","SILVERKRIS",99,"05/05/2018", R.drawable.tsnairport));
        airportArray.add(new Airport("DA NANG AIRPORT","GOLDDRAGON",99,"06/05/2018", R.drawable.tsnairport));
        airportArray.add(new Airport("TAN SON NHAT AIRPORT","SILVERKRIS",99,"05/05/2018", R.drawable.tsnairport));
        airportArray.add(new Airport("TAN SON NHAT AIRPORT","SILVERKRIS",99,"05/05/2018", R.drawable.tsnairport));
        airportArray.add(new Airport("TAN SON NHAT AIRPORT","SILVERKRIS",99,"05/05/2018", R.drawable.tsnairport));
        airportArray.add(new Airport("TAN SON NHAT AIRPORT","SILVERKRIS",99,"05/05/2018", R.drawable.tsnairport));
        airportArray.add(new Airport("TAN SON NHAT AIRPORT","SILVERKRIS",99,"05/05/2018", R.drawable.tsnairport));
        airportArray.add(new Airport("TAN SON NHAT AIRPORT","SILVERKRIS",99,"05/05/2018", R.drawable.tsnairport));
        RecycleAdapter recycleAdapter = new RecycleAdapter(airportArray,getActivity());
        rvAirport.setAdapter(recycleAdapter);
    }

}
