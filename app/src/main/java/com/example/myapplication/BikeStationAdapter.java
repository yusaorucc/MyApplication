package com.example.myapplication;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class BikeStationAdapter extends RecyclerView.Adapter<BikeStationAdapter.StationViewHolder> {

    private List<Randevu> mStationList;
    private List<Randevu> mFilteredStationList;
    private LayoutInflater inflater;
    private ItemClickListener mItemClickListener;
    public BikeStationAdapter(Context context, List<Randevu> stations,ItemClickListener mItemClickListener){
        inflater = LayoutInflater.from(context);
        this.mStationList = stations;
        this.mFilteredStationList = stations;
        this.mItemClickListener = mItemClickListener;
    }
    @NonNull
    @Override
    public StationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_randevu,parent,false);
        return new StationViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull StationViewHolder holder, int position) {
        Randevu station = mFilteredStationList.get(position);
        holder.setData(station,position);
    }
    @Override
    public int getItemCount() {
        return mFilteredStationList.size();
    }


    public class StationViewHolder extends RecyclerView.ViewHolder {
        TextView tvTtle, tvText,tvText2;
        public StationViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTtle = itemView.findViewById(R.id.tvTtle);
            tvText = itemView.findViewById(R.id.tvText);
            tvText2 = itemView.findViewById(R.id.tvText2);
        }
        @SuppressLint("SetTextI18n")
        public void setData(final Randevu station, final int position) {
            this.tvTtle.setText(station.getIsim());
            SimpleDateFormat format = new SimpleDateFormat("YYYY-mm-DD'T'HH:MM:SS");
            try {
                SimpleDateFormat format2 = new SimpleDateFormat("dd MM yyyy HH:mm");
                Date date = format.parse(station.getTarih());
                this.tvText.setText("Tarıh: " + format2.format(date));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            //this.tvText2.setText("Empty Slot: " + station.getEmptySlot());
            itemView.setOnClickListener(v -> mItemClickListener.onItemClick(station,position));
        }
    }
}