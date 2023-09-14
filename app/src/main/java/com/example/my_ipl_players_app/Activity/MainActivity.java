package com.example.my_ipl_players_app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.my_ipl_players_app.Adapter.Team_Name_Adapter;
import com.example.my_ipl_players_app.Config;
import com.example.my_ipl_players_app.R;

public class MainActivity extends AppCompatActivity {
    ListView listView;
   Team_Name_Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);

        adapter=new Team_Name_Adapter(MainActivity.this, Config.Teams_name,Config.Teams_img);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int poss, long id) {
                Intent intent=new Intent(MainActivity.this,Player_List_Activity.class);
                intent.putExtra("position",poss);
                startActivity(intent);
            }
        });


    }
}