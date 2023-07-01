package com.example.Noah_AppDev_Ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity {
    MediaPlayer mySong;
    Button ld,gt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        mySong=MediaPlayer.create(About.this,R.raw.follow);
        gt=findViewById(R.id.gt);
        ld=findViewById(R.id.ld);




        gt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/nouhship88"));
                startActivity(intent);
            }
        });

        ld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.linkedin.com/in/noah-shanta/"));
                startActivity(intent);
            }
        });


    }

    public void playIT(View v){
    mySong.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mySong.release();
    }
}
