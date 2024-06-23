package com.example.mycoffeapp.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mycoffeapp.R;
import com.example.mycoffeapp.models.HomeHorModel;
import com.example.mycoffeapp.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {

    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if (check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.coffe0, "Coffe Nako1", "18:00 - 22:00", "4.9", "Min - $34"));
            homeVerModels.add(new HomeVerModel(R.drawable.coffe, "Coffe Nako2", "18:00 - 22:00", "4.8", "Min - $20"));
            homeVerModels.add(new HomeVerModel(R.drawable.coffe9, "Coffe Nako3", "18:00 - 22:00", "4.5", "Min - $30"));
            homeVerModels.add(new HomeVerModel(R.drawable.coffe8, "Coffe Nako4", "18:00 - 22:00", "4.3", "Min - $25"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    row_index = position;
                    notifyDataSetChanged();

                    if (position == 0){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.coffe8,"Coffe Nako","08:00 - 22:00","4.5","Min - $37"));
                        homeVerModels.add(new HomeVerModel(R.drawable.coffe,"Coffe Nako2","08:00 - 22:00","4.2","Min - $31"));
                        homeVerModels.add(new HomeVerModel(R.drawable.coffe9,"Coffe Nako3","08:00 - 22:00","4.3","Min - $34"));
                        homeVerModels.add(new HomeVerModel(R.drawable.coffe10,"Coffe Nako4","08:00 - 22:00","4.3","Min - $32"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if (position == 1) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.atlan6,"Atlantik1","07:00 - 22:00","4.9","Min - $25"));
                        homeVerModels.add(new HomeVerModel(R.drawable.atlan3,"Atlantik2","07:00 - 22:00","4.9","Min - $26"));
                        homeVerModels.add(new HomeVerModel(R.drawable.atlan5,"Atlantik3","07:00 - 22:00","4.9","Min - $28"));
                        homeVerModels.add(new HomeVerModel(R.drawable.atlan7,"Atlantik4","07:00 - 22:00","4.9","Min - $30"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if (position == 2) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.burger1,"Burger1","08:00 - 22:00","4.8","Min - $35"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger2,"Burger2","08:00 - 22:00","4.8","Min - $35"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger4,"Burger3","08:00 - 22:00","4.8","Min - $35"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if (position == 3) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.pizza1,"Pizza1","08:20 - 22:00","4.9","Min - $34"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza2,"Pizza2","08:20 - 22:00","4.9","Min - $34"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza3,"Pizza3","08:20 - 22:00","4.9","Min - $34"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza4,"Pizza4","08:20 - 22:00","4.9","Min - $34"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if (position == 4) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.fries1,"Fries1","08:30 - 22:00","4.9","Min - $20"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries2,"Fries2","08:30 - 22:00","4.9","Min - $20"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries3,"Fries3","08:30 - 22:00","4.9","Min - $20"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries4,"Fries4","08:30 - 22:00","4.9","Min - $20"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                }
            });
            if (select){
                if (position == 0){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select = false;
                }
            }
            else {
                if (row_index == position){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }else {
                    holder.cardView.setBackgroundResource(R.drawable.default_bg);
                }
            }
        }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.hor_img);
            name = itemView.findViewById(R.id.hor_text);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
