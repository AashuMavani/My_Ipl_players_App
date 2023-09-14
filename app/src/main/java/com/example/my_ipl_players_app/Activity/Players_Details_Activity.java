package com.example.my_ipl_players_app.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.my_ipl_players_app.Adapter.Gradient_Adapter;
import com.example.my_ipl_players_app.Adapter.Player_Page_Adapter;
import com.example.my_ipl_players_app.Config;
import com.example.my_ipl_players_app.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.Random;

public class Players_Details_Activity extends AppCompatActivity {
    ImageView player_img, expand, reload, copy, previous, pencil, next, share;
    TextView players_name, players_id, number;
    int position;
   ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players_details);
        player_img = findViewById(R.id.player_img);
        players_name = findViewById(R.id.players_name);
        expand = findViewById(R.id.expand);
        players_id = findViewById(R.id.players_id);
        reload = findViewById(R.id.reload);
        copy = findViewById(R.id.copy);
        previous = findViewById(R.id.previous);
        pencil = findViewById(R.id.peancil);
        next = findViewById(R.id.next);
        share = findViewById(R.id.share);
        number = findViewById(R.id.number);

        position = getIntent().getIntExtra("position", 0);
        int[] images = getIntent().getIntArrayExtra("imagearr");
        String[] names = getIntent().getStringArrayExtra("namearr");
        String[] subname = getIntent().getStringArrayExtra("idarr");


        player_img.setImageResource(images[position]);
        players_name.setText(names[position]);
        players_id.setText(subname[position]);

        expand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog dialog = new BottomSheetDialog(Players_Details_Activity.this);
                dialog.setContentView(R.layout.grad_gridview_layout);
                GridView gridView = dialog.findViewById(R.id.grad_gridview);
                Gradient_Adapter adapter = new Gradient_Adapter(Players_Details_Activity.this, Config.gradArr);
                gridView.setAdapter(adapter);
                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        player_img.setBackgroundResource(Config.gradArr[position]);
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        number.setText((position + 1) + "/11");

        reload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int min = 1, max = Config.gradArr.length;
                int r = new Random().nextInt(max - min) + min;
                player_img.setBackgroundResource(Config.gradArr[r]);
            }
        });
        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                



                Toast.makeText(Players_Details_Activity.this, "Copied to clipboard", Toast.LENGTH_SHORT).show();

             }
         });
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position>0)
                {
                  player_img.setImageResource(images[position]);
                  players_name.setText(names[position]);
                  players_id.setText(subname[position]);
                  position--;
                  number.setText((position+1)+"/"+(images.length-1));
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position<images.length-1)
                {

                    player_img.setImageResource(images[position]);
                    players_name.setText(names[position]);
                    players_id.setText(subname[position]);
                    position++;
                    number.setText((position+1)+"/"+(images.length-1));
                }
            }
        });

        pencil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Players_Details_Activity.this, Players_Edit_Activity.class);

                intent.putExtra("images",images[position]);
                intent.putExtra("names",names[position]);
                intent.putExtra("subname",subname[position]);
                startActivity(intent);
            }
        });
             share.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     Intent intentt = new Intent(Intent.ACTION_SEND);

                     // setting type of data shared as text
                     intentt.setType("img/plain");
                     intentt.setType("text/plain");
                     intentt.setType("text/plain");
                     //intentt.putExtra(Intent.EXTRA_SUBJECT, "Subject Here");

                     // Adding the text to share using putExtra
                     intentt.putExtra(Intent.EXTRA_ASSIST_CONTEXT, player_img.getImageTintList());
                     intentt.putExtra(Intent.EXTRA_TEXT,players_name.getText().toString());
                     intentt.putExtra(Intent.EXTRA_TEXT, players_id.getText().toString());
                     startActivity(Intent.createChooser(intentt, "Share Via"));
                 }
             });
        Player_Page_Adapter pageAdapter=new Player_Page_Adapter(Players_Details_Activity.this,images,names,subname,player_img,players_name,players_id);
        viewPager=findViewById(R.id.viewpager);
        viewPager.setAdapter(pageAdapter);
        viewPager.setCurrentItem(position);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
            player_img.setImageResource(images[position]);
            players_name.setText(names[position]);
            players_id.setText(subname[position]);
            number.setText((position+1)+"/"+images.length);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}