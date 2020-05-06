package com.cardviewandrecyclerview.android.apk;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.myViewHolder> {
    private Context mContext;
    private List<book> mData;

    public RecyclerViewAdapter(Context mContext, List<book> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.cardview,viewGroup,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder myViewHolder, final int i) {
        myViewHolder.textView.setText(mData.get(i).getTitle());
        myViewHolder.imageView.setImageResource(mData.get(i).getThumbnail());
        myViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,FullBookActivity.class);
                intent.putExtra("Title",mData.get(i).getTitle());
                intent.putExtra("category",mData.get(i).getCategory());
                intent.putExtra("description",mData.get(i).getDescription());
                intent.putExtra("thumbnail",mData.get(i).getThumbnail());
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder {
         TextView textView;
         ImageView imageView;
         CardView cardView;

        public myViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.textView_id);
            imageView = (ImageView) itemView.findViewById(R.id.imageView_id);
            cardView = (CardView)itemView.findViewById(R.id.cardview_id);
        }
    }
}
