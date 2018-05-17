package com.example.namnh66.myapplication;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder>{
    ArrayList<Airport> dataAirport;
    Context context;

    public RecycleAdapter(ArrayList<Airport> dataAirport, Context context) {
        this.dataAirport = dataAirport;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.listview_airport,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txt_airportName.setText(dataAirport.get(position).airportName);
        holder.txt_loungeName.setText(dataAirport.get(position).loungeName);
        holder.txt_dayStart.setText((CharSequence) dataAirport.get(position).dayStart);
        holder.txt_price.setText(dataAirport.get(position).price.toString());
        holder.img_airport.setImageResource(dataAirport.get(position).img);
    }

    @Override
    public int getItemCount() {
        return dataAirport.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt_airportName;

        TextView txt_loungeName;

        TextView txt_dayStart;

        TextView txt_price;

        ImageView img_airport;

        public ViewHolder(View itemView) {
            super(itemView);
            txt_airportName = itemView.findViewById(R.id.txt_airportName);
            txt_loungeName = itemView.findViewById(R.id.txt_loungeName);
            txt_dayStart = itemView.findViewById(R.id.txt_dayStart);
            txt_price = itemView.findViewById(R.id.txt_price);
            img_airport =itemView.findViewById(R.id.img_airport);
        }

    }

}
