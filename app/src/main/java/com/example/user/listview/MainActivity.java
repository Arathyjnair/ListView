package com.example.user.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView mob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mob=(ListView)findViewById(R.id.list);

        final ArrayList<String> mobiles=new ArrayList<>();
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,mobiles);
        mobiles.add("samsung");
        mobiles.add("Htc");
        mobiles.add("Nokia");
        mobiles.add("Apple");
        mobiles.add("Redmi");
        mobiles.add("Microsoft");
        mob.setAdapter(adapter);
        mob.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemvalue=(String) mob.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, ""+mobiles.get(position), Toast.LENGTH_SHORT).show();

//                if(itemvalue=="samsung")
//                {
//                    Toast.makeText(MainActivity.this, "you selected Samsung", Toast.LENGTH_SHORT).show();
//                }
//             else   if(itemvalue=="Htc")
//                {
//                    Toast.makeText(MainActivity.this, "you selected HTC", Toast.LENGTH_SHORT).show();
//                }
//             else   if(itemvalue=="Nokia")
//                {
//                    Toast.makeText(MainActivity.this, "you selected Nokia", Toast.LENGTH_SHORT).show();
//                    }
//                  else  if(itemvalue=="Apple")
//                    {
//                        Toast.makeText(MainActivity.this, "you selected Apple", Toast.LENGTH_SHORT).show();
//                    }
//                  else   if(itemvalue=="Redmi")
//                    {
//                        Toast.makeText(MainActivity.this, "You selected Redmi", Toast.LENGTH_SHORT).show();
//                    }
//                else
//                {
//                        Toast.makeText(MainActivity.this, "you selected Microsoft", Toast.LENGTH_SHORT).show();
//                    }
//
          }
        });
    }
}

