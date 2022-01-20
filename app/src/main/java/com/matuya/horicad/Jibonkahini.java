package com.matuya.horicad;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Jibonkahini extends AppCompatActivity {
 private Button b_horicad;
 private Button b_goracad;
 private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jibonkahini);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        MobileAds.initialize(this, "ca-app-pub-1628835868187039~6690540129");





        ImageView imageView = (ImageView) findViewById(R.id.image1);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.horicad);
        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        roundedBitmapDrawable.setCircular(true);
        imageView.setImageDrawable(roundedBitmapDrawable);


        ImageView image = (ImageView) findViewById(R.id.image2);
        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.gurucad);
        RoundedBitmapDrawable roundedBitmapDrawable1 = RoundedBitmapDrawableFactory.create(getResources(), bitmap1);
        roundedBitmapDrawable1.setCircular(true);
        image.setImageDrawable(roundedBitmapDrawable1);

        //b_horicad
        b_horicad=(Button)findViewById(R.id.b_horicad);
        b_horicad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHoricadThakur();
            }
        });

        //b_gurucad
        b_goracad=(Button)findViewById(R.id.b_goracad);
        b_goracad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGurucadThakur();
            }
        });




    }
    //gurucad Thakur
    private void openGurucadThakur() {
        Intent intent=new Intent(this,GurucadThakur.class);
        intent.putExtra("b_goracad","invisible");
        startActivity(intent);
    }
     //Horicad thakur
    private void openHoricadThakur() {
        Intent intent=new Intent(this,HoricadThakur.class);
                intent.putExtra("b_horicad","invisible");
           startActivity(intent);
    }

}
