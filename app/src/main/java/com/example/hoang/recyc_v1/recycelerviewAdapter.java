package com.example.hoang.recyc_v1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class recycelerviewAdapter extends RecyclerView.Adapter<recycelerviewAdapter.RecyclerViewHolder> {
    private List<Integer> mData;
    private List<Integer> mData2;

    public recycelerviewAdapter(List<Integer> mData, List<Integer> mData2) {
        this.mData = mData;
        this.mData2 = mData2;
    }

    @NonNull
    @Override
    public recycelerviewAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.item, viewGroup, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull recycelerviewAdapter.RecyclerViewHolder recyclerViewHolder, int i) {
        recyclerViewHolder.mTextviewAvata.setText(mData.get(i));
        recyclerViewHolder.mImageAvata.setImageResource(mData2.get(i));

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        private TextView mTextviewAvata;
        private ImageView mImageAvata;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextviewAvata = itemView.findViewById(R.id.text_avata);
            mImageAvata = itemView.findViewById(R.id.image_avata);
        }
    }
}


