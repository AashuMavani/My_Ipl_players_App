package com.example.my_ipl_players_app.Adapter;

import static android.graphics.Typeface.createFromAsset;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.my_ipl_players_app.Activity.Players_Edit_Activity;
import com.example.my_ipl_players_app.R;

public class Font_Adapter extends BaseAdapter {
    Players_Edit_Activity players_edit_activity;
    String[] font;

    public Font_Adapter(Players_Edit_Activity players_edit_activity, String[] font) {
        this.players_edit_activity = players_edit_activity;
        this.font = font;
    }

    @Override
    public int getCount() {
        return font.length;
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
        view = LayoutInflater.from(players_edit_activity).inflate(R.layout.font_layout_item, parent, false);
        TextView textView = view.findViewById(R.id.font_item);
        Typeface typeface = Typeface.createFromAsset(players_edit_activity.getAssets(), font[position]);
        textView.setTypeface(typeface);
        return view;
    }
}
