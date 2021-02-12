package com.example.mpractice.myslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.mpractice.R;

public class SecondActivity extends AppCompatActivity {
    ImageView fullimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        fullimage=findViewById(R.id.fullimage);
        Intent intent=getIntent();
        String imageurl=intent.getStringExtra("imageurl");

        Glide.with(this).load(imageurl).into(fullimage);
    }
}