package com.gridphotos;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {

    List<String> objectList;
    Context context;
    int indexSelected = 0;
    boolean isLike = false;




    public Adapter(Activity activity, List<String> objectList) {
        this.objectList = objectList;
        this.context = activity;
    }


    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        Holder holder = new Holder(v);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < position; i++) {
            integerArrayList.add(R.drawable.thumb);
            arrayList.add("https://m.media-amazon.com/images/I/914Q3Dv6LmL.jpg");
        }
        holder.grid_photos.addData(context, integerArrayList);


    }

    @Override
    public int getItemCount() {
        return 6;
    }

    class Holder extends RecyclerView.ViewHolder {

        Gridphotos grid_photos;
        public Holder(@NonNull View itemView) {
            super(itemView);
            grid_photos = (Gridphotos) itemView.findViewById(R.id.grid_photos);

        }


    }

    public void preventDoubleClicks(final View view) {
        try {
            view.setEnabled(false);
            view.postDelayed(new Runnable() {
                @Override
                public void run() {
                    view.setEnabled(true);
                }
            }, 1000);
        } catch (Exception e) {

        }
    }
}