package com.example.flagy.Recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.flagy.MapUtils;
import com.example.flagy.R;

import java.util.List;
import java.util.Map;


public class StudyAdapter extends RecyclerView.Adapter<StudyAdapter.ViewHolder> {

    private List<String> dataList;
    private Map<String,Object> countryDrawables;

    public StudyAdapter(List<String> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_study, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String data = dataList.get(position);
        holder.textView.setText(data);

        // Set image based on position or data
        countryDrawables = MapUtils.loadMap2(holder.itemView.getContext());

        // split the data on "=" to get the country code and make it lowercase
        String[] parts = data.split("=");
        String code = parts[0].toLowerCase().trim(); // Convert to lowercase and trim any leading/trailing spaces

        // Get the drawable resource ID based on the country code
        int imageId = holder.itemView.getContext().getResources().getIdentifier(code, "drawable", holder.itemView.getContext().getPackageName());

        // Set the image resource to the ImageView
        holder.imageView.setImageResource(imageId);
    }


    @Override
    public int getItemCount() {
        return dataList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_view);
            imageView = itemView.findViewById(R.id.item_image);
        }
    }

}
