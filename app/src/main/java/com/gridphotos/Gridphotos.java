package com.gridphotos;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Gridphotos extends LinearLayout {

    ImageView fullImg;
    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    TextView countMoreImg;
    LinearLayout containerImg;

    LinearLayout row1;
    LinearLayout row2;
    LinearLayout row4444;

    public Gridphotos(Context context) {
        super(context);
        View view = inflate(getContext(), R.layout.grid_photos, null);
        addView(view);
        // init layout
    }

    public Gridphotos(Context context, AttributeSet attrs) {
        super(context, attrs);
        View view = inflate(getContext(), R.layout.grid_photos, null);

        fullImg = (ImageView) view.findViewById(R.id.fullImg);
        img1 = (ImageView) view.findViewById(R.id.img1);
        img2 = (ImageView) view.findViewById(R.id.img2);
        img3 = (ImageView) view.findViewById(R.id.img3);
        img4 = (ImageView) view.findViewById(R.id.img4);
        row1 = (LinearLayout) view.findViewById(R.id.row1);
        row2 = (LinearLayout) view.findViewById(R.id.row2);
        row2 = (LinearLayout) view.findViewById(R.id.row2);
        containerImg = (LinearLayout) view.findViewById(R.id.containerImg);
        countMoreImg = (TextView) view.findViewById(R.id.countMoreImg);
        addView(view);

//        setData(context);
        // here you can apply custom attributes
        // init layout
    }

    public void addData(Context context, ArrayList<Integer> arrayList) {
        if (arrayList.size() == 0) {
            row1.setVisibility(View.GONE);
            row2.setVisibility(View.GONE);
            fullImg.setVisibility(View.VISIBLE);
            containerImg.setVisibility(View.GONE);
        } else if (arrayList.size() == 1) {
            row1.setVisibility(View.GONE);
            row2.setVisibility(View.GONE);
            fullImg.setVisibility(View.VISIBLE);

            Picasso.get().load(arrayList.get(0)).placeholder(R.drawable.place_holder_main).error(R.drawable.place_holder_main).into(fullImg);
        } else if (arrayList.size() == 2) {
            row1.setVisibility(View.VISIBLE);
            row2.setVisibility(View.INVISIBLE);
            fullImg.setVisibility(View.GONE);
            Picasso.get().load(arrayList.get(0)).placeholder(R.drawable.place_holder_main).error(R.drawable.place_holder_main).into(img1);
            Picasso.get().load(arrayList.get(1)).placeholder(R.drawable.place_holder_main).error(R.drawable.place_holder_main).into(img2);
            Log.e("arrayList.get(1) ", arrayList.get(1) + "");

        } else if (arrayList.size() == 3) {
            row1.setVisibility(View.VISIBLE);
            row2.setVisibility(View.VISIBLE);
            img4.setVisibility(View.GONE);
            fullImg.setVisibility(View.GONE);
            Picasso.get().load(arrayList.get(0)).placeholder(R.drawable.place_holder_main).error(R.drawable.place_holder_main).into(img1);
            Picasso.get().load(arrayList.get(1)).placeholder(R.drawable.place_holder_main).error(R.drawable.place_holder_main).into(img2);
            Picasso.get().load(arrayList.get(2)).placeholder(R.drawable.place_holder_main).error(R.drawable.place_holder_main).into(img3);

        } else if (arrayList.size() == 4) {
            row1.setVisibility(View.VISIBLE);
            row2.setVisibility(View.VISIBLE);
            fullImg.setVisibility(View.GONE);
            Picasso.get().load(arrayList.get(0)).placeholder(R.drawable.place_holder_main).error(R.drawable.place_holder_main).into(img1);
            Picasso.get().load(arrayList.get(1)).placeholder(R.drawable.place_holder_main).error(R.drawable.place_holder_main).into(img2);
            Picasso.get().load(arrayList.get(2)).placeholder(R.drawable.place_holder_main).error(R.drawable.place_holder_main).into(img3);
            Picasso.get().load(arrayList.get(3)).placeholder(R.drawable.place_holder_main).error(R.drawable.place_holder_main).into(img4);
        } else if (arrayList.size() >= 5) {
            row1.setVisibility(View.VISIBLE);
            row2.setVisibility(View.VISIBLE);
            fullImg.setVisibility(View.GONE);
            img4.setVisibility(View.GONE);
            countMoreImg.setVisibility(View.VISIBLE);
            Picasso.get().load(arrayList.get(0)).placeholder(R.drawable.place_holder_main).error(R.drawable.place_holder_main).into(img1);
            Picasso.get().load(arrayList.get(1)).placeholder(R.drawable.place_holder_main).error(R.drawable.place_holder_main).into(img2);
            Picasso.get().load(arrayList.get(2)).placeholder(R.drawable.place_holder_main).error(R.drawable.place_holder_main).into(img3);
            int count = 0;
            count = arrayList.size() - 3;
            countMoreImg.setText("+" + count);
        } else {
            row1.setVisibility(View.VISIBLE);
            row2.setVisibility(View.VISIBLE);
            fullImg.setVisibility(View.GONE);
        }
    }

    public void addData(ArrayList<String> arrayList) {
        if (arrayList.size() == 0) {
            row1.setVisibility(View.GONE);
            row2.setVisibility(View.GONE);
            fullImg.setVisibility(View.VISIBLE);
            containerImg.setVisibility(View.GONE);
        } else if (arrayList.size() == 1) {
            row1.setVisibility(View.GONE);
            row2.setVisibility(View.GONE);
            fullImg.setVisibility(View.VISIBLE);

            Picasso.get().load(arrayList.get(0)).placeholder(R.drawable.place_holder_main).error(R.drawable.place_holder_main).into(fullImg);
        } else if (arrayList.size() == 2) {
            row1.setVisibility(View.VISIBLE);
            row2.setVisibility(View.GONE);
            fullImg.setVisibility(View.GONE);
            Picasso.get().load(arrayList.get(0)).placeholder(R.drawable.place_holder_main).error(R.drawable.place_holder_main).into(img1);
            Picasso.get().load(arrayList.get(1)).placeholder(R.drawable.place_holder_main).error(R.drawable.place_holder_main).into(img2);
            Log.e("arrayList.get(1) ", arrayList.get(1) + "");

        } else if (arrayList.size() == 3) {
            row1.setVisibility(View.VISIBLE);
            row2.setVisibility(View.VISIBLE);
            fullImg.setVisibility(View.GONE);
            Picasso.get().load(arrayList.get(0)).placeholder(R.drawable.place_holder_main).error(R.drawable.place_holder_main).into(img1);
            Picasso.get().load(arrayList.get(1)).placeholder(R.drawable.place_holder_main).error(R.drawable.place_holder_main).into(img2);
            Picasso.get().load(arrayList.get(2)).placeholder(R.drawable.place_holder_main).error(R.drawable.place_holder_main).into(img3);

        } else if (arrayList.size() == 4) {
            row1.setVisibility(View.VISIBLE);
            row2.setVisibility(View.VISIBLE);
            fullImg.setVisibility(View.GONE);
            Picasso.get().load(arrayList.get(0)).placeholder(R.drawable.place_holder_main).error(R.drawable.place_holder_main).into(img1);
            Picasso.get().load(arrayList.get(1)).placeholder(R.drawable.place_holder_main).error(R.drawable.place_holder_main).into(img2);
            Picasso.get().load(arrayList.get(2)).placeholder(R.drawable.place_holder_main).error(R.drawable.place_holder_main).into(img3);
            Picasso.get().load(arrayList.get(3)).placeholder(R.drawable.place_holder_main).error(R.drawable.place_holder_main).into(img4);
        } else if (arrayList.size() >= 5) {
            row1.setVisibility(View.VISIBLE);
            row2.setVisibility(View.VISIBLE);
            fullImg.setVisibility(View.GONE);
            img4.setVisibility(View.GONE);
            countMoreImg.setVisibility(View.VISIBLE);
            Picasso.get().load(arrayList.get(0)).placeholder(R.drawable.place_holder_main).error(R.drawable.place_holder_main).into(img1);
            Picasso.get().load(arrayList.get(1)).placeholder(R.drawable.place_holder_main).error(R.drawable.place_holder_main).into(img2);
            Picasso.get().load(arrayList.get(2)).placeholder(R.drawable.place_holder_main).error(R.drawable.place_holder_main).into(img3);
            int count = 0;
            count = arrayList.size() - 3;
            countMoreImg.setText("+" + count);
        } else {
            row1.setVisibility(View.VISIBLE);
            row2.setVisibility(View.VISIBLE);
            fullImg.setVisibility(View.GONE);
        }
    }
}