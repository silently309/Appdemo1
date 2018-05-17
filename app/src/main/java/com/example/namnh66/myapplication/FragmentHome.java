package com.example.namnh66.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class FragmentHome extends Fragment {
    private ListView lvAirport;
    ArrayList<Airport> airportArray;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);

        lvAirport = (ListView)view.findViewById(R.id.listAirport);
        airportArray = new ArrayList<Airport>();
        airportArray.add(new Airport("TAN SON NHAT AIRPORT","SILVERKRIS",99,"05/05/2018", R.drawable.tsnairport));
        airportArray.add(new Airport("DA NANG AIRPORT","GOLDDRAGON",99,"06/05/2018", R.drawable.tsnairport));
        airportArray.add(new Airport("TAN SON NHAT AIRPORT","SILVERKRIS",99,"05/05/2018", R.drawable.tsnairport));
        airportArray.add(new Airport("TAN SON NHAT AIRPORT","SILVERKRIS",99,"05/05/2018", R.drawable.tsnairport));
        airportArray.add(new Airport("TAN SON NHAT AIRPORT","SILVERKRIS",99,"05/05/2018", R.drawable.tsnairport));
        airportArray.add(new Airport("TAN SON NHAT AIRPORT","SILVERKRIS",99,"05/05/2018", R.drawable.tsnairport));
        airportArray.add(new Airport("TAN SON NHAT AIRPORT","SILVERKRIS",99,"05/05/2018", R.drawable.tsnairport));
        airportArray.add(new Airport("TAN SON NHAT AIRPORT","SILVERKRIS",99,"05/05/2018", R.drawable.tsnairport));
        AirportAdapter apAdapter = new AirportAdapter(
                getActivity(),
                R.layout.listview_airport,
                airportArray
        );
        lvAirport.setAdapter(apAdapter);
        return view;
    }
}
