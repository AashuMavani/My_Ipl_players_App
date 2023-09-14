package com.example.my_ipl_players_app.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.my_ipl_players_app.Activity.Player_List_Activity;
import com.example.my_ipl_players_app.R;

public class Player_List_Adapter extends BaseAdapter {
    Player_List_Activity player_list_activity;
    int[] img;
    String[] name;
    String[] subname;
    public Player_List_Adapter(Player_List_Activity player_list_activity, int[] img, String[] name, String[] subname) {
        this.player_list_activity=player_list_activity;
        this.img=img;
        this.name=name;
        this.subname=subname;
    }

    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view= LayoutInflater.from(player_list_activity).inflate(R.layout.player_name_layout,parent,false);
        ImageView imageView=view.findViewById(R.id.player_pic);
        TextView textView=view.findViewById(R.id.player_name);
        TextView textView1=view.findViewById(R.id.player_subname);

        imageView.setImageResource(img[position]);
        textView.setText(name[position]);
        textView1.setText(subname[position]);
        return view;
    }
}
