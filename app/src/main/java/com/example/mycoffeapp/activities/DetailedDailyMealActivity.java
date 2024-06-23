package com.example.mycoffeapp.activities;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
<<<<<<< HEAD
=======
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
>>>>>>> 7ba663261b84211089979303eaa809cf8cb0d744
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mycoffeapp.R;
import com.example.mycoffeapp.adapters.DetailedDailyAdapter;
import com.example.mycoffeapp.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detailed_daily_meal);

        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_img);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList = new ArrayList<>();
        dailyAdapter = new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(dailyAdapter);

        if (type != null && type.equalsIgnoreCase("Breakfast")); {
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav1,"Breakfast","description","4.4","30","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav2,"Breakfast","description","4.4","30","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav3,"Breakfast","description","4.4","30","10 to 9"));
            dailyAdapter.notifyDataSetChanged();
        }

        if (type != null && type.equalsIgnoreCase("Sweets")){
            imageView.setImageResource(R.drawable.sweets);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s1,"Sweets","description","4.5","35","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s2,"Sweets","description","4.5","35","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s3,"Sweets","description","4.5","35","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s4,"Sweets","description","4.5","35","10 to 9"));
            dailyAdapter.notifyDataSetChanged();
        }

        if (type != null && type.equalsIgnoreCase("Coffee")){
            imageView.setImageResource(R.drawable.coffe);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.coffe0,"Coffee","description","4.5","35","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.coffe9,"Coffee","description","4.5","35","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.coffe10,"Coffee","description","4.5","35","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.coffe8,"Coffee","description","4.5","35","10 to 9"));
            dailyAdapter.notifyDataSetChanged();
        }

        if (type != null && type.equalsIgnoreCase("Dinner")){
            imageView.setImageResource(R.drawable.dinner);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.d1,"Dinner","description","4.5","35","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.d2,"Dinner","description","4.5","35","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.d3,"Dinner","description","4.5","35","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.d4,"Dinner","description","4.5","35","10 to 9"));
            dailyAdapter.notifyDataSetChanged();
        }

        if (type != null && type.equalsIgnoreCase("Ice cream")){
            imageView.setImageResource(R.drawable.ice_cream);
<<<<<<< HEAD
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.icecream1,"Ice Cream","description","4.5","35","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.icecream2,"Ice Cream","description","4.5","35","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.icecream3,"Ice Cream","description","4.5","35","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.icecream4,"Ice Cream","description","4.5","35","10 to 9"));
=======
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.icecream1,"Dinner","description","4.5","35","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.icecream2,"Dinner","description","4.5","35","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.icecream3,"Dinner","description","4.5","35","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.icecream4,"Dinner","description","4.5","35","10 to 9"));
>>>>>>> 7ba663261b84211089979303eaa809cf8cb0d744
            dailyAdapter.notifyDataSetChanged();
        }

    }
}