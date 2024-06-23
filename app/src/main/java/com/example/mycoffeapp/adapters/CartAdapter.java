package com.example.mycoffeapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mycoffeapp.R;
<<<<<<< HEAD
import com.example.mycoffeapp.models.CartModel;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {

    List<CartModel> list;

    public CartAdapter(List<CartModel> list) {
=======
import com.example.mycoffeapp.models.CardModel;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    List<CardModel> list;

    public CardAdapter(List<CardModel> list) {
>>>>>>> 7ba663261b84211089979303eaa809cf8cb0d744
        this.list = list;
    }

    @NonNull
    @Override
<<<<<<< HEAD
    public CartAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
=======
    public CardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
>>>>>>> 7ba663261b84211089979303eaa809cf8cb0d744
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.mycart_item,parent,false));
    }

    @Override
<<<<<<< HEAD
    public void onBindViewHolder(@NonNull CartAdapter.ViewHolder holder, int position) {
=======
    public void onBindViewHolder(@NonNull CardAdapter.ViewHolder holder, int position) {
>>>>>>> 7ba663261b84211089979303eaa809cf8cb0d744

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.rating.setText(list.get(position).getRating());
        holder.price.setText(list.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name,rating,price;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.detailed_img);
            name = itemView.findViewById(R.id.detailed_name);
            rating = itemView.findViewById(R.id.detailed_rating);
            price = itemView.findViewById(R.id.detailed_price);
        }
    }
}
