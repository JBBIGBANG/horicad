package com.matuya.horicad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class dhormoprocar extends AppCompatActivity {
   private WebView webView;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhormoprocar);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        MobileAds.initialize(this, "ca-app-pub-1628835868187039~6690540129");

      webView=(WebView)findViewById(R.id.dhormoprocar);
        webView.loadUrl("file:///android_asset/"+"dhormopocar.html");



    }
}
