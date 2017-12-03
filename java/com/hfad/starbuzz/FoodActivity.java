package com.hfad.starbuzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {

    static String EXTRA_FOOD_NO="foodNo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        int foodNo=(Integer)getIntent().getExtras().get(EXTRA_FOOD_NO);

        Food food=Food.foods[foodNo];

        ImageView image=(ImageView)findViewById(R.id.food_photo);
        image.setImageResource(food.getImageResourceId());
        image.setContentDescription(food.getName());

        TextView name=(TextView)findViewById(R.id.food_name);
        name.setText(food.getName());

        TextView description=(TextView)findViewById(R.id.food_description);
        description.setText(food.getDescription());
    }
}
