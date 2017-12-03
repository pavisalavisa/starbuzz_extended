package com.hfad.starbuzz;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by krist on 30.11.2017..
 */

public class FoodCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        ArrayAdapter<Food> listAdapter =new ArrayAdapter<Food>(this,android.R.layout.simple_list_item_1,Food.foods);

        ListView listFood=getListView();
        listFood.setAdapter(listAdapter);
    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id)
    {

        Intent intent=new Intent(FoodCategoryActivity.this,FoodActivity.class);
        intent.putExtra(FoodActivity.EXTRA_FOOD_NO,(int )id);
        startActivity(intent);
    }




}
