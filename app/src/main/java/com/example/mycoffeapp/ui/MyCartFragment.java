package com.example.mycoffeapp.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mycoffeapp.R;
import com.example.mycoffeapp.adapters.CartAdapter;
import com.example.mycoffeapp.models.CartModel;

import java.util.ArrayList;
import java.util.List;

public class MyCartFragment extends Fragment {

    List<CartModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;

    public MyCartFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_cart, container, false);

        recyclerView = view.findViewById(R.id.cart_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();
        list.add(new CartModel(R.drawable.coffe0,"Order 1", "$28.000","4.9"));
        list.add(new CartModel(R.drawable.atlan6,"Order 1", "$25.000","4.9"));
        list.add(new CartModel(R.drawable.icecream3,"Order 1", "$15.000","4.8"));
        list.add(new CartModel(R.drawable.pizza2,"Order 1", "$34.000","4.9"));
        list.add(new CartModel(R.drawable.fries4,"Order 1", "$20.000","4.9"));
        list.add(new CartModel(R.drawable.atlan5,"Order 1", "$30.000","4.9"));
        cartAdapter = new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);

        return view;

    }
}