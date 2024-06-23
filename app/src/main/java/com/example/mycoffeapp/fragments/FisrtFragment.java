package com.example.mycoffeapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mycoffeapp.R;
import com.example.mycoffeapp.adapters.FeaturedAdapter;
import com.example.mycoffeapp.adapters.FeaturedVerAdapter;
import com.example.mycoffeapp.models.FeaturedModel;
import com.example.mycoffeapp.models.FeaturedVerModel;

import java.util.ArrayList;
import java.util.List;

public class FisrtFragment extends Fragment {

    //////////////////////////Featured Hor RecyclerView
    List<FeaturedModel> featuredModelsList;
    RecyclerView recyclerView;
    FeaturedAdapter featuredAdapter;

    /////////////////////////Featured Ver RecyclerView
    List<FeaturedVerModel> featuredVerModelList;
    RecyclerView recyclerView2;
    FeaturedVerAdapter featuredVerAdapter;


    public FisrtFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fisrt, container, false);

        ////////////////////////Featured Hor RecyclerView

        recyclerView = view.findViewById(R.id.featured_hor_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        featuredModelsList = new ArrayList<>();

        featuredModelsList.add(new FeaturedModel(R.drawable.atlan1," Crazy Highest Longest Slide","Description 1"));
        featuredModelsList.add(new FeaturedModel(R.drawable.atlan2," Crazy Highest Longest Slide","Description 2"));
        featuredModelsList.add(new FeaturedModel(R.drawable.atlan3," Crazy Highest Longest Slide","Description 3"));
        featuredModelsList.add(new FeaturedModel(R.drawable.atlan4," Crazy Highest Longest Slide","Description 4"));

        featuredAdapter = new FeaturedAdapter(featuredModelsList);
        recyclerView.setAdapter(featuredAdapter);

        /////////////////////////////////////Featured Ver RecyclerView
        recyclerView2 = view.findViewById(R.id.featured_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        featuredVerModelList = new ArrayList<>();

        featuredVerModelList.add(new FeaturedVerModel(R.drawable.coffe0,"Coffee Americano", "Description","5.0","10:00 - 20:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.coffe8,"Coffee Gula Aren", "Description","5.0","10:00 - 20:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.coffe9,"Coffee Tora Bika", "Description","5.0","10:00 - 20:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.coffe10,"Coffee Coffe Late", "Description","5.0","10:00 - 20:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.coffe,"Coffee Ekspresso", "Description","5.0","10:00 - 20:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.cofe1,"Coffee Capucino", "Description","5.0","10:00 - 20:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.cofe2,"Coffee Caramel", "Description","5.0","10:00 - 20:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.cofe3,"Coffee Susu", "Description","5.0","10:00 - 20:00"));

        featuredVerAdapter = new  FeaturedVerAdapter(featuredVerModelList);
        recyclerView2.setAdapter(featuredVerAdapter);

        return view;
    }
}