package com.example.dd.retrofit2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by dd on 09.05.2017.
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private ArrayList<AndroidVersion> android;

    public DataAdapter(ArrayList<AndroidVersion> android) {
        this.android = android;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {
        holder.tv_name.setText(android.get(position).getName());
        holder.tv_version.setText(android.get(position).getVer());
        holder.tv_api_level.setText(android.get(position).getApi());
    }

    @Override
    public int getItemCount() {
        return android.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_name;
        private TextView tv_version;
        private TextView tv_api_level;

        public ViewHolder(View itemView) {
            super(itemView);

            tv_name = (TextView)itemView.findViewById(R.id.tv_name);
            tv_version = (TextView)itemView.findViewById(R.id.tv_version);
            tv_api_level = (TextView)itemView.findViewById(R.id.tv_api_level);

        }
    }
}
