package com.example.recycler_fragment;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class itemAdapter  extends RecyclerView.Adapter<itemAdapter . ViewHolder >  {

    List<Model> itemList1;

    public itemAdapter(List<Model> itemList) {
        this.itemList1 = itemList;
    }

    @NonNull
    @Override
    public itemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rowitem ,viewGroup,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull itemAdapter.ViewHolder viewHolder, int i) {

        viewHolder.itemImage.setImageResource(itemList1.get(i).getImage());
        viewHolder.itemtxt.setText(itemList1.get(i).getName());


    }

    @Override
    public int getItemCount() {
        return itemList1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {




        ImageView itemImage;
        TextView itemtxt;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);



            itemImage=itemView.findViewById(R.id.itemImg);
            itemtxt=itemView.findViewById(R.id.itemName);

        }
    }
}
