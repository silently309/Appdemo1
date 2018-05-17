package com.example.namnh66.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AirportAdapter extends BaseAdapter {

    Context mycontext;
    int myLayout;
    List<Airport> arrayAirport;

    public AirportAdapter(Context mycontext, int myLayout, List<Airport> arrayAirport) {
        this.mycontext = mycontext;
        this.myLayout = myLayout;
        this.arrayAirport = arrayAirport;
    }

    @Override
    public int getCount() {
        return arrayAirport.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) mycontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(myLayout,null);
        TextView txt_airportName = view.findViewById(R.id.txt_airportName);
        txt_airportName.setText(arrayAirport.get(i).airportName);
        TextView txt_loungeName = view.findViewById(R.id.txt_loungeName);
        txt_loungeName.setText(arrayAirport.get(i).loungeName);
        TextView txt_dayStart = view.findViewById(R.id.txt_dayStart);
        txt_dayStart.setText((CharSequence) arrayAirport.get(i).dayStart);
        TextView txt_price = view.findViewById(R.id.txt_price);
        txt_price.setText(arrayAirport.get(i).price.toString());
        ImageView img_airport = view.findViewById(R.id.img_airport);
        img_airport.setImageResource(arrayAirport.get(i).img);
        return view;
    }
}
