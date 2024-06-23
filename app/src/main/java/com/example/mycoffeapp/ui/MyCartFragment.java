package com.example.mycoffeapp.ui;

import android.os.Bundle;
<<<<<<< HEAD
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
=======

>>>>>>> 7ba663261b84211089979303eaa809cf8cb0d744
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

<<<<<<< HEAD
import com.example.mycoffeapp.R;
import com.example.mycoffeapp.adapters.CartAdapter;
import com.example.mycoffeapp.models.CartModel;
=======
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mycoffeapp.R;
import com.example.mycoffeapp.adapters.CardAdapter;
import com.example.mycoffeapp.models.CardModel;
>>>>>>> 7ba663261b84211089979303eaa809cf8cb0d744

import java.util.ArrayList;
import java.util.List;

public class MyCartFragment extends Fragment {

<<<<<<< HEAD
    List<CartModel> list;
    CartAdapter cartAdapter;
=======
    List<CardModel> list;
    CardAdapter cardAdapter;
>>>>>>> 7ba663261b84211089979303eaa809cf8cb0d744
    RecyclerView recyclerView;

    public MyCartFragment() {
        // Required empty public constructor
    }

    @Override
<<<<<<< HEAD
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
=======
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
>>>>>>> 7ba663261b84211089979303eaa809cf8cb0d744
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_cart, container, false);

        recyclerView = view.findViewById(R.id.cart_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();
<<<<<<< HEAD
        list.add(new CartModel(R.drawable.coffe0,"Order 1", "$28.000","4.9"));
        list.add(new CartModel(R.drawable.atlan6,"Order 1", "$25.000","4.9"));
        list.add(new CartModel(R.drawable.icecream3,"Order 1", "$15.000","4.8"));
        list.add(new CartModel(R.drawable.pizza2,"Order 1", "$34.000","4.9"));
        list.add(new CartModel(R.drawable.fries4,"Order 1", "$20.000","4.9"));
        list.add(new CartModel(R.drawable.atlan5,"Order 1", "$30.000","4.9"));
        cartAdapter = new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);
=======
        list.add(new CardModel(R.drawable.coffe0,"Order 1", "$28","4.8"));
        list.add(new CardModel(R.drawable.sandwich1,"Order 2", "$28","4.3"));
        list.add(new CardModel(R.drawable.icecream2,"Order 3", "$28","4.5"));
        list.add(new CardModel(R.drawable.d1,"Order 4", "$28","4.8"));
        list.add(new CardModel(R.drawable.cofe1,"Order 5", "$28","4.7"));
        cardAdapter = new CardAdapter(list);
        recyclerView.setAdapter(cardAdapter);
>>>>>>> 7ba663261b84211089979303eaa809cf8cb0d744

        return view;

    }
}