package com.matuya.horicad;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Developer extends AppCompatActivity {
 private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);


        ImageView dham = (ImageView) findViewById(R.id.joyp);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ll);
        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        roundedBitmapDrawable.setCircular(true);
        dham.setImageDrawable(roundedBitmapDrawable);


        image=(ImageView) findViewById(R.id.joyp);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennewActivity("about.html");
            }
        });



    }

    private void opennewActivity(String filename) {
        Intent intent=new Intent(this,newActivity.class);
        intent.putExtra("filename",filename);
        startActivity(intent);

    }


}
