package com.example.my_ipl_players_app.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.my_ipl_players_app.Activity.MainActivity;
import com.example.my_ipl_players_app.R;

public class Team_Name_Adapter extends BaseAdapter {
    MainActivity mainActivity;
    String[] teams_name;
    int[] teams_img;
    public Team_Name_Adapter(MainActivity mainActivity, String[] teams_name, int[] teams_img) {
        this.mainActivity=mainActivity;
        this.teams_img=teams_img;
        this.teams_name=teams_name;
    }

    @Override
    public int getCount() {
        return teams_img.length;
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
        view= LayoutInflater.from(mainActivity).inflate(R.layout.team_name_layout,parent,false);
        ImageView imageView=view.findViewById(R.id.team_logo);
        TextView textView=view.findViewById(R.id.team_name);

        imageView.setImageResource(teams_img[position]);
        textView.setText(teams_name[position]);
        return view;
    }
}
