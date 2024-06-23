package com.example.mycoffeapp.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mycoffeapp.R;
import com.example.mycoffeapp.adapters.CardAdapter;
import com.example.mycoffeapp.models.CardModel;

import java.util.ArrayList;
import java.util.List;

public class MyCartFragment extends Fragment {

    List<CardModel> list;
    CardAdapter cardAdapter;
    RecyclerView recyclerView;

    public MyCartFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_cart, container, false);

        recyclerView = view.findViewById(R.id.cart_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();
        list.add(new CardModel(R.drawable.coffe0,"Order 1", "$28","4.8"));
        list.add(new CardModel(R.drawable.sandwich1,"Order 2", "$28","4.3"));
        list.add(new CardModel(R.drawable.icecream2,"Order 3", "$28","4.5"));
        list.add(new CardModel(R.drawable.d1,"Order 4", "$28","4.8"));
        list.add(new CardModel(R.drawable.cofe1,"Order 5", "$28","4.7"));
        cardAdapter = new CardAdapter(list);
        recyclerView.setAdapter(cardAdapter);

        return view;

    }
}