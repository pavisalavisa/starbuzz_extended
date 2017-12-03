package com.hfad.starbuzz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class TopLevelActivity extends AppCompatActivity {

    //final Toast toast= Toast.makeText(this,(CharSequence)getString(R.string.toast_stores),Toast.LENGTH_LONG);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);



        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id){
                if(position==0)
                {
                    Intent intent1=new Intent(TopLevelActivity.this,DrinkCategoryActivity.class);
                    startActivity(intent1);
                }
                else if(position==1)
                {
                    Intent intent2=new Intent(TopLevelActivity.this, FoodCategoryActivity.class);
                    startActivity(intent2);
                }
                else if (position==2)
                {
                   //toast.show();
                }
            }
        };

        ListView listView=(ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }


}
