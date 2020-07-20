package com.example.round2app;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {

    ImageView mImaeView;
    TextView mTitle, mDes, mPrice,mDate;

    public MyHolder(@NonNull View itemView) {
        super(itemView);

        this.mImaeView = itemView.findViewById(R.id.imageTv);
        this.mTitle = itemView.findViewById(R.id.titleTv);
        this.mDes = itemView.findViewById(R.id.descriptionTv);
        this.mPrice = itemView.findViewById(R.id.priceTv);
        this.mDate = itemView.findViewById(R.id.dateTv);


    }
}
