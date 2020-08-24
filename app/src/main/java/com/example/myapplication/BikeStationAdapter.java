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
import java.util.ArrayList;
import java.util.List;
public class BikeStationAdapter extends RecyclerView.Adapter<BikeStationAdapter.StationViewHolder>  implements Filterable {

    private List<BikeStation> mStationList;
    private List<BikeStation> mFilteredStationList;
    private LayoutInflater inflater;
    private ItemClickListener mItemClickListener;
    public BikeStationAdapter(Context context, List<BikeStation> stations,ItemClickListener mItemClickListener){
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
        BikeStation station = mFilteredStationList.get(position);
        holder.setData(station,position);
    }
    @Override
    public int getItemCount() {
        return mFilteredStationList.size();
    }
    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String searchString = charSequence.toString();
                if (searchString.isEmpty()) {
                    mFilteredStationList = mStationList;
                } else {
                    ArrayList<BikeStation> tempFilteredList = new ArrayList<>();
                    for (BikeStation station : mStationList) {
                        // search for station name
                        if (station.getStationName().toLowerCase().contains(searchString)) {
                            tempFilteredList.add(station);
                        }
                    }
                    mFilteredStationList = tempFilteredList;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = mFilteredStationList;
                return filterResults;
            }
            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                mFilteredStationList = (ArrayList<BikeStation>) filterResults.values;
                notifyDataSetChanged();
            }
        };
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
        public void setData(final BikeStation station, final int position) {
            this.tvTtle.setText(station.getStationName());
            this.tvText.setText("Full Slot: " + station.getFullSlot());
            this.tvText2.setText("Empty Slot: " + station.getEmptySlot());
            itemView.setOnClickListener(v -> mItemClickListener.onItemClick(station,position));
        }
    }
}