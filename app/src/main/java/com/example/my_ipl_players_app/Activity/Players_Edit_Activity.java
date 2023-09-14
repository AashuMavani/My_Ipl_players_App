package com.example.my_ipl_players_app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.my_ipl_players_app.Adapter.Background_Adapter;
import com.example.my_ipl_players_app.Adapter.Font_Adapter;
import com.example.my_ipl_players_app.Adapter.Gradient_Adapter_1;
import com.example.my_ipl_players_app.Config;
import com.example.my_ipl_players_app.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Players_Edit_Activity extends AppCompatActivity {
    ImageView player_pic_disp;
    TextView player_name_disp, player_subname_disp;
    ImageView expand1, reload1;
    Button background, textcolor, share, font, textsize;
    String images, name, subname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players_edit);
        player_pic_disp = findViewById(R.id.player_pic_disp);
        player_name_disp = findViewById(R.id.player_name_disp);
        player_subname_disp = findViewById(R.id.players_subname_disp);
        expand1 = findViewById(R.id.expand1);
        reload1 = findViewById(R.id.reload1);
        background = findViewById(R.id.background);
        textcolor = findViewById(R.id.textcolor);
        share = findViewById(R.id.share);
        font = findViewById(R.id.font);
        textsize = findViewById(R.id.textsize);


        int image = getIntent().getIntExtra("images", 0);
        String names = getIntent().getStringExtra("names");
        String subname = getIntent().getStringExtra("subname");

        player_pic_disp.setImageResource(image);
        player_name_disp.setText(names);
        player_subname_disp.setText(subname);

        expand1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog dialog = new BottomSheetDialog(Players_Edit_Activity.this);
                dialog.setContentView(R.layout.gradient_gridview_layout_1);
                GridView gridView = dialog.findViewById(R.id.grad_edit_gridview_1);
                Gradient_Adapter_1 adapter = new Gradient_Adapter_1(Players_Edit_Activity.this, Config.gradArr);
                gridView.setAdapter(adapter);
                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        player_pic_disp.setBackgroundResource(Config.gradArr[position]);
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        reload1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int min = 1, max = Config.gradArr.length;
                int r = new Random().nextInt(max - min) + min;
                player_pic_disp.setBackgroundResource(Config.gradArr[r]);
            }
        });
        background.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog dialog = new BottomSheetDialog(Players_Edit_Activity.this);
                dialog.setContentView(R.layout.background_dailog_gridview);
                GridView gridView = dialog.findViewById(R.id.color_gridview);
                Button colorbutton = dialog.findViewById(R.id.colorbutton);
                Background_Adapter adapter = new Background_Adapter(Players_Edit_Activity.this, Config.colorArr);
                gridView.setAdapter(adapter);
                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        player_pic_disp.setBackgroundResource(Config.colorArr[position]);

                    }
                });
                dialog.show();
                colorbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
            }
        });
        textcolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            BottomSheetDialog dialog=new BottomSheetDialog(Players_Edit_Activity.this);
            dialog.setContentView(R.layout.background_dailog_gridview);
            GridView gridView=dialog.findViewById(R.id.color_gridview);
            Button colorbutton=dialog.findViewById(R.id.colorbutton);
            Background_Adapter adapter=new Background_Adapter(Players_Edit_Activity.this,Config.colorArr);
            gridView.setAdapter(adapter);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    player_name_disp.setTextColor(Config.colorArr[position]);
                    player_subname_disp.setTextColor(Config.colorArr[position]);
                    player_name_disp.setTextColor(getResources().getColor(Config.colorArr[position]));
                    player_subname_disp.setTextColor(getResources().getColor(Config.colorArr[position]));

                }
            });
            dialog.show();
            colorbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });

            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bitmap icon = getBitmapFromView(player_name_disp);
                //Intent share = new Intent(Intent.ACTION_SEND);
                Intent share =new Intent(Intent.ACTION_SEND);
                share.setType("image/jpeg");
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                icon.compress(Bitmap.CompressFormat.JPEG, 100, bytes);

                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
                String currentDateandTime = sdf.format(new Date());

                File downloadedFile = new File(Config.file.getAbsolutePath() + "/IMG_" + currentDateandTime + ".jpg");
                try
                {
                    downloadedFile.createNewFile();
                    FileOutputStream fo = new FileOutputStream(downloadedFile);
                    fo.write(bytes.toByteArray());
                    Toast.makeText(Players_Edit_Activity.this,"File Downloaded",Toast.LENGTH_SHORT).show();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }

                share.putExtra(Intent.EXTRA_STREAM, Uri.parse(downloadedFile.getAbsolutePath()));
                startActivity(Intent.createChooser(share, "Share Image"));
            }
        });
        font.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog dialog=new BottomSheetDialog(Players_Edit_Activity.this);
                dialog.setContentView(R.layout.font_dialog_layout);
                GridView gridView=dialog.findViewById(R.id.fontgrid);
                Font_Adapter adapter=new Font_Adapter(Players_Edit_Activity.this,Config.font);
                gridView.setAdapter(adapter);
                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Typeface typeface=Typeface.createFromAsset(getAssets(),Config.font[position]);
                        player_name_disp.setTypeface(typeface);
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        textsize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog dialog=new BottomSheetDialog(Players_Edit_Activity.this);
                dialog.setContentView(R.layout.textsize_layout);
                SeekBar seekBar=dialog.findViewById(R.id.seekbar);
                seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        player_name_disp.setTextSize(2,20+progress);
                        player_subname_disp.setTextSize(2,20+progress);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
    }

    private Bitmap getBitmapFromView(TextView shayariedit)
    {
        //Define a bitmap with the same size as the view
        Bitmap returnedBitmap = Bitmap.createBitmap(shayariedit.getWidth(), shayariedit.getHeight(), Bitmap.Config.ARGB_8888);
        //Bind a canvas to it
        Canvas canvas = new Canvas(returnedBitmap);
        //Get the view's background
        Drawable bgDrawable = shayariedit.getBackground();
        if (bgDrawable != null)
        {
            //has background drawable, then draw it on the canvas
            bgDrawable.draw(canvas);
        }
        else
        {
            //does not have background drawable, then draw white background on the canvas
            canvas.drawColor(Color.WHITE);
        }
        // draw the view on the canvas
        shayariedit.draw(canvas);
        //return the bitmap
        return returnedBitmap;
    }
}