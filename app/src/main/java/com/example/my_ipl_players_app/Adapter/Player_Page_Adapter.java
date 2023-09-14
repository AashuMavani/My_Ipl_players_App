package com.example.my_ipl_players_app.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.my_ipl_players_app.Activity.Players_Details_Activity;
import com.example.my_ipl_players_app.R;

public class Player_Page_Adapter extends PagerAdapter {
    Players_Details_Activity players_details_activity;
    int[] images;
    String[] names;
    String[] subname;
    ImageView player_img;
    TextView players_name;
    TextView players_id;
    public Player_Page_Adapter(Players_Details_Activity players_details_activity, int[] images, String[] names, String[] subname, ImageView player_img, TextView players_name, TextView players_id) {
        this.players_details_activity=players_details_activity;
        this.player_img=player_img;
        this.players_name=players_name;
        this.players_id=players_id;
        this.images=images;
        this.names=names;
        this.subname=subname;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view= LayoutInflater.from(players_details_activity).inflate(R.layout.pager_item,container,false);
      container.addView(view);
       return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
       container.removeView((View) object);
    }
}
