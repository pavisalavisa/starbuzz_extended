package com.hfad.starbuzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

    static String EXTRA_DRINK_NO = "drinkNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        int drinkNo = (Integer) getIntent().getExtras().get(EXTRA_DRINK_NO);

        Drink drink = Drink.drinks[drinkNo];

        ImageView image = (ImageView)findViewById(R.id.photo);

        image.setImageResource(drink.getImageResourceId());
        image.setContentDescription(drink.getName());


        TextView name=(TextView)findViewById(R.id.name);
        name.setText(drink.getName());

        TextView description=(TextView)findViewById(R.id.description);

        description.setText(drink.getDescription());
    }
}
