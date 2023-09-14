package com.example.my_ipl_players_app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.my_ipl_players_app.Adapter.Player_List_Adapter;
import com.example.my_ipl_players_app.Config;
import com.example.my_ipl_players_app.R;

public class Player_List_Activity extends AppCompatActivity {
    ListView player_listview;

    Player_List_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_list);
        player_listview=findViewById(R.id.player_listview);

        int poss=getIntent().getIntExtra("position",0);
        if(poss==0)
        {
            adapter=new Player_List_Adapter(Player_List_Activity.this, Config.Gujarat_titans_img,Config.Gujarat_titans_name,Config.Gujarat_titans_subname);
        }
        else if (poss==1)
        {
            adapter=new Player_List_Adapter(Player_List_Activity.this, Config.Chennai_img,Config.Chennai_name,Config.Chennai_subname);
        }
        else if (poss==2)
        {
            adapter=new Player_List_Adapter(Player_List_Activity.this, Config.Lacknow_img,Config.Lucknow_name,Config.Lacknow_subname);
        }
        else if (poss==3)
        {
            adapter=new Player_List_Adapter(Player_List_Activity.this, Config. Royal_Challengers_img ,Config.Royal_Challengers_name,Config.Royal_Challengers_subname);
        }
        else if (poss==4)
        {
            adapter=new Player_List_Adapter(Player_List_Activity.this, Config.Mumbai_Indian_img,Config.Mumbai_Indian_name,Config.Mumbai_Indian_subname);
        }
        else if (poss==5)
        {
            adapter=new Player_List_Adapter(Player_List_Activity.this, Config.Kolkata_Knight_Rider_img,Config.Kolkata_Knight_Rider_name,Config.Kolkata_Knight_Rider_subname);
        }else if (poss==6)
        {
            adapter=new Player_List_Adapter(Player_List_Activity.this, Config.Sunrisers_Hyderabad_img,Config.Sunrisers_Hyderabad_name,Config.Sunrisers_Hyderabad_subname);
        }else if (poss==7)
        {
            adapter=new Player_List_Adapter(Player_List_Activity.this, Config.Rajasthan_Royals_img,Config.Rajasthan_Royals_name,Config.Rajasthan_Royals_subname);
        }else if (poss==8)
        {
            adapter=new Player_List_Adapter(Player_List_Activity.this, Config.Delhi_Capitals_img,Config.Delhi_Capitals_name,Config.Delhi_Capitals_subname);
        }else if (poss==9)
        {
            adapter=new Player_List_Adapter(Player_List_Activity.this, Config.Punjab_Kings_img,Config.Punjab_Kings_name,Config.Punjab_Kings_subname);
        }
        player_listview.setAdapter(adapter);

        player_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(Player_List_Activity.this, Players_Details_Activity.class);
                if(poss==0)
                {
                    intent.putExtra("position",position);
                    intent.putExtra("imagearr",Config.Gujarat_titans_img);
                    intent.putExtra("namearr",Config.Gujarat_titans_name);
                    intent.putExtra("idarr",Config.Gujarat_titans_subname);
                }
                else if(poss==1)
                {
                    intent.putExtra("position",position);
                    intent.putExtra("imagearr",Config.Chennai_img);
                    intent.putExtra("namearr",Config.Chennai_name);
                    intent.putExtra("idarr",Config.Chennai_subname);
                }
                else if(poss==2)
                {
                    intent.putExtra("position",position);
                    intent.putExtra("imagearr",Config.Lacknow_img);
                    intent.putExtra("namearr",Config.Lucknow_name);
                    intent.putExtra("idarr",Config.Lacknow_subname);
                }
                else if(poss==3)
                {
                    intent.putExtra("position",position);
                    intent.putExtra("imagearr",Config.Royal_Challengers_img);
                    intent.putExtra("namearr",Config.Royal_Challengers_name);
                    intent.putExtra("idarr",Config.Royal_Challengers_subname);
                }
                else if(poss==4)
                {
                    intent.putExtra("position",position);
                    intent.putExtra("imagearr",Config.Mumbai_Indian_img);
                    intent.putExtra("namearr",Config.Mumbai_Indian_name);
                    intent.putExtra("idarr",Config.Mumbai_Indian_subname);
                }
                else if(poss==5)
                {
                    intent.putExtra("position",position);
                    intent.putExtra("imagearr",Config.Kolkata_Knight_Rider_img);
                    intent.putExtra("namearr",Config.Kolkata_Knight_Rider_name);
                    intent.putExtra("idarr",Config.Kolkata_Knight_Rider_subname);
                } else if(poss==6)
                {
                    intent.putExtra("position",position);
                    intent.putExtra("imagearr",Config.Sunrisers_Hyderabad_img);
                    intent.putExtra("namearr",Config.Sunrisers_Hyderabad_name);
                    intent.putExtra("idarr",Config.Sunrisers_Hyderabad_subname);
                } else if(poss==7)
                {
                    intent.putExtra("position",position);
                    intent.putExtra("imagearr",Config.Rajasthan_Royals_img);
                    intent.putExtra("namearr",Config.Rajasthan_Royals_name);
                    intent.putExtra("idarr",Config.Rajasthan_Royals_subname);
                }
                else if(poss==8)
                {
                    intent.putExtra("position",position);
                    intent.putExtra("imagearr",Config.Delhi_Capitals_img);
                    intent.putExtra("namearr",Config.Delhi_Capitals_name);
                    intent.putExtra("idarr",Config.Delhi_Capitals_subname);
                } else if(poss==9)
                {
                    intent.putExtra("position",position);
                    intent.putExtra("imagearr",Config.Punjab_Kings_img);
                    intent.putExtra("namearr",Config.Punjab_Kings_name);
                    intent.putExtra("idarr",Config.Punjab_Kings_subname);
                }
              startActivity(intent);
            }
        });

    }
}