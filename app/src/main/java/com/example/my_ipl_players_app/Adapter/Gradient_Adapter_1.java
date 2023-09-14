package com.example.my_ipl_players_app.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.my_ipl_players_app.Activity.Players_Edit_Activity;
import com.example.my_ipl_players_app.Config;
import com.example.my_ipl_players_app.R;

public class Gradient_Adapter_1 extends BaseAdapter {
    Players_Edit_Activity players_edit_activity;
    int[] gradArr;
    public Gradient_Adapter_1(Players_Edit_Activity players_edit_activity, int[] gradArr) {
        this.players_edit_activity=players_edit_activity;
        this.gradArr=gradArr;
    }

    @Override
    public int getCount() {
        return gradArr.length;
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
        view= LayoutInflater.from(players_edit_activity).inflate(R.layout.gradient_dialog_layout_1,parent,false);
        ImageView imageView=view.findViewById(R.id.grad_item_1);

        imageView.setBackgroundResource(gradArr[position]);
        return view;
    }
}
