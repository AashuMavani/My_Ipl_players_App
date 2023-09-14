package com.example.my_ipl_players_app.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.my_ipl_players_app.Activity.Players_Edit_Activity;
import com.example.my_ipl_players_app.Config;
import com.example.my_ipl_players_app.R;

public class Background_Adapter extends BaseAdapter {
    Players_Edit_Activity players_edit_activity;
    int[] colorArr;
    public Background_Adapter(Players_Edit_Activity players_edit_activity, int[] colorArr) {
        this.players_edit_activity=players_edit_activity;
        this.colorArr=colorArr;
    }

    @Override
    public int getCount() {
        return colorArr.length;
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
        view= LayoutInflater.from(players_edit_activity).inflate(R.layout.background_layout_item,parent,false);
        ImageView imageView=view.findViewById(R.id.back_item);

        imageView.setBackgroundResource(Config.colorArr[position]);
        return view;
    }
}
